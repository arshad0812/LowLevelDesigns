public class Car implements CarModel{
    private String model;
    private String color;
    private String engine;

    public Car(String engine,String model,String color){
        this.engine=engine;
        this.model=model;
        this.color=color;
    }

    @Override
    public Car Clone(){
        return new Car(engine,model,color);
    }

    public void toostring(){
        System.out.println(engine+" "+model+" "+color);
    }



}