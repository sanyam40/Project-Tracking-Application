package com.ncu.finalProjectMFW.service;

import java.util.List;

import com.ncu.finalProjectMFW.entity.User;

public interface UserService {

	public List<User> userloginn(String email, String password);

	public List<User> getUserlist();

}
