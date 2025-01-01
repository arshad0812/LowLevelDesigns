package models;

public class AnimalFactory {
	
	public static animal GetAnimal(String animal){
		if(animal=="Dog") {
			return new dog();
		}
		
		if(animal=="Cat") {
			return new cat();
		}
		
		
		return new NullAnimal();
	}
	

}
