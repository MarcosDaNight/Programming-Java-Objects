package BancoExercicio;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;

public class Main {
	/**
	 * O programa deve gerar um número para conta que seja estático
	 * O programa pode alterar o nome do titular
	 * O prograva pode realizar saques e depósito
	 * A acada saque, é cobrada a taxa de $ 05.00, podendo assim
	 * negativar a conta caso não haja saldo suficiente
	 * 
	 * @author Marcos Gostoso
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char awnser = sc.next().charAt(0);
		if (awnser == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
			
		}
		
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(account);//Mostrando dados da conta
		
		/**
		 * Deposito
		 * @author Marcos Gostoso
		 */
		System.out.println("Enter a deposit value:");
		
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);//Mostrando dados da conta
		
		
		/**
		 * Saque
		 * @author Marcos Gostoso
		 */
		System.out.println("Enter a withdraw value: ");
		
		double withdrawValeu = sc.nextDouble();
		account.withdrawn(withdrawValeu);
		System.out.println("Update account data: ");
		System.out.println(account);//Mostrando dados da conta
		
		sc.close();
		
	}

}
