import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private int temperature;

    private List<Observer> observers;


    public WeatherStation(){
        this.observers=new ArrayList<Observer>();
    }

    public void Settemp(int temp){
        this.temperature=temp;
        notifyObserver();

    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObersver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer i:observers)
        {
            i.update(temperature);
        }
    }
}
