package Models;

public class Square extends Shape {


    
    public Square(Color color) {
        super(color);
        //TODO Auto-generated constructor stub
    }

    

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Drawing square with");
        color.fill();
        color.border();
    }
    
}
