public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator Pattern");
        coffee myCoffee=new expresso();
        myCoffee=new Milk(myCoffee);
        System.out.println("Cost of my custom coffee: $" + myCoffee.getcost());
    }
}