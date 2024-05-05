package exemplos_poo.introducao_poo.exercicio01poo.application;

import java.util.Locale;
import java.util.Scanner;

import exemplos_poo.introducao_poo.exercicio01poo.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder name: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n) ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			acc = new Account(number, holder, initialDeposit);
		} else {
			acc = new Account(number, holder);			
		}
		
		System.out.println();
		System.out.println("Account Data");
		System.out.println(acc.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		acc.deposit(sc.nextDouble());
		System.out.println(acc.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		acc.withdraw(sc.nextDouble());
		System.out.println(acc.toString());
			
		sc.close();
	}

}
