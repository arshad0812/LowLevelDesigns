public class Main {
    public static void main(String[] args) {

        System.out.println("Observer Pattern");

        WeatherStation ws1=new WeatherStation();
        Displays d1=new Displays();
        Displays d2=new Displays();

        ws1.addObserver(d1);
        ws1.addObserver(d2);

        ws1.Settemp(22);
        ws1.removeObersver(d1);
        ws1.Settemp(23);

    }
}