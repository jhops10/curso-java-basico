package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.println("Quantos pares de número você deseja verificar?");
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {

			double a = sc.nextInt();
			double b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("Divisão impossível");
			} else {
				double divisao = a / b;
				System.out.println(divisao);
			}
		}
		sc.close();

	}

}
