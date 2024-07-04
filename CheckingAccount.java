package BankingSystem;

public class CheckingAccount extends BankAccount {
	private double overdraftfees;

	public CheckingAccount(double initialBalance, double overdraftfees) {
		// TODO Auto-generated constructor stub
		super(initialBalance);
		this.overdraftfees = overdraftfees;
	}
	
	//Override
	
	public void withdraw(double amount) {
		if(amount <= getBalance()) {
			super.withdraw(amount);
		}
		
		else {
			System.out.println("Overdraft Fees Applied. ");
			super.withdraw(amount + overdraftfees);
		}
	}

}
