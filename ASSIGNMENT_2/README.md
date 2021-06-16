
A smart contract called MetaCoin, implements :-

1.A basic token which the accounts can give to each other with the sendCoin(...) function 

2.See their balance with the getBalance function. I tried to make a smart contract extending the functionality of the MetaCoin to provide functionality
  of acting as a loan deposit and settling contract.

Owner of the Loan contract had initial balance of 100K MetaCoins, as in the constructor of the MetaCoin class.

Functions in Loan contract-

1. getCompoundInterest : It is pure function. Allows anyone to use it to calculate the amount of interest for given values of P, R, T (in years).

2. reqLoan: ( neither view nor pure - because it is modifying state variables and emitting events ) 
   Anyone is able to use it to request the Owner to settle his loan. The P, R, T entered is used to calculate the dues, and is added to a mapping. It should emit the Request      event.

3. getOwnerBalance: It is view function. Anyone can use it to get the amount of MetaCoins owned by the owner. Here I made use of MetaCoin contract's getBalance() to implement this using inheritance.

4. viewDues : (Function Modifier- isOwner ) only the owner can access this to view the amount of loan he owes to the input address, which is stored in the loans mapping. 

5. settleDues: (Function Modifier- isOwner ) only the owner can use this to settle the amount of loan he owes to the input address, use MetaCoin's sendCoin function to settle these dues, with appropriate checks for the return values from sendCoin.

Other Functions used:-

1.mulDiv :(internal and pure) to multiply and divide.

2.add :(internal and pure ) to add.


