package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entites.AccountHeranca;
import entites.BusinessAccount;
import entites.SavingsAccount;

public class ClassesAbristratasProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<AccountHeranca> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01 ));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0 ));
		list.add(new SavingsAccount(1004, "Bob", 500.00, 0.01 ));
		list.add(new BusinessAccount(1005, "Marcos", 8500.00, 1200.0 ));
		
		double sum = 0.0;
		for (AccountHeranca acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (AccountHeranca acc : list) {
			acc.deposit(10.0);
		}
		
		for (AccountHeranca acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n",acc.getNumber(),  acc.getBalance());
		}
	}

}
