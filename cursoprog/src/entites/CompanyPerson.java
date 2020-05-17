package entites;

public class CompanyPerson extends TaxPlayer{
	
	private Integer numberEmployees;
	
	public CompanyPerson() {
		super();
	}

	public CompanyPerson(String name, Double anualInCome, Integer numberEmployees) {
		super(name, anualInCome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	/**
	 * Calculating the respective taxes for each value and employees number.
	 */
	@Override
	public Double tax() {
		if (numberEmployees > 10) {
			return super.getAnualInCome() * 0.14;
		}
		else {
			return super.getAnualInCome() * 0.16;
		}
	}
}
