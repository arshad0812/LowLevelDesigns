



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		System.out.println("The Single Responsibility Principle (SRP) is one of the SOLID principles of object-oriented design. It states that:\r\n"
				+ "\r\n"
				+ "\"A class should have only one reason to change.\"\r\n"
				+ "\r\n"
				+ "This means a class should only have one responsibility or function, making it easier to maintain, test, and modify.");
		
		
		ReportGenerator rpg=new ReportGenerator();
		
		rpg.ReportGenerator();
		
		ReportPrinter rpp=new ReportPrinter();
		rpp.PrintReport();

	}

}
