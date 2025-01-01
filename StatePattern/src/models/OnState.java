package models;

public class OnState extends PhoneState{

	@Override
	public void PowerButton(Phone phone) {
		// TODO Auto-generated method stub
		System.out.println("Phone Turning Off");
		phone.setState(new OffState());
	}

	@Override
	public void LockButton(Phone phone) {
		System.out.println("Phone Unlocked");
		phone.setState(new OnState());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CurrentState() {
		System.out.println("On State");
		// TODO Auto-generated method stub
		
	}

	

	


}
