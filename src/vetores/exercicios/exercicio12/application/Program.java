package vetores.exercicios.exercicio12.application;

import java.util.Locale;
import java.util.Scanner;

import vetores.exercicios.exercicio12.entities.Rent;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rooms = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i += 1) {
			System.out.println();
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rooms[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy Rooms: ");
		for(int i = 0; i <  10; i += 1) {
			if(rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}

		sc.close();

	}

}
