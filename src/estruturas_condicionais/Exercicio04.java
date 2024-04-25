package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
		
		Scanner entrada = new Scanner(System.in);
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Digite a hora inicial:");
		horaInicial = entrada.nextInt();
		System.out.println("Digite a hora final:");
		horaFinal = entrada.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O Jogo durou: " + duracao + " horas");
		
		entrada.close();

	}

}
