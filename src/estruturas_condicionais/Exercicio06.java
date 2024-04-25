package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo
		
		Scanner entrada = new Scanner(System.in);
		double valor;
		
		System.out.println("Digite um valor:");
		valor = entrada.nextDouble();
		
		if (valor < 0.0) {
			System.out.println("Erro! Você deve inserir apenas números positivos");
		} else if (valor <= 25.0) {
			System.out.println("Intervalo: [0,25]");
		} else if (valor <= 50.0) {
			System.out.println("Intervalo: [25,50]");
		} else if (valor <= 75.0) {
			System.out.println("Intervalo: [50,75]");
		} else if (valor <= 100.0) {
			System.out.println("Intervalo: [75,100]");
		} else {
			System.out.println("Fora de Intervalo");
		}
		
		entrada.close();

	}

}
