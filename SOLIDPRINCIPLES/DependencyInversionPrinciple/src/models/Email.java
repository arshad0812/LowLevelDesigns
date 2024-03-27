package models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Email implements Message {
    @Override
    public void sendMessage(String to,String message) {
       System.out.println(to+" "+message);
    }
}
