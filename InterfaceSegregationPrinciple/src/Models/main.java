package Models;

public class main {

	public static void main(String args[]){
		System.out.println("Inteface Segregation Principle");
		System.out.println("Interface should only have methods relevant to implementing classes");
		Developer dev=new Developer();
		Tester test=new Tester();
		
		dev.develop();
		dev.Attendance();
		test.Attendance();
		test.test();
	}
}
