package Models;

public class CarFactory {
	
	private CarFactory(){}
	
	public static car getcar(String type){
		
		car car;
		switch(type) {
		case "SUV":
			car=new SUV();
			break;
		case "Sedan":
			car=new Sedan();
			break;
		default:
			return null;
		}
		return car;
		
		
	}
}
