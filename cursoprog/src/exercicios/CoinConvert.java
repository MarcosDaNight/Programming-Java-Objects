package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CoinConvert {

	public static void main(String[] args) {
		/**
		 * This program consist in a coin convert using IOF taxa and the respective value of each coin
		 * @author Marcos Gostoso
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Whats is a dollar price? ");
		
		double dolarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		double result = CurrencyConvert.Convert(dolarPrice, quantity);
		
		System.out.printf("Amout to be paid in reais = %.2f%n", result);
		
		sc.close();
		
	}

}
