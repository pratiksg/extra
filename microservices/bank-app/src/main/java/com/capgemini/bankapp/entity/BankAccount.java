package com.capgemini.bankapp.entity;

public class BankAccount {
	private long accountId;
	private String accountHolderName;
	private double accountBalance;
	
	public BankAccount() {
		super();
	}
	
	
	public BankAccount(long accountId, String accountHolderName, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		
		this.accountBalance = accountBalance;
	}
	
	
	
	public BankAccount(String accountHolderName2, double accountBalance2) {
		// TODO Auto-generated constructor stub
	}


	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	
	

}
