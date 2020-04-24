package aplication;

import java.util.Locale;
import java.util.Scanner;


import entites.ProductArray;

public class ProgramArray {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Quantity of products has addicioned in array
		 * @author Marcos Gostoso
		 */
		int n = sc.nextInt();
		ProductArray[] vetor = new ProductArray [n];//Calling the class to use its parameters and add values ​​to arrays
		
		/**
		 * @param used to scroll through the matrix and place each value in its respective vector, name and price
		 * 
		 */
		
		double sum = 0.0;//Sum all prices
		for (int i=0; i < vetor.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextInt();
			sum += price;
			
			vetor[i] = new ProductArray(name, price);	
		}
		
		double avg = sum / vetor.length;//average prices per product
		
		System.out.printf("Average Prices = U$ %.2f%n", avg);
		
		sc.close();

	}

}
