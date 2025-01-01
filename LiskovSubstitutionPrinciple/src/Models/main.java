package Models;

public class main {

	public static void main(String[] args) {
		
		System.out.println("\"Subtypes must be substitutable for their base types without altering the correctness of the program.\"");
//		This means that if a program is using a base class (or interface), it should be able to replace it with any of its derived classes without unexpected behavior or errors.
//		
		// TODO Auto-generated method stub
		shape shape1=new Circle(12);
		shape shape2=new Rectangle(1,2);
		
		System.out.println(shape1.getArea());
		System.out.println(shape2.getArea());

	}

}
