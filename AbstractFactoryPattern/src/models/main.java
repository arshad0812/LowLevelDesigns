package models;

public class main {
	public static void main(String args[]){
		System.out.println("Abstract Factory Pattern");
		System.out.println("it is  a creational design pattern allows to provides interface for creating family of related object withtou specifying concrete class");
		
		Application app1=new Application(new WindowSystem());
		app1.OpenWindows();
	}

}
