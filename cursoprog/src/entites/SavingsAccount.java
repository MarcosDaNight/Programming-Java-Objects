package entites;

public class SavingsAccount extends AccountHeranca{
	
	private Double interestRate;

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//The same method using in the account, this is possible per cause of the overlap
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
