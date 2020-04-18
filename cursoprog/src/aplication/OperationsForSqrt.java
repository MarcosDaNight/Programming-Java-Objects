package aplication;

public class OperationsForSqrt {
	public final static double PI = 3.14159;

	public double sqrt(double radius) {
		return Math.sqrt(radius);
	}
	
	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
	public static double volume(double radius) {
		return 4 * PI * radius * radius * radius / 3;
	}
	
//	public static double PI() {
//		return PI;
//	}
}
