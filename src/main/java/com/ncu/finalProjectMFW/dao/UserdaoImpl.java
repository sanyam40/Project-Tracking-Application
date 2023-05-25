package com.ncu.finalProjectMFW.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ncu.finalProjectMFW.entity.User;

@Repository
public class UserdaoImpl implements Userdao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* It is used for Checking The Details */
	@SuppressWarnings("deprecation")
	public List<User> userlogin(String email, String password) {
		System.out.println(email);
		List<User> list = new ArrayList<>();
		String query = "select * from user where email=? and password=?";
		list = jdbcTemplate.query(query, new Object[] { email, password }, new Userrowmapper());
		return list;
	}

	@Override
	/* It is used to get the user ids */
	public List<User> userlist() {
		List<User> list = new ArrayList<>();

		String quString = "select user_id from user";
		list = jdbcTemplate.query(quString, new BeanPropertyRowMapper<User>(User.class));
		System.out.println(list);
		return list;
	}
	
	public int insertUser(User user) {
		String sql = "insert into user(email,password,user_type) values(?,?,?)";
		Object[] query = {user.getEmail(),user.getPassword(),"user"};
		return jdbcTemplate.update(sql, query);
	}
	
	public int updateUser(User user) {
		String aString="update user set email=?,password=? where user_id=?";
		Object[] queryObjects= {user.getEmail(),user.getPassword(),user.getUser_id()};
		return jdbcTemplate.update(aString,queryObjects);
	}
}
