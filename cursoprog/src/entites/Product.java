package entites;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
//	public Product(String name, double price, int quantity) {
//		//super(); Se a classe for subclasse de alguma outra, ele chama o construtor da super classe
//		this.name = name;
//		this.price = price;
//		this.quantity = quantity;
//	}

	public Product(String name, double price, int quantity) {
		//super(); Se a classe for subclasse de alguma outra, ele chama o construtor da super classe
		this.name = name;
		this.price = price;
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
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public String toString() {
		return name
			+", $ "
			+ price
			+ ", "
			+ quantity
			+" units, Total: $ "
			+totalValueInStock();
			
	}

	public void addProducts(int quantity2) {
		quantity = quantity + quantity2;
		
	}

	public void removeProducts(int quantity2) {
		quantity = quantity - quantity2;
		
		
	}



	



	

	

	
}
