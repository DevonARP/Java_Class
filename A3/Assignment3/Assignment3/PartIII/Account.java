 
public class Account {

	private static int account_count = 0;
	private double balance = 0;
	private int id = 0;
	
	public Account() {
		account_count = account_count + 1;
		id = account_count;
	}
	
	public Account(double bal) {
		account_count = account_count + 1;
		id = account_count;
		balance = bal;
	}
	
	public boolean withdraw(double wd) {
		if (balance<=wd) {
			return false;
		} else {
			balance=balance-wd;
			return true;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double dep) {
		if (dep>0) {
			balance = balance + dep;
		}
	}
	
	public int getId() {
		return id;
	}
	
}
