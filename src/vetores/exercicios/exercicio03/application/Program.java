package vetores.exercicios.exercicio03.application;

import java.util.Locale;
import java.util.Scanner;

import vetores.exercicios.exercicio03.entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double totalHeight = 0;
		int below16 = 0;
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		
		Person[] persons = new Person[n];
		
		for(int i = 0; i < persons.length; i += 1) {
			System.out.printf("Dados da %da Pessoa:", i + 1);
			System.out.println();
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			System.out.println();
			
			persons[i] = new Person(name, age, height);
			
			totalHeight += persons[i].getHeight();
			
			if(persons[i].getAge() < 16) {
				below16 += 1;
			}
		}
		
		System.out.println();
		System.out.printf("Altura Média: %.2f%n", totalHeight / persons.length);
		
		System.out.println("Pessoas com menos de 16 anos: " + (below16 * 100)/ persons.length + "%");
		
		for(int i = 0; i < persons.length; i += 1) {
			if (persons[i].getAge() < 16) {
				System.out.println(persons[i].getName());
			}
		}
		
		
		
		sc.close();

	}

}
