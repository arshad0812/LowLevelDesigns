package Models;
public class Circle extends shape{
	
	public double radius;
	
	public Circle(int radius){
		
		this.radius=radius;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

}
