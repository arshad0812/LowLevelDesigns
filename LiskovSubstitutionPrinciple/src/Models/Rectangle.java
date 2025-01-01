package Models;

public class Rectangle extends shape{

	public double width;
	public double height;
	
	public Rectangle(double width,double height) {
		this.height=height;
		this.width=width;
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return height*width;
	}

}
