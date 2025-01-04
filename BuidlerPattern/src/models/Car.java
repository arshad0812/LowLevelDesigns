public class Car{
    private int id;
    private final String Engine;
    private final String Wheel;
    private final String body;
    private final String paint;

    public Car(String Engine,String Wheel,String body,String paint){
        this.Engine=Engine;
        this.paint=paint;
        this.body=body;
        this.Wheel=Wheel;
    }


    public void toostring(){
        System.out.println(id+" "+" "+body+" "+Engine+ " "+paint+" "+Wheel);
    }
}