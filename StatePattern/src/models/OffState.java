package models;

public class OffState extends PhoneState{

	

	@Override
	public void PowerButton(Phone phone) {
		System.out.println("Phone Turned On");
		phone.setState(new OnState());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LockButton(Phone phone) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void CurrentState() {
		System.out.println("Off State");
		// TODO Auto-generated method stub
		
	}





}