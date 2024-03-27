package Models;
import Interfaces.Eatable;
import Interfaces.Workable;

public class employees implements Workable,Eatable{


    @Override
    public void Eat() {
        System.out.println("In-lunch");
    }

    @Override
    public void work() {
        System.out.println("work in Progress");
    }
}
