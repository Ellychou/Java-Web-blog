package com.demo.user;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;

@SuppressWarnings("serial")

public class User extends Model<User>{
	public static final User dao = new User();
	
	public void createNewUser(String email, String userName, String password) {
		Record user = new Record();
		
		user.set("email", email);
		user.set("userName", userName);
		user.set("password",password);
		Db.save("user", user);
	}
	public boolean mySave(){
		if(this.getStr("email")!= null){
			return this.save();
		}else{
			return false;
		}
	}
	
	
	
	
}
