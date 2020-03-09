package exercise_03;

public class BankAccount {
	private final static double DEFAULT_INTEREST_RATE = 0.02;
	private static double interestRate = DEFAULT_INTEREST_RATE;
	private static int bankAccountCount = 1;
	private int id;
	private double balance;

	public BankAccount() {

		this.id = bankAccountCount++;

	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		BankAccount.interestRate = interestRate;
	}

	void deposit(double amount) {
		this.balance += amount;
	}

	double getInterest(int years) {
		return BankAccount.interestRate * years * this.balance;
	}

	public static int getBankAccountCount() {
		return bankAccountCount;
	}
	
}
