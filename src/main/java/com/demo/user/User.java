package com.demo.user;


import com.jfinal.plugin.activerecord.Model;


@SuppressWarnings("serial")

public class User extends Model<User>{
	public static final User dao = new User();
	
	public void createNewUser(String email, String userName, String password) {
		//Record user = new Record();
		System.out.println(email + " - " + userName + " - " +password);
		User user = new User();
		user.set("email", email);
		user.set("userName", userName);
		user.set("password",password);
		user.save();
	}
	public boolean mySave(){
		if(this.getStr("email")!= null){
			return this.save();
		}else{
			return false;
		}
	}
	
	
	
	
}
