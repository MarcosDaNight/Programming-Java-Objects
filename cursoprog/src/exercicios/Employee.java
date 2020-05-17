package exercicios;

public class Employee {
	
	private String Name;
	private Integer hours;
	private Double valuePerHour;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		super();
		Name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double paymant() {
		return valuePerHour * hours;
		
	}

}
