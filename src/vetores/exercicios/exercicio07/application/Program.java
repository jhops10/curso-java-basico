package vetores.exercicios.exercicio07.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double totalSum = 0.0;

		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] numbers = new double[n];
		
		for(int i = 0; i < numbers.length; i += 1) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextDouble();
			totalSum += numbers[i];
		}
		
		System.out.println();
		double avg = totalSum / numbers.length;
		System.out.println("MEDIA DO VETOR = " + avg);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i = 0; i < numbers.length; i += 1) {
			if (numbers[i] < avg) {
				System.out.println(numbers[i]);
			}
		}
		sc.close();

	}

}
