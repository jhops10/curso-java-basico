package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		//seguir, calcule e mostre o valor da conta a pagar.
		
		Scanner entrada = new Scanner(System.in);
		int item, qtd;
		double valorTotal, preco;
		
		System.out.println("1 - Cachorro Quente R$ 4,00");
		System.out.println("2 - X - Salada R$ 4,50");
		System.out.println("3 - X - Bacon R$ 5,00");
		System.out.println("4 - Torrada Simples R$ 2,00");
		System.out.println("5 - Refrigerante R$ 1,50");
		System.out.println();
		System.out.println("Escolha um item do cardápio:");
		item = entrada.nextInt();
		System.out.println("Digite a quantidade do item escolhido:");
		qtd = entrada.nextInt();
		
		if (item == 1) {
			preco = 4.0;
			valorTotal = preco * qtd;
			System.out.printf("O valor Total da sua conta é: R$ %.2f%n ", valorTotal);
		} else if (item == 2) {
			preco = 4.5;
			valorTotal = preco * qtd;
			System.out.printf("O valor Total da sua conta é: R$ %.2f%n ", valorTotal);
		} else if (item == 3) {
			preco = 5.0;
			valorTotal = preco * qtd;
			System.out.printf("O valor Total da sua conta é: R$ %.2f%n ", valorTotal);
		} else if (item == 4) {
			preco = 2.0;
			valorTotal = preco * qtd;
			System.out.printf("O valor Total da sua conta é: R$ %.2f%n ", valorTotal);
		} else {
			preco = 1.5;
			valorTotal = preco * qtd;
			System.out.printf("O valor Total da sua conta é: R$ %.2f%n ", valorTotal);
		}
		
		
		
		entrada.close();
	}
}
