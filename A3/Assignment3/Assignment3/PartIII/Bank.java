import java.util.Scanner;

public class Bank {

	public static final int NUM_ACCOUNTS = 5;
	private Account[] accounts = new Account[NUM_ACCOUNTS];
	
	
	public Bank() {
		for(int i=0;i<NUM_ACCOUNTS;i++) {
			accounts[i] = new Account(1500);
		}
	}
	
	public Account[] getAllAccounts() {
		return accounts;
	}
	

	public Account getAccountById(int id) {
		
		for(int i=0;i<accounts.length;i++) {
			int x = accounts[i].getId();
			if (x==id) {
				return accounts[i];
			}
		}
		
		return null;
	}
	
	public int numAccounts() {
		
		return accounts.length;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Bank bank = new Bank();
		
		
		
		for (;;) {
			System.out.println("Accounts:");
			Account[] accounts = bank.getAllAccounts();
			for (int i=0;i< accounts.length;i++) {
				System.out.println("Account " + accounts[i].getId() + 
						": $" + accounts[i].getBalance());
			}
			System.out.print("Enter source account: ");
			int srcAccountId = in.nextInt();
			Account srcAccount = bank.getAccountById(srcAccountId);
			if (srcAccount == null) {
				System.out.println("no such account id. Starting over");
				continue;
			}
			System.out.print("Enter destination account: ");
			int destAccountId = in.nextInt();
			Account destAccount = bank.getAccountById(destAccountId);
			if (destAccount == null) {
				System.out.println("no such account id. Starting over");
				continue;
			}
			System.out.print("Enter transfer amount: ");
			double transferAmount = in.nextDouble();
			boolean withdrawlResult = srcAccount.withdraw(transferAmount);
			if (withdrawlResult) {
				destAccount.deposit(transferAmount);
			} else {
				System.out.println("cannot withdraw more money than is in account");
				continue;
			}
		}
	}
}
