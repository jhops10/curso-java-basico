package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		
		Scanner sc = new Scanner(System.in);
		
		int x,y; 
		
		System.out.println("Digite um valor para X:");
		x = sc.nextInt();
		System.out.println("Digite um valor para Y:");
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Plano");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo Plano");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro Plano");
			} else {
				System.out.println("Quarto Plano");
			}
			
			System.out.println("Digite um novo valor para X:");
			x = sc.nextInt();
			System.out.println("Digite um novo valor para Y:");
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
