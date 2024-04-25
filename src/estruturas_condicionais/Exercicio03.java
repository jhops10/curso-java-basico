package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		//ordem crescente ou decrescente
		
		Scanner entrada = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite um valor para A:");
		A = entrada.nextInt();
		System.out.println("Digite um valor para B");
		B = entrada.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São Múltiplos");
		} else {
			System.out.println("Não são Múltiplos");
		}
		
		
		entrada.close();
	}

}
