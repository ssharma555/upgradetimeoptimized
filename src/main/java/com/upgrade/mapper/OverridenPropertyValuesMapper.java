package com.upgrade.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.upgrade.pojo.OverridenPropertyValues;

public class OverridenPropertyValuesMapper implements RowMapper<OverridenPropertyValues>{

	@Override
	public OverridenPropertyValues mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		OverridenPropertyValues opv = new OverridenPropertyValues();
		
		opv.setPropName(rs.getString("prop_name"));
		opv.setPropValue(rs.getString("prop_value"));
		
		return opv;
	}
    
}
