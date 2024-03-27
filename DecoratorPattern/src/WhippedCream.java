public class WhippedCream extends CoffeeDecorator{

    public WhippedCream(coffee Coffee) {
        super(Coffee);
    }


    public int getcost(){
        return super.getcost()+10;
    }
}
