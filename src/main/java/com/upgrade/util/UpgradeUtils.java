package com.upgrade.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.upgrade.mapper.UserMapper;
import com.upgrade.pojo.User;

@Component
public class UpgradeUtils {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public User getId(String id){
		
		System.out.println("*********** select * from user where id = "+id);
		List<User> user  =  jdbcTemplate.query("select * from user where id = ?",new Object[] { id },  new UserMapper());
		if(user!=null && user.size() > 0)
		{
			return user.get(0);
		}
		return null;
	}
	

	
	
}
