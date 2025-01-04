public class CarDirector{
    private CarBuilder carbuilder;

    public CarDirector(CarBuilder carbuilder){
        this.carbuilder=carbuilder;
    }

    public Car constructCar(){
        carbuilder.BuildEngine("V8 hybrid engine");
        carbuilder.BuildBody("Stainless steel");
        carbuilder.BuildWheel("aluminium wheel");
        carbuilder.PaintColor("Royal Black");
        return carbuilder.getcar();
    }
}