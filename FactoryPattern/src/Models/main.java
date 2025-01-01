package Models;

public class main {
	public static void main(String args[]){
		System.out.println("Factory Design Pattern");
		System.out.println("The Factory Design Pattern is a creational design pattern in object-oriented programming (OOP) that provides an interface for creating objects, but allows subclasses or the client to decide which class to instantiate");
		
		
		car car1=CarFactory.getcar("SUV");
		car1.drive();
		car car2=CarFactory.getcar("Sedan");
		car2.drive();
	}
}
