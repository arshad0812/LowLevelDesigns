package models;

public class PasswordHandler extends Handler{

	

	@Override
	public boolean handle(Request request) {
		// TODO Auto-generated method stub
		
		if(super.db.isValidPassword(request.getName(), request.getPassword())){
			System.out.println("Verification Succesfull");
			return true;
		}
		
		return true;
	}

}
