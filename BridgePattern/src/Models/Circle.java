package Models;

public class Circle extends Shape {
    
    public Circle(Color color){
        super(color);
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Drawing Circle with");
        color.fill();
        color.border();
    }

}
