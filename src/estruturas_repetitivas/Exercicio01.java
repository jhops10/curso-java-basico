package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Fazer um programa que lê números
		//inteiros até que um zero seja lido. Ao
		//final mostra a soma dos números lidos.
		
		Scanner sc = new Scanner(System.in);
		int numero, somaTotal = 0;
		
		System.out.println("Digite um número:");
		numero = sc.nextInt();
	
		while (numero != 0) {
			somaTotal += numero;
			System.out.println("Digite um número:");
			numero = sc.nextInt();
		}
	
		System.out.println("Soma Total: " + somaTotal);
		
		
		
		sc.close();

	}

}
