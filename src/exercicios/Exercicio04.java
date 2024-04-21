package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
		
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		int nrFuncionario;
		double hrTrabalhadas, valorHora, salarioTotal;
		
		System.out.println("Digite o número do Funcionário: ");
		nrFuncionario = entrada.nextInt();
		System.out.println("Digite o número de horas trabalhadas: ");
		hrTrabalhadas = entrada.nextDouble();
		System.out.println("Digite o valor pago por hora: ");
		valorHora = entrada.nextDouble();
		salarioTotal = hrTrabalhadas * valorHora;
		
		System.out.println("Número do Funcionário: " + nrFuncionario);
		System.out.printf("Salário: U$ %.2f%n", salarioTotal);
		entrada.close();

	}

}
