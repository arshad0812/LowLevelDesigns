package Models;

public class Developer implements DailyWork,Development{

	@Override
	public void develop() {
		System.out.println("Developing");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FixBug() {
		System.out.println("fixing Bugs");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AttendMeeting() {
		System.out.println("Attend Meeting");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Attendance() {
		System.out.println("attendence");
		// TODO Auto-generated method stub
		
	}

}
