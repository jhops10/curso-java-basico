package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número para saber se é NEGATIVO ou POSITIVO");
		numero = entrada.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO!");
		} else {
			System.out.println("POSITIVO!");
		}
	}

}
