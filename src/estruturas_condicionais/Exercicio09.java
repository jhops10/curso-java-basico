package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// Uma operadora de telefonia cobra R$ 50,00 por um plano básico que
		//da direito a 100 minutos de telefone. Cada minuto que exceder a
		//franquia de 100 minutos custa R$ 2,00. Fazer um programa para ler a
		//quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a 
		//ser pago.
		
		Scanner entrada = new Scanner(System.in);
		int minutos;
		double conta = 50.0;
		
		System.out.println("Digite os minutos consumidos:");
		minutos = entrada.nextInt();
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2;
			System.out.printf("Valor a Pagar R$ %.2f%n", conta);
		} else {
			System.out.printf("Valor a Pagar R$ %.2f%n", conta);
		}
		
		entrada.close();
		

	}

}
