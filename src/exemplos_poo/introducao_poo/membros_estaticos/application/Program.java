package exemplos_poo.introducao_poo.membros_estaticos.application;

import java.util.Locale;
import java.util.Scanner;

import exemplos_poo.introducao_poo.membros_estaticos.util.CurrencyConverter;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dolarPrice, qtdDolar;
		
		System.out.println("What is the dollar price?");
		dolarPrice = sc.nextDouble();
		System.out.println();
		
		System.out.println("How many dollars will be bought?");
		qtdDolar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais R$ %.2f%n", CurrencyConverter.dolarConverter(dolarPrice, qtdDolar));
		sc.close();

	}

}
