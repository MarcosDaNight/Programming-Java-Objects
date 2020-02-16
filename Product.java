package entites;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts (int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	// if an error occurs, it will be due to String.Format (), anything can remove or even put just as variables.
	public String toString() {
		return name
			+", $ "
			+ String.format("%.2f%", price)
			+ ", "
			+ quantity
			+" units, Total: $ "
			+ String.format("%.2f%", totalValueInStock());
	}
}
