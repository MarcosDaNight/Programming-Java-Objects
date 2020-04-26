package aplication;

import java.util.Scanner;

import entites.QuartosPensionato;

public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		QuartosPensionato[] vetor = new QuartosPensionato[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		
		for (int i=1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			
			sc.nextLine();
			
			String name = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			System.out.println("Room: ");
			
			int room = sc.nextInt();
		
			vetor[room] = new QuartosPensionato(name, email);
		}
	
		System.out.println();
		System.out.println("Busy Rooms: ");
		
		for (int i=0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": "+vetor[i]);
			}
		}
		sc.close();
	}

}
