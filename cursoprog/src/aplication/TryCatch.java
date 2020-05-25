package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of Program");
		
		
	}
	public static void method1() {
		System.out.println("Method 1 Start");
		
		method2();
		
		System.out.println("Method 1 End");
	}
	
	public static void method2() {
		System.out.println("Method 2 Start");
		
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
		}
		catch (InputMismatchException e) {
			System.out.println("Input Error");
		}
		sc.close();
		System.out.println("Method 2  end");
	}
}
