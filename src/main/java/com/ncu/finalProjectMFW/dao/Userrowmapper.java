package com.ncu.finalProjectMFW.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ncu.finalProjectMFW.entity.User;

public class Userrowmapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		User user = new User();
		user.setUser_id(rs.getString(1));
		user.setEmail(rs.getString(2));
		user.setPassword(rs.getString(3));
		user.setUser_type(rs.getString(4));

		return user;
	}

}
