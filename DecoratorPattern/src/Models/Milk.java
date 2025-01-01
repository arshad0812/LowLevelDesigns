package Models;

public class Milk extends CoffeeDecorator{

	public Milk(Coffee coffee) {
		super(coffee);
		System.out.println("Extra milk Added");
		// TODO Auto-generated constructor stub
	}
	
	
	public double cost() {
		return super.cost()+5;
	}
	
	public String Description() {
		return "Extra Milk Added to "+super.Description();
	}

}
