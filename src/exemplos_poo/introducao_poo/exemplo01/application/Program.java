package exemplos_poo.introducao_poo.exemplo01.application;

import java.util.Scanner;

import exemplos_poo.introducao_poo.exemplo01.entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X Area: %.4f%n", areaX);
		System.out.printf("Triangle Y Area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger Area is: X");
		} else {
			System.out.println("Larger Area is: Y");
		}
		sc.close();

	}

}
