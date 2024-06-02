package enumeracoes.exercicio03.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumeracoes.entities.enums.OrderStatus;

public class Order {
	
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment; 
	private OrderStatus status;
	
	private List<OrderItem> products = new ArrayList<>();
	private Client client;
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getProducts() {
		return products;
	}

	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		this.products.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.products.remove(item);
	}
	
	public Double total() {
		double sum = 0;
		for(OrderItem product : products) {
			sum += product.subTotal();
		}
		
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Moment: " + dateFormat.format(this.getMoment()) + "\n");
		sb.append("Order Status: " + this.getStatus() + "\n");
		sb.append("Client: " + this.getClient().getName() + " ");
		sb.append("(" + dateFormat.format(this.getClient().getBirthDate()) + ")" + " - " + this.getClient().getEmail() + "\n");
		sb.append("Order Itens: \n" );
		for (OrderItem item : products) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
	
		return sb.toString();
		
	}
	
	
}
