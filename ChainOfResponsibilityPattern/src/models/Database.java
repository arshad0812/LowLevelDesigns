package models;

import java.util.HashMap;
import java.util.Map;

public class Database {
	
	private Map<String,String> UserCredientials;
	
	public Database(){
		this.UserCredientials=new HashMap<String,String>();
		UserCredientials.put("Arshad","dahsrA*0812");
	}
	
	public boolean isValidUser(String username){
		if(UserCredientials.containsKey(username)) {
			System.out.println("Username verified");
			return true;
		}
		System.out.println("User Doesnt exists");
		return false;
	}
	
	public boolean isValidPassword(String username,String password){
		if(UserCredientials.containsKey(username)){
			if(UserCredientials.get(username).equals(password)) {
				System.out.println("User Password verified");
				return true;
			}
			System.out.println("Inccorrect Password");
			return false;
		}
		System.out.println("User Dowsnt Exists");
		return false;
	}
	
	
	

}
