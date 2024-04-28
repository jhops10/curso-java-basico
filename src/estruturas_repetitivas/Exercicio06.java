package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
		// X, se for o caso.
		
		Scanner sc = new Scanner(System.in);
		int X;
		System.out.println("Digite um valor para descobrir os números ímpares até esse valor.");
		X = sc.nextInt();
		
		for (int i = 0; i <= X; i++) {
			if (i % 2 > 0) {
				System.out.println(i);
			}
		}
		sc.close();
		
	}

}
