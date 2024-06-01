package enumeracoes.application;

import java.util.Date;

import enumeracoes.entities.Order;
import enumeracoes.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(10800, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order.toString());
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
