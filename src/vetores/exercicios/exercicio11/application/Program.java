package vetores.exercicios.exercicio11.application;

import java.util.Locale;
import java.util.Scanner;

import vetores.exercicios.exercicio11.entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double shorterHeight, greaterHeight;
		int qtdMen = 0, qtdWomen = 0;
		double totalWomenHeight = 0.0;
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		for(int i = 0; i < vect.length; i += 1) {
			System.out.print("Altura da " + (i + 1) + "a Pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a Pessoa: ");
			char gender = sc.next().charAt(0);
			vect[i] = new Person(gender, height);
			if(vect[i].getGender() == 'F') {
				qtdWomen += 1;
				totalWomenHeight += vect[i].getHeight();
			} else {
				qtdMen += 1;
			}
		}
		
		shorterHeight = vect[0].getHeight();
		greaterHeight = vect[0].getHeight();
		
		for(int i = 0; i < vect.length; i += 1) {
			if(vect[i].getHeight() > greaterHeight) {
				greaterHeight = vect[i].getHeight();
			}
			
			if(vect[i].getHeight() < shorterHeight) {
				shorterHeight = vect[i].getHeight();
			}
		}
		
		double avgWomenHeight = totalWomenHeight / qtdWomen;
		System.out.printf("Menor Altura: %.2f%n", shorterHeight);
		System.out.printf("Maior Altura: %.2f%n", greaterHeight);
		System.out.printf("Média da altura das mulheres: %.2f%n", avgWomenHeight);
		System.out.printf("Número de homens: %d%n", qtdMen);
		
		sc.close();

	}

}
