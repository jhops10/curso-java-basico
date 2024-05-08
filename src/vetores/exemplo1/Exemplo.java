package vetores.exemplo1;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alturas que deseja calcular a média: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n ; i+= 1) {
			System.out.print("Digite a altura: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0; i < n; i+= 1) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE RATE: %.2f%n", avg);
		
		sc.close();

	}

}
