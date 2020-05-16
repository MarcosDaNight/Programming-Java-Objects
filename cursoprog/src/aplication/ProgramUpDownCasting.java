package aplication;

import entites.AccountHeranca;
import entites.BusinessAccount;
import entites.SavingsAccount;

public class ProgramUpDownCasting {

	public static void main(String[] args) {

		AccountHeranca acc = new AccountHeranca(1000, "Marcos", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Lara", 0.0, 500.0);
		
		//Up casting
		
		AccountHeranca acc1 = bacc;
		AccountHeranca acc2 = new BusinessAccount(1003, "Bruna", 0.0, 200.0);
		AccountHeranca acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//Down Casting
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}

}
