package Dao;

import models.Notification;

public class NotificationService {
	public void sendNotification(Notification notify) {
		notify.send();
	}
	
}
