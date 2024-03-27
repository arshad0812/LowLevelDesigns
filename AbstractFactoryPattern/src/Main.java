import Functionalities.Application;
import UIFactories.WinUiFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract factory Pattern!");
        Application application=new Application(new WinUiFactory());
        application.button.Click();
    }
}