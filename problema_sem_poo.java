import java.util.Scanner;
import java.util.Locale;
public class problema_sem_poo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x1, x2, x3, y1, y2, y3, areax, px, py, areay;
		
		System.out.println("Enter the measures of triangle X: ");
		
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		px = (x1 + x2 + x3)/2;
		
		py = (y1 + y2 + y3)/2;
		
		areax = Math.sqrt(px * (px - x1) * (px - x2) * (px - x3));
		
		areay = Math.sqrt(py * (py - y1) * (py - y2) * (py - y3));
		
		System.out.printf("Triangle X area: %.4f%n", areax);
		System.out.printf("Triangle Y area: %.4f%n", areay);
		
		if (areax > areay) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
