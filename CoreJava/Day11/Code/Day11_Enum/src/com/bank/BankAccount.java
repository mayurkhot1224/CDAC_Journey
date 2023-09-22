package com.bank;

public class BankAccount {

	private int actid;
	private String name;
	private String email;
	private double balance;
	private AccountType actType;
	
	//has-a
	private Date doc;

	public BankAccount(int actid, String name, String email, double balance, AccountType actType, Date doc) {
		super();
		this.actid = actid;
		this.name = name;
		this.email = email;
		this.balance = balance;
		this.actType = actType;
		this.doc = doc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AccountType getActType() {
		return actType;
	}

	public void setActType(AccountType actType) {
		this.actType = actType;
	}

	public Date getDoc() {
		return doc;
	}

	public void setDoc(Date doc) {
		this.doc = doc;
	}

	public int getActid() {
		return actid;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [actid=" + actid + ", name=" + name + ", email=" + email + ", balance=" + balance
				+ ", actType=" + actType + ", doc=" + doc + "]";
	}
	
	
	
}
