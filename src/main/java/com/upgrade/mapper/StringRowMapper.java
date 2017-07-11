

package com.upgrade.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;



public class StringRowMapper implements org.springframework.jdbc.core.RowMapper<String>{
	
	public String mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		return rs.getString(1);
	}

}
