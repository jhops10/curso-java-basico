package vetores.exemplo2.application;

import java.util.Locale;
import java.util.Scanner;

import exemplos_poo.introducao_poo.exemplo02.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos produtos você deseja adicionar a lista: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i += 1) {
			sc.nextLine();
			System.out.println("Digite o nome do produto: ");
			String name = sc.nextLine();
			System.out.println("Digite o valor: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < vect.length; i+= 1) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
