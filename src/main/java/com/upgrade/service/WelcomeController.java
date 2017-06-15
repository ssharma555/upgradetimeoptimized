package com.upgrade.service;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.upgrade.pojo.User;
import com.upgrade.util.UpgradeUtils;

@RestController()
public class WelcomeController {
	
	@Autowired
	private UpgradeUtils upgradeUtils;
	
	@RequestMapping("/ping")  
    public String hello(){  
        return"<html><strong>pong!</strong></html>";  
    }  
	
	@GetMapping("/user/{userId}")
	@ResponseBody
	public String getUserDetails(@PathVariable("userId") String userId ){
		
		User user = upgradeUtils.getId(userId);
		if(user == null)
		{
			return "No User found with given user Id";
		}
		
		return "Welcome "+user.getName();
		
	}

}
