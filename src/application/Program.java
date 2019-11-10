package application;

import entities.Client;
import entities.Product;

public class Program {

	public static void main(String[] args) {

	Product product = new Product(null, 0);
	Client client =  new Client();
	
	product.setName("Feijão");
	product.setPrice(20.00);
	
	System.out.println("Nome do produto: " + product.getName() + "\n" + "Preço do produto: " +  product.getPrice());
	}

}
