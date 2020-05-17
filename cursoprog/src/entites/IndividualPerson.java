package entites;

public class IndividualPerson extends TaxPlayer{
	
	private Double healthSpending;
	
	public IndividualPerson() {
		super();
	}

	public IndividualPerson(String name, Double anualInCome, Double healthSpending) {
		super(name, anualInCome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	/**
	 * Calculating the respective taxes for each value and spent.
	 */
	@Override
	public Double tax() {
		if (super.getAnualInCome() < 20000) {
			return super.getAnualInCome() * 0.15 - (healthSpending * 0.5);
		}
		else {
			return super.getAnualInCome() * 0.25 - (healthSpending * 0.5);
		}
	}

}
