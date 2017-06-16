package com.upgrade.util;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.upgrade.mapper.UserMapper;
import com.upgrade.pojo.UpgradeConfig;
import com.upgrade.pojo.User;

/**
 * Created by ssharma on 6/12/17.
 */

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
	
	public Map<String, UpgradeConfig> getUpgradeConfigs(String version){
		
	}
	
	
}
