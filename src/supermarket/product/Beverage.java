package supermarket.product;

public class Beverage extends GroceryProduct{
	private SugarLevel sugarLevel;

	public Beverage(String name, double price, double discount, SugarLevel sugarLevel) {
		super(name, price, discount);
		this.sugarLevel = sugarLevel;
	}
	
	public String display() {
		return(super.display()+
			"SugarLevel: " + sugarLevel+"\n"
		);
	}

	public SugarLevel getSugarLevel() {
		return sugarLevel;
	}

	public void setSugarLevel(SugarLevel sugarLevel) {
		this.sugarLevel = sugarLevel;
	}
	
}
