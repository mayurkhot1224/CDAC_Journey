package com.bank;

//OuterClass:BankAccount
public class BankAccount {
	private int actid;
	private String name;
	private double balance;
//has -a
	private Locker locker;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getActid() {
		return actid;
	}

	public double getBalance() {
		return balance;
	}

	public BankAccount(int actid, String name, double balance) {
		super();
		this.actid = actid;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		if (locker == null) {
			System.out.println("No Locker Assigned Yet:");
			return "BankAccount [actid=" + actid + ", name=" + name + ", balance=" + balance + "]";
		} else {
			return "BankAccount [actid=" + actid + ", name=" + name + ", balance=" + balance + "  " + locker;
		}
	}

//create a method for assigning locker to account
	public void assignLocker(int duration) {
		locker = new Locker(duration);
		locker.calculateCharges();
	}

//create class inside another class:inner class/nested class(class inside class)

//Inner Class:Locker
	private class Locker {
		// can we add data members in innner class:Yes
		private int lockerId;// Lab:generate auto lockerId
		private int duration;
		private double charges;

		// can we add constr in inner class:YES
		Locker(int duration) {
			this.duration = duration;
			this.charges = 5000;
		}

		public void calculateCharges() {
			System.out.println("Total Charge=" + duration * charges);
		}

		// can we override toString():yes
		public String toString() {
			System.out.println("Locker Get Created For AccountId=" + actid);
			return "Duration:" + duration + "  Charges=" + charges;
		}
		// can we have getter setter and other methods in innner class:YES

	}// end of inner class

}// end of Outer Class
