package Models;
import Models.subscriber;
import Models.Observer;

public class main {
	public static void main(String args[]){
		System.out.println("Observer Pattern");
		System.out.println("he Observer Design Pattern is a behavioral design pattern that defines a one-to-many dependency between objects, such that when one object (the subject) changes its state, all its dependents (observers) are automatically notified and updated.");
		
		
		NewsAgency agency1=new NewsAgency();
		agency1.setLatestNews("corona virus");
		
		Observer sub1=new subscriber("arshad");
		Observer sub2=new subscriber("abi");
		
		agency1.addObserver(sub1);
		agency1.addObserver(sub2);
		agency1.notifyObserver();
		;
	}
}
