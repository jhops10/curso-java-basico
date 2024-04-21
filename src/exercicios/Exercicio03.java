package exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
		
		Scanner entrada = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("Digite quatro valores inteiros: ");
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		diferenca = (A * B) - (C * D);
		System.out.println("Diferença: " + diferenca);
		
		entrada.close();
	}
}
