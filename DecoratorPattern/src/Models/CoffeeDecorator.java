package Models;

public abstract class CoffeeDecorator implements Coffee{
	public Coffee coffee;
	
	public CoffeeDecorator(Coffee coffee ){
		this.coffee=coffee;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return coffee.cost();
	}

	@Override
	public String Description() {
		// TODO Auto-generated method stub
		return "In Coffee Decorator";
	}
	
	

}
