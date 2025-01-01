package models;

public class LockedState extends PhoneState {


	@Override
	public void PowerButton(Phone phone) {
		// TODO Auto-generated method stub
		System.out.println("Phone Turned Off");
		phone.setState(new OffState());
	}



	@Override
	public void LockButton(Phone phone) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void CurrentState() {
		System.out.println("Locked State");
		// TODO Auto-generated method stub
		
	}

}
