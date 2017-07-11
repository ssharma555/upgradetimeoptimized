package com.upgrade.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.upgrade.pojo.Configuration;

public class ConfigurationMapper implements RowMapper<Configuration>{

	@Override
	public Configuration mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Configuration config = new Configuration();
		
		config.setCompName(rs.getString("comp_name"));
		config.setConfigId(rs.getInt("config_id"));
		config.setConfigName(rs.getString("config_name"));
		config.setDashboardConfigId(rs.getInt("dashboard_config_id"));
		config.setLabels(rs.getString("label"));
		config.setNumberOfNodes(rs.getInt("number_nodes"));
		config.setNumberOfSplits(rs.getInt("number_splits"));
		
		return config;
	}

}
