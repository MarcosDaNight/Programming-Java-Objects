package aplication;

public class OperationsForSqrt {
	private final static double PI = 3.14159;

	public double sqrt(double radius) {
		return Math.sqrt(radius);
	}
	
	public double circumference(double radius) {
		return 2 * PI * radius;
	}
	public double volume(double radius) {
		return 4 * PI * radius * radius * radius / 3;
	}
	
	public double PI() {
		return PI;
	}
}
