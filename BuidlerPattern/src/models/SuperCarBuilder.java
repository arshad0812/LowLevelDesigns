public class SuperCarBuilder implements CarBuilder{
    private String Engine;
    private String Body;
    private String Wheel;
    private String Paint;

    @Override
    public void BuildEngine(String Engine){
        this.Engine=Engine;
    }

    
    @Override
    public void BuildBody(String Body){
        this.Body=Body;
    }

    
    @Override
    public void BuildWheel(String Wheel){
        this.Wheel=Wheel;
    }

    
    @Override
    public void PaintColor(String paint){
        this.Paint=paint;
    }

    @Override
    public Car getcar(){
        return new Car(Engine,Wheel,Body,Paint);
    }
}