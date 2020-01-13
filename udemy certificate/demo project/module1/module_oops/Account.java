package module1.module_oops;

public class Account {

	private String accountNumber;
	private int Accountbalance;
	public Account(String accountNumber, int Accountbalance) {
		super();
		this.accountNumber = accountNumber;
		this.Accountbalance = Accountbalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return Accountbalance;
	}
}
