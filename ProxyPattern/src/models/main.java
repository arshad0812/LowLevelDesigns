package models;

public class main {
	public static void main(String args[]) {
		
		System.out.println("The proxy pattern is a structural design pattern that provides a surrogate or placeholder for another object to control access to it. It is commonly used in software engineering to add an additional level of control or abstraction.");
		
		Internet google1=new ProxyInternet();
		
		google1.search("tamilrockers");
		google1.search("tamilyogi");
		
		
	}
}