package main;

import Dao.NotificationService;
import models.EmailNotification;
import models.SmsNotification;

public class main {
	public static void main(String args[]){
		System.out.println("Open Closed Principle");
		System.out.println("A class should be open for extension but closed for modification.");
//		Meaning:
//			Open for Extension: You should be able to add new functionality to a class without modifying its existing code.
//			Closed for Modification: Once a class is developed and tested, its existing code should not be changed. This ensures stability and avoids introducing bugs into the system.
		
		NotificationService notificationSer=new NotificationService();
		
		
		EmailNotification email=new EmailNotification();
		email.send();
		
		SmsNotification sms=new SmsNotification();
		sms.send();
		
	}
}
