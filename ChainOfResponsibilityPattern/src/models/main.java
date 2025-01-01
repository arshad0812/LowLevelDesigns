package models;

public class main {
	public static void main(String args[]){
		System.out.println("The Chain of Responsibility Pattern is a behavioral design pattern that allows a request to be passed along a chain of handlers. Each handler in the chain either processes the request or passes it to the next handler in the chain");
	
		Handler usernameHandler=new UserHandler();
		Handler PasswordHandler=new PasswordHandler();
		
		usernameHandler.setHandler(PasswordHandler);
		
		
		
		Request rq1=new Request("Arshad","dahsrA*0812");
		usernameHandler.handle(rq1);
	}

}
