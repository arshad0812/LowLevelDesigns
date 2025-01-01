package models;

public class Phone {
	
	private PhoneState state;
	
	public Phone(){
		this.state=new OffState();
	}

	public PhoneState getState() {
		return state;
	}

	public void setState(PhoneState state) {
		this.state = state;
	}
	
	public void pressPowerButton() {
        state.PowerButton(this);
    }

    public void pressLockButton() {
        state.LockButton(this);
    }
	
	
	
	
	
	
	

}
