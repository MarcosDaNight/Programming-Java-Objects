import java.util.Scanner;
import java.util.Locale;
import entites.meanStudent;

public class TestAvalible {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		meanStudent mean = new meanStudent();
		
		mean.name = sc.nextLine();
		mean.note1 = sc.nextDouble();
		mean.note2 = sc.nextDouble();
		mean.note3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + mean.totalMean());
		if (mean.totalMean() > 60.00) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + mean.missingPoints() + " POINTS");
		}
		
		sc.close();
	}

}
