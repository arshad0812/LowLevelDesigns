public abstract class CoffeeDecorator implements coffee{
    public coffee Coffee;

    public CoffeeDecorator(coffee Coffee){
        this.Coffee=Coffee;
    }

    @Override
    public int getcost() {
        return Coffee.getcost();
    }
}
