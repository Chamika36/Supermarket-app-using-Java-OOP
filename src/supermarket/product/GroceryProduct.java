package supermarket.product;

import java.util.ArrayList;

public class GroceryProduct {
	private String name;
	private double price;
	private double discount;
	
	public GroceryProduct(String name, double price, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	public double getActualPrice() {
		return price - price*discount/100;
	}
	
	public String display() {
		return(
			"Name: " + name+"\n"+
			"Price: " + price+"\n"+
			"Discount: " + discount+"\n"
		);
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

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public static void main(String[] args){
		ArrayList <GroceryProduct> cart = new ArrayList <GroceryProduct>();
		GroceryProduct toast = new GroceryProduct("Toast",2.5,10);
		cart.add(toast);
		
		GroceryProduct knife = new GroceryProduct("knife",2.5,10);
		cart.add(knife);
		
		double total = 0;
		
		for(int i=0; i<cart.size(); i++) {
			total+= cart.get(i).getActualPrice();
		}
		
		System.out.print("Total is " + total);
	}
	
}
