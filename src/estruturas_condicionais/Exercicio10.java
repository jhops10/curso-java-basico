package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Fazer um programa para ler um valor inteiro de 1 a 7 representando um
		// dia da semana (sendo 1 = domingo, 2 = segunda e assim por diante).
		// Escrever na tela o dia da semana correspondente, conforme exemplos.

		Scanner entrada = new Scanner(System.in);
		int numeroDia;

		System.out.println("Digite um número de 1 a 7 para descobrir o dia da semana:");
		numeroDia = entrada.nextInt();

		switch (numeroDia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Valor Inválido");
			break;
		}
		entrada.close();

	}

}
