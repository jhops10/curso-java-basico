package vetores.exercicios.exercicio08.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int evenNumbers = 0;
		double sumEven = 0, avgEvens;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		
		for(int i = 0; i < numbers.length; i += 1) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
			if (numbers[i] % 2 == 0) {
				sumEven += numbers[i];
				evenNumbers += 1;
			}
		}
		
		avgEvens = sumEven / evenNumbers;
		
		if (evenNumbers > 0 ) {
			System.out.println("MEDIA DOS NÚMEROS PARES = " + avgEvens);
		} else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		
		sc.close();

	}

}
