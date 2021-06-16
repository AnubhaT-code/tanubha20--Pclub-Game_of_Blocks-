// SPDX-License-Identifier: MIT
pragma solidity >=0.4.25 <0.7.0;

contract MetaCoin {
	mapping (address => uint256) balances;

	event Transfer(address indexed _from, address indexed _to, uint256 _value);

	constructor() public {
		balances[tx.origin] = 100000;
	}

	function sendCoin(address receiver, uint256 amount, address sender) public returns(bool sufficient) {
		if (balances[sender] < amount) return false;
		balances[sender] -= amount;
		balances[receiver] += amount;
		emit Transfer(sender, receiver, amount);
		return true;
	}


	function getBalance(address addr) public view returns(uint256) {
		return balances[addr];
	}
}


contract Loan is MetaCoin {

    mapping (address => uint256) private loans;
    mapping (uint256 => address) private creditors;
    uint256 count;
    
     
    event Request(address indexed _from, uint256 P, uint R, uint T, uint256 amt);
    
    address private Owner;

    modifier isOwner() {
        require(msg.sender == Owner,"Caller is not owner");
        _;
        // A modifier to allow only the owner of the contract to use specific functions
    }
    
    constructor() public {
        Owner=msg.sender;
        //// Creator of the contract is made the Owner.
        count=0;
    }
    
    function mulDiv (uint256 x, uint256 y, uint256 z) internal pure returns (uint256) {
        return (x * y) / z;
    }
    
    function add(uint256 a,uint256 b) internal pure returns(uint256)
    {
        return a+b;
    }
    
    function getCompoundInterest(uint256 principle, uint rate, uint time) public pure returns(uint256) {
    		// Anyone is able to use this function to calculate the amount of Compound interest for given P, R, T
    		for(uint i=time; i>0;i--)
            principle = add (principle, mulDiv (rate, principle, 10^18));
            return principle;
            // Solidity does not have a good support for fixed point numbers so we input the rate as a uint
    }
    
    function reqLoan(uint256 principle, uint rate, uint time) public returns(bool correct) {
        uint256 toPay = getCompoundInterest(principle, rate, time);
         if(toPay < principle) {
            return false;
            //Return false if adding to the mapping failed (maybe the user entered a float rate, there were overflows and toPay comes to be lesser than principle, etc.)
        }
        else {
            creditors[count] = msg.sender;
            count++;
            loans[msg.sender] = toPay;
            emit Request(msg.sender,principle,rate,time,toPay);
            // emit the Request event after succesfully adding to the mapping, and return true. 
            return true;
        }
        // A creditor uses this function to request the Owner to settle his loan, and the amount to settle is calculated using the inputs.
        // Add appropriate definition below to store the loan request of a contract in the loans mapping,
        // Also
    }
    
    function getOwnerBalance() public view returns(uint256) {
        
        uint B =MetaCoin.getBalance(Owner);
        return B;
				// use the getBalance function of MetaCoin contract to view the Balance of the contract Owner.
		}
		
    function viewDues(address addr) public view isOwner returns(uint256) {      // allows *ONLY* the owner to *view* his loans 
    
	    //Takes in the address of a creditor as arguments
	    //It returns a uint256 corresponding to the due amount, and does not modify any state variables.
	    return loans[addr];
	}
	
	function settleDues(address addr) public isOwner returns (bool correct) {      //allows *ONLY* the owner to *settle* his loans 
	//Takes in the address of a creditor as arguments
	    uint256 CurrentValue = MetaCoin.getBalance(Owner) ;
	    //sendCoin function of MetaCoin contract sends the coins required for settling the dues.
	    bool val= MetaCoin.sendCoin(addr, loans[addr], Owner);
	    if(CurrentValue - loans[addr] < 0 || val==false ) {
	        return false;
	    }
	    else {
	        loans[addr]=0;//pending loan is set to 0 after settling the dues.
	        return true;
	    }
	    // It returns a bool, true if the dues were settled and false otherwise.
	}
}
