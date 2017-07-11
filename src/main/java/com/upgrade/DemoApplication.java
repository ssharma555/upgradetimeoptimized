package com.upgrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.upgrade.util.UpgradeUtils;

/**
 * Created by ssharma on 6/12/17.
 */

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private UpgradeUtils upgradeUtils;
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		//System.out.println(upgradeUtils.getId("101").getName());
		System.out.println(upgradeUtils.getUpgradeConfigs("2.6.0"));
		
	}
}
