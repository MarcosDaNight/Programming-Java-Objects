import java.util.Scanner;
import java.util.Locale;
import entites.Product;

public class Estoque_POO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Product product = new Product();
		System.out.println("Enter the product data:");
		System.out.println("Name: ");
		
		product.name = sc.nextLine();
		System.out.println("Price:");
		product.price = sc.nextDouble();
		System.out.println("Quantity:");
		product.quantity = sc.nextInt();
		
		//System.out.println(product);
		System.out.println(product.toString());
		
		
		sc.close();
	}

}
