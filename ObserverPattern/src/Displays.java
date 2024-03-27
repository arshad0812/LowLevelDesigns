public class Displays implements Observer{
    @Override
    public void update(int temperature) {
        System.out.println("Temperature updated: " + temperature);
    }
}
