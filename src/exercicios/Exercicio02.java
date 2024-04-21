package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.14159
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double raio, pi, areaCirculo;
		pi = 3.14159;
		
		System.out.println("Digite o valor do raio: ");
		raio = entrada.nextDouble();
		areaCirculo = pi * Math.pow(raio, 2); 
		System.out.printf("A área do seu círculo é: %.4f%n", areaCirculo);
		entrada.close();
	}
}
