package exercicios;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		//mensagem explicativa, conforme exemplos.
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, soma;
		System.out.println("Digite um número: ");
		a = entrada.nextInt();
		System.out.println("Digite outro número: ");
		b = entrada.nextInt();
		
		soma = a + b;
		
		System.out.println("SOMA: " + soma);
		
		entrada.close();
		
	}

}
