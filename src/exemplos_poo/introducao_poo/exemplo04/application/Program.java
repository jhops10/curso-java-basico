package exemplos_poo.introducao_poo.exemplo04.application;

import java.util.Locale;
import java.util.Scanner;

import exemplos_poo.introducao_poo.exemplo04.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee empregado = new Employee();
		
		System.out.print("Name: ");
		empregado.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		empregado.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		empregado.tax = sc.nextDouble();
		
		System.out.println("Employee: " + empregado.toString());
		System.out.println();
		
		System.out.println("Which percentage to increase salary?");
		empregado.increaseSalary(sc.nextDouble());
		System.out.println();
		
		System.out.println("Updated Data: " + empregado.toString());
		
		sc.close();
	}

}
