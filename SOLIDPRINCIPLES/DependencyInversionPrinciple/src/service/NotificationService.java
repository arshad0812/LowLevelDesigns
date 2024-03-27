package service;

import models.Message;

public class NotificationService {
    public Message mes;

    public NotificationService(Message mes){
        this.mes=mes;
    }

    public void sendNotification(String to,String message){
        mes.sendMessage(to,message);
    }
}
