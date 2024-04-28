package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
		// essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

		Scanner sc = new Scanner(System.in);
		int N, X;
		int in = 0, out = 0;
		
		System.out.println("Digite o número de valores que deseja verificar");
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println("Digite um número:");
			X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println("IN: " + in);
		System.out.println("OUT: " + out);
		sc.close();
	}

}
