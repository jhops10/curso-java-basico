package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n ; i+= 1) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0; i < n; i+= 1) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE RATE + %.2f%n", avg);
		
		sc.close();

	}

}
