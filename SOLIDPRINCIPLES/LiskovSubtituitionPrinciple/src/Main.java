class Shape {
    protected double width;
    protected double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

class Rectangle extends Shape {
    // No need to override methods here
}

class Square extends Shape {
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width); // Ensuring square's width and height are always the same
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height); // Ensuring square's width and height are always the same
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Area of rectangle: " + rectangle.area());

        Shape square = new Square();
        square.setWidth(5);
        square.setHeight(5);
        System.out.println("Area of square: " + square.area());
    }
}
