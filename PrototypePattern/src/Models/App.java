public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("The Prototype Design Pattern is a creational design pattern that allows you to create new objects by cloning an existing object, known as the prototype.");


        Car car1=new Car("v8 hybrid engine","tesla101","royal black");
        Car car2=(Car)car1.Clone();
        car2.toostring();
    }
}
