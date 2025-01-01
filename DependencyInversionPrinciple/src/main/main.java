package main;

import Dao.NotificationService;
import Models.EmailNotification;
import Models.Notification;


public class main {
	public static void main(String args[]){
		
		System.out.println("Abstractions should not depend on details. Details should depend on abstractions,High-level modules should not depend on low-level modules");
//		High-level modules are the modules that contain the core business logic or decision-making of the application.
//		Low-level modules are the components responsible for specific operations like data access, user interface, or other system interactions.
//		Instead of the high-level modules directly depending on low-level modules, both should depend on abstractions (usually interfaces or abstract classes).
//		
		Notification EmailMessage=new EmailNotification();
		
		NotificationService notificationService=new NotificationService(EmailMessage);
		notificationService.send("Hii");
		
	}
}
