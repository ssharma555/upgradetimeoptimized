package com.upgrade.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

public class IntegerRowMapper implements RowMapper<Integer>{

	@Override
	public Integer mapRow(ResultSet rs, int arg1) throws SQLException {
		return rs.getInt(1);
	}
	
	
}
