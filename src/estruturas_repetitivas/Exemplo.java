package estruturas_repetitivas;

import java.util.Random;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		//Criar um programa que lê um número e verifica se esse número é o numero sorteado (e deixa dicas para o usuario).
		
		int numeroSorteado, tentativas, palpite;
		tentativas = 1;
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		
		numeroSorteado = random.nextInt(101);
		
		System.out.println("Tente descobrir o número sorteado de 0 a 100");
		palpite = entrada.nextInt();
		
		while(palpite != numeroSorteado) {
			tentativas += 1;
			if (palpite > numeroSorteado) {
				System.out.println("O número sorteado é menor do que " + palpite);
				System.out.println("Digite um novo número:");
				palpite = entrada.nextInt();
			} else {
				System.out.println("O número sorteado é maior do que " + palpite);
				System.out.println("Digite um novo número:");
				palpite = entrada.nextInt();
			}
		}
		
		System.out.printf("Parabéns, você acertou o número sorteado em  %d tentativa(s)", tentativas);

		entrada.close();
	}

}
