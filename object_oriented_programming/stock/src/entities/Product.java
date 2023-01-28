package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return this.price * this.quantity;
		
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		System.out.println("Product data: " + this.toString());
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		System.out.println("Product data: " + this.toString());
	}
	
	public String toString() {
		return "Product: " + name 
				+ ", Price: $" + String.format("%.2f", price)
				+ ",Quantity: "+ quantity
				+ ", Total in stock: " + String.format("%.2f", totalValueInStock());
				
	}
	
}
