package com.ncu.finalProjectMFW.dao;

import java.util.List;

import com.ncu.finalProjectMFW.entity.User;

public interface Userdao {

	public List<User> userlogin(String email, String password);

	public List<User> userlist();
	
	public int insertUser(User user);
	
	public int updateUser(User user);
	
	
}
