package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.CompanyPerson;
import entites.IndividualPerson;
import entites.TaxPlayer;

public class TaxesProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/**
		 * Building a list to store the number of taxes collected.
		 */
		List<TaxPlayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax players: ");
		int num = sc.nextInt();
		
		/**
		 * Using finite loop to pass instructions to the user, collecting their data.
		 */
		for(int i=1; i <= num; i++) {
			System.out.println("Tax player #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			if(type != 'c'|| type != 'i') {
				System.out.print("This type is not available. Please enter the characters i or c in the lowcase: ");
				type = sc.next().charAt(0);
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualInCome = sc.nextDouble();
			/**
			 * Distinguishing the type of user to calculate rates.
			 */
			if (type == 'i') {
				System.out.print("Heath expenditures: ");
				double healthSpending = sc.nextDouble();
				list.add(new IndividualPerson(name, anualInCome, healthSpending));
				
			}
			else  if (type == 'c'){
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new CompanyPerson(name, anualInCome, numberEmployees));
			}
			
		}
		System.out.println();
		System.out.println("Taxes Paid: ");
		
		/**
		 * Printing the calculated values ​​and the total in due format.
		 */
		double sum = 0.0;
		for(TaxPlayer tp : list) {
			double tax =  tp.tax();
			System.out.println(tp.getName() + ": $ "+ String.format("%.2f", tax));
			sum +=  tax;
			
		}
		System.out.println("Total taxes: "+ String.format("%.2f", sum));	
		sc.close();
	}

}
