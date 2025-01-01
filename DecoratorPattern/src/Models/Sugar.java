package Models;

public class Sugar extends CoffeeDecorator{

	public Sugar(Coffee coffee) {
		super(coffee);
		System.out.println("Extra Sugar added");
		// TODO Auto-generated constructor stub
	}
	
	public double cost() {
		return super.cost()+10;
	}
	
	public String Description() {
		return "Extra Sugar Added to "+super.Description();
	}
	
	

}
