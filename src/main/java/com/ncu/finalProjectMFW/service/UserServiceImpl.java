package com.ncu.finalProjectMFW.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.finalProjectMFW.dao.Userdao;
import com.ncu.finalProjectMFW.entity.Project;
import com.ncu.finalProjectMFW.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private Userdao userdao;

	public List<User> userloginn(String email, String password) {
		return userdao.userlogin(email, password);
	}

	public List<User> getUserlist() {
		return userdao.userlist();
	}
	
	public int insertuser(User user) {
		return userdao.insertUser(user);
	}
	
	public int updateuser(User user) {
		return userdao.updateUser(user);
	}
	
}
