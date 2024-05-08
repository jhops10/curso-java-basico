package vetores.exercicios.exercicio04.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int evenQtd = 0;
		
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		
		for(int i = 0; i < numbers.length; i += 1) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
			
			if(numbers[i] % 2 == 0) {
				evenQtd += 1;
			}
		}
		
		System.out.println("NUMEROS PARES:");
		for(int i = 0; i < numbers.length; i += 1) {
			if(numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + evenQtd);
		
		
		sc.close();
	}

}
