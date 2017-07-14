package com.upgrade.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class JenkinsParameters {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String storeJenkinsParameters(String jobId){
		
		String url = "http://linux-jenkins.qe.hortonworks.com:8080/job/Run-Ambari-Setup/";
		url += jobId + "/api/json?pretty=true";
		
		String urlRunId = "http://linux-jenkins.qe.hortonworks.com:8080/job/Run-Ambari-Setup/";
		urlRunId += jobId + "/api/xml?xpath=//parameter/name[text()='RUN_ID']/../value";
		
		
		//System.out.println("\n\n\n\n\n"+url+"\n\n\n\n\n");
		
		RestTemplate restTemplate = new RestTemplate();
		String body = restTemplate.getForObject(url, String.class).trim();
		String runId = restTemplate.getForObject(urlRunId, String.class);
		
		//always result of form  :    <value>54832</value>
		
		int left=0,right=1,i,flag=0;
		for(i=0;i<runId.length();i++){
			if(runId.charAt(i) == '>' && flag == 0){
				left = i;
				flag = 1;
			}
			if(runId.charAt(i) == '<' && flag == 1){
				right = i;
			}
		}
		String finalRunId = runId.substring(left, right);
		
		jdbcTemplate.update(
				new PreparedStatementCreator() {

					@Override
					public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
						PreparedStatement pst = connection.prepareStatement("insert into jenkins_parameters(run_id,parameters) values(?,?)");
						pst.setString(1, finalRunId);
						pst.setString(2, body);
						return pst;
					}

			} );
		
		System.out.println("\n\n\n\n\n"+finalRunId+"\n\n\n\n\n");
		return "Successfully stored the cluster information";
	}
	
}
