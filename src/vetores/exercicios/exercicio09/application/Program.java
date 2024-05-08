package vetores.exercicios.exercicio09.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int older, olderIndex;
		

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		older = ages[0];
		olderIndex = 0;
		
		for(int i = 0; i < names.length; i += 1) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			names[i] = sc.next();
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
			if (ages[i] > older) {
				older = ages[i];
				olderIndex = i;
			}
			
		}
		
		System.out.println("PESSOA MAIS VELHA = " + names[olderIndex]);
		
		sc.close();

	}

}
