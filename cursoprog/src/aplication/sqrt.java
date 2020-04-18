package aplication;
import java.util.Locale;
import java.util.Scanner;

public class sqrt {
	/**
	 * A PI value in static method class
	 * @author Marcos Gostoso
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/**
		 * @author Marcos Gostoso
		 * This program read and calculates a value
		 * of circumference radius, an cilindric volume
		 * and PI value
		 */
		
		System.out.println("Enter the radius number: ");
		double radius = sc.nextDouble();
		
		OperationsForSqrt ofs = new OperationsForSqrt();
		
		double circumference = ofs.circumference(radius);
		double volume = ofs.volume(radius);
		double PI = ofs.PI();
		
		System.out.printf("Circumference: %.2f%n", circumference);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
	}

}
