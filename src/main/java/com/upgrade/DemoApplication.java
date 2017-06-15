package com.upgrade;

import org.apache.tomcat.websocket.server.UpgradeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.upgrade.util.UpgradeUtils;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private static UpgradeUtils upgradeUtils;
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
	}
}
