package application;

import entities.Client;
import entities.Order;
import entities.Product;

public class Program {

	public static void main(String[] args) {

	Product product = new Product(null, 0);
	Client client =  new Client();
	Order order =  new Order();
	client.setName("Tiringa");
	client.setCpf("0000000000");
	
	product.setName("Feijão");
	product.setPrice(20.00);
	
	order.setClient(client);
	System.out.println("Nome do produto: " + product.getName() + "\n" + "Preço do produto: " +  product.getPrice() + "\n"+
			"order:" + order.getClient());
	}

}
