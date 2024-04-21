package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int cod1, nr1, cod2, nr2;
		double valor1, valor2, total;
		
		System.out.println("Digite os dados da Peça 1(Código, Número de Peças e Valor da Peça): ");
		cod1 = entrada.nextInt();
		nr1 = entrada.nextInt();
		valor1 = entrada.nextDouble();
		System.out.println("Digite os dados da Peça 2(Código, Número de Peças e Valor da Peça): ");
		cod2 = entrada.nextInt();
		nr2 = entrada.nextInt();
		valor2 = entrada.nextDouble();
		
		total = (nr1 * valor1) + (nr2 * valor2);
		System.out.printf("Valor a pagar: R$ %.2f", total);
		entrada.close();
	}
}
