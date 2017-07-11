package com.upgrade.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.upgrade.mapper.ConfigurationMapper;
import com.upgrade.mapper.IntegerRowMapper;
import com.upgrade.mapper.OverridenPropertyValuesMapper;
import com.upgrade.mapper.StringRowMapper;
import com.upgrade.mapper.UserMapper;
import com.upgrade.pojo.Configuration;
import com.upgrade.pojo.DashboardConfig;
import com.upgrade.pojo.OverrideProperties;
import com.upgrade.pojo.OverridenPropertyValues;
import com.upgrade.pojo.UpgradeConfig;
import com.upgrade.pojo.User;

import net.minidev.json.JSONObject;

/**
 * Created by rmothe on 6/12/17.
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
		
		Map<String,UpgradeConfig> finalMap = new HashMap<String,UpgradeConfig>();
		DashboardConfig config = ApiUtil.getDashboardConfig();
		
		/*
		    1) Query  config_version and get all the config name for given version
		    2) query api util to get the config detail for each config id
		    3) create UpgradeConfig object and populate the corresponding vales fromstep 2
		    4) query the database for remaining values
		    5) repeat 1-4 for all the configs for the given version and put in in a finalMap 
		
		    test ; add artifact in pom.xml for gson and convert final map to json which should look exactly like vivek has sent
		*/
		
		List<Integer> config_ids = jdbcTemplate.query("select config_id from config_version where release_version = ?",new Object[] {version}, new IntegerRowMapper());

		for(int configId : config_ids) {
			
			UpgradeConfig newConfig = new UpgradeConfig();
			List<Configuration> details = jdbcTemplate.query("select * from configuration where config_id = ?",new Object[] {configId}, new ConfigurationMapper());
			newConfig.setComponent_name((details.get(0)).getCompName());
			newConfig.setLabels((details.get(0)).getLabels());
			newConfig.setNumber_of_nodes(Integer.toString((details.get(0)).getNumberOfNodes()));
			newConfig.setNumber_of_splits(Integer.toString((details.get(0)).getNumberOfSplits()));
			
			List<String> service = jdbcTemplate.query("select service_name from install_dependency as i,  service as s where i.service_id = s.service_id and i.config_id = ?", new Object[] {configId}, new StringRowMapper());  
			String installDependency = service.get(0)+",";
			for(int i=1 ; i<service.size() ; i++){
				installDependency += service.get(i)+",";
				//installDependency.concat(service.get(i));
			}
			installDependency = installDependency.substring(0,installDependency.length()-1);
			newConfig.setInstall_dependencies(installDependency);
			
			List<OverridenPropertyValues> opvalues = jdbcTemplate.query("select prop_name,prop_value from property as a, overriden_property as b where a.prop_id = b.prop_id and config_id = ?", new Object[] {configId}, new OverridenPropertyValuesMapper());
			OverrideProperties override_prop = new OverrideProperties();
			HashMap<String,String> opmap = new HashMap<String,String>();
			for(OverridenPropertyValues opv : opvalues){
				opmap.put(opv.getPropName(), opv.getPropValue());
			}
			
				if(opmap.containsKey("os"))
			        override_prop.setOs(opmap.get("os"));
				else
					override_prop.setOs("n/a");
				
				if(opmap.containsKey("is_ha_test"))
					override_prop.setIs_ha_test(opmap.get("is_ha_test"));
				else
					override_prop.setIs_ha_test("n/a");
				
				if(opmap.containsKey("ambari_version"))
					override_prop.setAmbari_version(opmap.get("ambari_version"));
				else
					override_prop.setAmbari_version("n/a");
					
				if(opmap.containsKey("upgrade_to"))
					override_prop.setUpgrade_to(opmap.get("upgrade_to"));
				else
					override_prop.setUpgrade_to("n/a");
					
				if(opmap.containsKey("jdk_version"))
					override_prop.setJdk_version(opmap.get("jdk_version"));
	    		else
					override_prop.setJdk_version("n/a");
				
			    if(opmap.containsKey("motd_enable"))
					override_prop.setMotd_enable(opmap.get("motd_enable"));
				else
					override_prop.setMotd_enable("n/a");
					
				if(opmap.containsKey("ambari_agent_user"))
					override_prop.setAmbari_agent_user(opmap.get("ambari_agent_user"));
				else
					override_prop.setAmbari_agent_user("n/a");
						
				if(opmap.containsKey("mr_framework"))
					override_prop.setMr_framework(opmap.get("mr_framework"));
				else
					override_prop.setMr_framework("n/a");
					
				if(opmap.containsKey("customized_services_users"))
					override_prop.setCustomized_services_users(opmap.get("customized_services_users"));
				else
					override_prop.setCustomized_services_users("n/a");
			
				if(opmap.containsKey("security"))
					override_prop.setSecurity(opmap.get("security"));
				else
					override_prop.setSecurity("n/a");
									
				if(opmap.containsKey("ambari_custom_user"))
					override_prop.setAmbari_custom_user(opmap.get("ambari_custom_user"));
				else
					override_prop.setAmbari_custom_user("n/a");
										
				if(opmap.containsKey("ambari_old_branch"))
					override_prop.setAmbari_old_branch(opmap.get("ambari_old_branch"));
				else
					override_prop.setAmbari_old_branch("n/a");
					
				if(opmap.containsKey("stack_upgrade_to"))
					override_prop.setStack_upgrade_to(opmap.get("stack_upgrade_to"));
				else
					override_prop.setStack_upgrade_to("n/a");
					
				if(opmap.containsKey("STACK"))
					override_prop.setSTACK(opmap.get("STACK"));
				else
					override_prop.setSTACK("n/a");
							
				if(opmap.containsKey("hdp_repo_baseurl"))
			    	override_prop.setHdp_repo_baseurl(opmap.get("hdp_repo_baseurl"));
				else
					override_prop.setHdp_repo_baseurl("n/a");
					
				if(opmap.containsKey("testsuite_file"))
					override_prop.setTestsuite_file(opmap.get("testsuite_file"));
				else
					override_prop.setTestsuite_file("n/a");
					
				if(opmap.containsKey("xa_database_flavor"))
					override_prop.setXa_database_flavor(opmap.get("xa_database_flavor"));
				else
					override_prop.setXa_database_flavor("n/a");
						
				if(opmap.containsKey("database_flavor"))
					override_prop.setDatabase_flavor(opmap.get("database_flavor"));
				else
					override_prop.setDatabase_flavor("n/a");
							
				if(opmap.containsKey("ambari_db"))
					override_prop.setAmbari_db(opmap.get("ambari_db"));
			    else
				    override_prop.setAmbari_db("n/a");
				
				if(opmap.containsKey("wire_encryption"))
					override_prop.setWire_encryption(opmap.get("wire_encryption"));
				else
					override_prop.setWire_encryption("n/a");
			
			newConfig.setOverride_properties(override_prop);
			
			finalMap.put((details.get(0)).getConfigName() , newConfig);
		}
		
		/*
	        JSONObject json = new JSONObject();
	        json.putAll( finalMap );
		*/
		
		Gson gson = new Gson();
		String json = gson.toJson(finalMap);
		
		System.out.println("\n\n\n"+json);
		
		return finalMap;
	}
	
	
}
