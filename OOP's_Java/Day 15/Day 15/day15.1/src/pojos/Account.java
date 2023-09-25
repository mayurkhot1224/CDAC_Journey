package pojos;

//id | name | type | bal
public class Account {
	private int acctNo;
	private String customerName;
	private String type;
	private double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int acctNo, String customerName, String type, double balance) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.type = type;
		this.balance = balance;
	}
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [acctNo=" + acctNo + ", customerName=" + customerName + ", type=" + type + ", balance="
				+ balance + "]";
	}
	
}
