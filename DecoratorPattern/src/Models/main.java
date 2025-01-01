package Models;

public class main {
	public static void main(String args[]){
		System.out.println("Decorator Design Pattern");
		System.out.println("The Decorator Pattern is a structural design pattern in object-oriented programming (OOP) that allows you to dynamically add new functionality or behavior to objects without altering their structure or subclassing");
		
		
		
		Coffee coffee1=new Expresso();
		System.out.println(coffee1.cost()+ " " +coffee1.Description());
		
		coffee1=new Milk(coffee1);
		System.out.println(coffee1.cost()+ " " +coffee1.Description());
		
		coffee1=new Sugar(coffee1);
		System.out.println(coffee1.cost()+ " " +coffee1.Description());
	}
	
	

}
