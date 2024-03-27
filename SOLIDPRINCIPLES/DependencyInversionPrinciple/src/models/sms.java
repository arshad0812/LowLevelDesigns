package models;

public class sms implements Message{
    @Override
    public void sendMessage(String to, String message) {
        System.out.println(to+" "+message);
    }
}
