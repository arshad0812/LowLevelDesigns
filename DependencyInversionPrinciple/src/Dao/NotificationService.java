package Dao;

import Models.EmailNotification;
import Models.Notification;

public class NotificationService {
	
	public Notification NotifyMessage;
	
	public NotificationService(Notification notification)
	{
		this.NotifyMessage=notification;
	}
	
	public void send(String Message){
		NotifyMessage.sendMessage(Message);
	}

}
