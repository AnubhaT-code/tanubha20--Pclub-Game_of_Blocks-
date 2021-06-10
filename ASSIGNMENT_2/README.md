A smart contract called MetaCoin, implements :-
1.A basic token which the accounts can give to each other with the sendCoin(...) function 
2.See their balance with the getBalance function. I tried to make a smart contract extending the functionality of the MetaCoin to provide functionality
  of acting as a loan deposit and settling contract.

 Owner of the Loan contract had initial balance of 100K MetaCoins, as in the constructor of the MetaCoin class.
Functions in Loan contract-
1. getCompoundInterest : It is pure function because it is reading state variables.
2. reqLoan: 
3. getOwnerBalance: 
4. viewDues : 
5. settleDues: 