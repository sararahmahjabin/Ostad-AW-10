package BankingSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount savingsaccount = new SavingsAccount(3000, 750);
		BankAccount checkingaccount = new CheckingAccount(2000, 100);
		
		withdrawfromaccount(savingsaccount, 500);
		withdrawfromaccount(checkingaccount, 250);
		
		System.out.println("Savings Account Balance: " + savingsaccount.getBalance());
		System.out.println("Checking Account Balance: " + checkingaccount.getBalance());
		

	}
	
	public static void withdrawfromaccount(BankAccount account, double amount) {
		account.withdraw(amount);
		
	}

}