package com.example3;

public class BankAccountController extends BankAccount {
	public BankAccountController(Long accountId, String accountHolderName, String accountType, Double accountBalnce) {
		super(accountId, accountHolderName, accountType, accountBalnce);
		// TODO Auto-generated constructor stub
	}

	public double withdraw(long accountId, double balance ) {
		return 0;
	}
	
	public double deposit(long accountId, double balance) {
		return 0;
	}
	
	public double getBalance(long accountId){
        return 0;
    }
    public boolean fundTransfer(long fromAccount, long toAccount){
        return false;
    }
	
}
