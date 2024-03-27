import models.Email;
import models.Message;
import models.sms;
import service.NotificationService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dependency Inversion Principle");
        Message mes=new Email();
        Message smss=new sms();
        NotificationService ser=new NotificationService(mes);
        ser.sendNotification("recruiter","Plz hire me");
        ser.sendNotification("manager","Im a fresher");

    }
}