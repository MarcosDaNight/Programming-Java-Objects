package aplication;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entites.Employee;

public class programSalary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Employee> list = new ArrayList<>();
		
		// 1 - Reading Data:
		
		
		System.out.println("How many emploeeys will be registred? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Emploee#" + i + ": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		
		// 2 - Updating Salary of Given Employee:
		
		System.out.println();
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
			
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.salaryIncrease(percentage);
		}
		
		// 3 - Listinig Employess:
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 

	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
