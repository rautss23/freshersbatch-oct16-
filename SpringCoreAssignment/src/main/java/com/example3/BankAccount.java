package com.example3;

public class BankAccount {
	private Long accountId;
	private String accountHolderName;
	private String accountType;
	private Double accountBalnce;

	public BankAccount(Long accountId, String accountHolderName, String accountType, Double accountBalnce) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalnce = accountBalnce;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getAccountBalnce() {
		return accountBalnce;
	}

	public void setAccountBalnce(Double accountBalnce) {
		this.accountBalnce = accountBalnce;
	}

	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", accountBalnce=" + accountBalnce + "]";
	}

}
