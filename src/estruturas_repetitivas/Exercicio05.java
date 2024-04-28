package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// Fazer um programa que lê um valor inteiro N
		// Depois N números inteiros.
		// Ao final, mostra a soma dos N números lidos.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números deseja somar?");
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.println("Digite o número para somar:");
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println("Soma Total: " + soma);
		
		
		
		sc.close();

	}

}
