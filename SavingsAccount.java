package BankingSystem;

public class SavingsAccount extends BankAccount{
	private double withdrawallimits;

	public SavingsAccount(double initialBalance, double withdrawallimits) {
		// TODO Auto-generated constructor stub
		super(initialBalance);
		this.withdrawallimits = withdrawallimits;
	}
	
	//override
	public void withdraw(double amount) {
		if (amount <= withdrawallimits) {
			super.withdraw(amount);
		}
		
		else {
			System.out.println("Withdrawal Limit Has Exceeded.");
		}
	}

}
