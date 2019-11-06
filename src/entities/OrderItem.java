package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

	private int quantity;
	private	List<Product> products = new ArrayList<>();
	Product product = new Product();
	
	public OrderItem() {
	}

	public OrderItem(int quantity, List<Product> products) {
		this.quantity = quantity;
		this.products = products;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	} 
	
	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	public double totalItem() {
		return product.getPrice() * quantity;
	}
}
