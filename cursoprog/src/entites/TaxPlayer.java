package entites;

public abstract class TaxPlayer {
	
	private String name;
	private Double anualInCome;

	public TaxPlayer() {
		
	}
	public TaxPlayer(String name, Double anualInCome) {
		this.name = name;
		this.anualInCome = anualInCome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualInCome() {
		return anualInCome;
	}

	public void setAnualInCome(Double anualInCome) {
		this.anualInCome = anualInCome;
	}
	
	/**
	 * Using the abstract class to be able to differentiate the type of user through the sub-classes.
	 * @return Void
	 */
	public abstract Double tax();
	
}
