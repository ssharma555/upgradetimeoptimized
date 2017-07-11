package com.upgrade.util;

import org.springframework.web.client.RestTemplate;

import com.upgrade.pojo.Configs;
import com.upgrade.pojo.DashboardConfig;

/**
 * Created by ssharma on 6/16/17.
 */

public class ApiUtil {
	
	public static DashboardConfig getDashboardConfig(){
		RestTemplate restTemplate = new RestTemplate();
		DashboardConfig dashboardConfig = restTemplate.getForObject("http://dashboard.qe.hortonworks.com:5000/hwqe-dashboard-api/v1/configs", DashboardConfig.class);
		
		return dashboardConfig;
	}

	/*for(Configs config : dashboardConfig.getConfigs()){
			if(config.getId().equals(id)){
				return config;
			}
		}*/
}
