package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
		
	
	public Product() {
		
	}

	public Product(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;		
	}
	
	public Product(String name, double price){
		this.name = name;
		this.price = price;
			
	}
	
	public double totalValueInStock() {
		return this.price * this.quantity;
		
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		System.out.println("Product data: " + this.toString());
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Product: " + name 
				+ ", Price: $" + String.format("%.2f", price)
				+ ",Quantity: "+ quantity
				+ ", Total in stock: " + String.format("%.2f", totalValueInStock());
				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	
	

}
