package com.demo.user;


import com.jfinal.core.Controller;

public class UserController extends Controller {
	
	public void index() {
		renderJson("hello");
	}

	public void login(){
		render("login.html");
		//getPara();
		
	}
	
	public void signup(){
		render("signup.html");

	}
	
	public void save(){
		String email = getPara("email");
		String name = getPara("userName","ss");
		String password = getPara("password");
		System.out.println(email + " - " + name + " - " +password);
		User.dao.createNewUser(email, name, password);
		
		
		redirect("/blog");
		
	}
	
}