package vetores.exercicios.exercicio10.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		double[] note1 = new double[n];
		double[] note2 = new double[n];
		
		for(int i = 0; i < names.length; i += 1) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			sc.nextLine();
			names[i] = sc.nextLine();
			note1[i] = sc.nextDouble();
			note2[i] = sc.nextDouble();
		}
		
		System.out.println("ALUNOS APROVADOS");
		for(int i = 0; i < n; i += 1) {
			if ((note1[i] + note2[i]) / 2 > 6) {
				System.out.println(names[i]);
			}
		}
		
		sc.close();

	}

}
