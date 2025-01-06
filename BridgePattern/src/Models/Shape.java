package Models;

abstract public class Shape {
    
    public Color color;

    
    public Shape(Color color){
        this.color =color;
    }


    abstract public void draw();

}
