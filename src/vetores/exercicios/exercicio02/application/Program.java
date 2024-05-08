package vetores.exercicios.exercicio02.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você quer digitar?");
		int n = sc.nextInt();
		
		double[] numbers = new double[n];
		double sum = 0;
		
		for(int i = 0; i < numbers.length; i += 1) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextDouble();
			sum += numbers[i];
		}
		
		System.out.print("VALORES = ");
		for(int i = 0; i < numbers.length; i += 1) {
			System.out.printf("%.1f ", numbers[i]);
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", sum / numbers.length);

		
		sc.close();
	}

}
