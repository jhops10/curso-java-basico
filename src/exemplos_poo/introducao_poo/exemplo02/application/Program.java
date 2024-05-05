package exemplos_poo.introducao_poo.exemplo02.application;

import java.util.Locale;
import java.util.Scanner;

import exemplos_poo.introducao_poo.exemplo02.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe os dados do produto (nome, preço, qtd estoque):");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		Product product1 = new Product(name, price);
		
		System.out.println("Update Product");
		product1.setName("Computer");
		product1.setPrice(300.00);
		System.out.println("Updated Product: " + product1.getName() + " , " + product1.getPrice() );
		
		System.out.println("Product Data: " + product1.toString());
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		product1.addProducts(sc.nextInt());
		System.out.println();
		
		System.out.println("Upadate data: " + product1.toString());
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		product1.removeProducts(sc.nextInt());
		System.out.println();
		
		System.out.print("Upadate data: " + product1.toString());
		sc.close();
	}

}
