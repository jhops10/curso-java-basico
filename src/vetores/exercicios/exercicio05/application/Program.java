package vetores.exercicios.exercicio05.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] numbers = new double[n];
		
		for(int i = 0; i < numbers.length; i += 1) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextDouble();
		}
		
		double highNumber = numbers[0];
		int highNumberIndex = 0;
	
		for(int i = 0; i < numbers.length; i += 1) {
			if (numbers[i] > highNumber) {
				highNumber = numbers[i];
				highNumberIndex = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + highNumber);
		System.out.println("POSICAO DO MAIOR VALOR = " + highNumberIndex);

		sc.close();

	}

}
