package models;

public class UserHandler extends Handler{

	
	

	@Override
	public boolean handle(Request request) {
		// TODO Auto-generated method stub
		
		if(super.db.isValidUser(request.getName())) {
			System.out.println("Passed to password verification");
			super.handler.handle(request);
		}
		
		return false;
	}

}
