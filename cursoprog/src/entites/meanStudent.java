package entites;

public class meanStudent {
	public String name;
	public double note1;
	public double note2;
	public double note3;

	
	public double totalMean() {
		return note1 + note2 + note3;
	}
	
	public double missingPoints() {
		if (totalMean() < 60) {
			return 60 - totalMean();
		}
		else {
			return 0.00;
		}
	
	}

}
