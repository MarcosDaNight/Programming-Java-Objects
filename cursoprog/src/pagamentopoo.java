import java.util.Scanner;
import java.util.Locale;
import entites.Salary;
public class pagamentopoo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salary sa = new Salary();
		
		System.out.print("Name:");
		sa.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		sa.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		sa.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + sa);
		System.out.println();
		
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		sa.increaseSalary(percentage);
		
		System.out.println("Updated data: " + sa);
		
		sc.close();
	}

}
