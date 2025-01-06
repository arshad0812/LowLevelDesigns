

import Models.Circle;
import Models.GreenColor;
import Models.RedColor;
import Models.Shape;
import Models.Square;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bridge Structural pattern that separates abstract from its implementation");


        Shape square=new Square(new RedColor());
        Shape circle=new Circle(new GreenColor());

        square.draw();
        circle.draw();
    }
}
