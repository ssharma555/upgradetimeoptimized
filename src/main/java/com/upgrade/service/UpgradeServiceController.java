package com.upgrade.service;

import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.upgrade.pojo.UpgradeConfig;
import com.upgrade.pojo.User;
import com.upgrade.util.JenkinsParameters;
import com.upgrade.util.UpgradeUtils;

/**
 * Created by ssharma on 6/12/17.
 */

@RestController()
public class UpgradeServiceController {
	
	@Autowired
	private UpgradeUtils upgradeUtils;
	
	@Autowired
	private JenkinsParameters jenkinsParameters;
	
	@GetMapping("/upgrade/configs/{version:.+}")
	@ResponseBody
	public Map<String, UpgradeConfig> getUpgradeConfigs(@PathVariable("version") String version) {
		
		
		Map<String, UpgradeConfig> configMap = upgradeUtils.getUpgradeConfigs(version);
		return configMap;
	}
	
	@PostMapping("/upgrade/configs/{jobId}")
	@ResponseBody
	public String storeJenkinsParameters(@PathVariable("jobId") String jobId) {
		
		return jenkinsParameters.storeJenkinsParameters(jobId);
	}

}
