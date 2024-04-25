package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número inteiro:");
		numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		
		entrada.close();

	}

}
