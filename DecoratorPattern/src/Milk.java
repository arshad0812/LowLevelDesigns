public class Milk extends CoffeeDecorator{
    public Milk(coffee Coffee) {
        super(Coffee);
        System.out.println("Extra milk added");
    }

    public int getcost(){
        return super.getcost()+5;
    }
}
