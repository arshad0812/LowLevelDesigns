package models;

public class main {

	public static void main(String args[]){

		System.out.println("The Null Object Pattern is a design pattern used in Low-Level Design (LLD) to avoid dealing with null checks in your code by introducing a special object that represents \"nothing\" or \"null behavior");
		
		animal animal1=AnimalFactory.GetAnimal("Dog");
		animal1.sound();
		animal animal2=AnimalFactory.GetAnimal(null);
		animal2.sound();
	}
}
