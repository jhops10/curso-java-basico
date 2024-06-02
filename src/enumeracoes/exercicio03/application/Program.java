package enumeracoes.exercicio03.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumeracoes.exercicio03.entities.Order;
import enumeracoes.entities.enums.OrderStatus;
import enumeracoes.exercicio03.entities.Client;
import enumeracoes.exercicio03.entities.OrderItem;
import enumeracoes.exercicio03.entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the client data: ");
		System.out.println("Name: ");
		String clientName = sc.nextLine();
		System.out.println("Email: ");
		String clientEmail = sc.next();
		System.out.println("Birth Date (DD/MM/YYYY): ");
		Date clientBirthDate = dateFormat.parse(sc.next());
		
		Client client = new Client(clientName, clientEmail, clientBirthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println("How many items to this order?");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.println("Product Name:");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product Price: ");
			Double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem item = new OrderItem(quantity, productPrice, product);
			
			order.addItem(item);
		}
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		
		sc.close();
	}

}
