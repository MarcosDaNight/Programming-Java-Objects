package entites;

public class Account {
	
	/**
	 * A conta de ve conta deve coletar o respecitivo número
	 * O nome do titular
	 * E Se ele quer ou não fazer o depósito
	 */
	private int number;//Account Number
	private String holder;//Account Name holder
	private double balance;//Account Balance
	
	
	
	public Account(int number, String holder) {
			this.number = number;
			this.holder = holder;
		
	}
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
		
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdrawn(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
		+ number
		+", Holder: "
		+ holder
		+", Balance: $"
		+ String.format("%.2f", balance);
	}
	
}
