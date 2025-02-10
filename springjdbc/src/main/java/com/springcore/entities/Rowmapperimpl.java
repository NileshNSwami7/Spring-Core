package com.springcore.entities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mysql.cj.protocol.Resultset;

public class Rowmapperimpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student st = new Student();
		st.setId(rs.getInt(1));
		st.setName(rs.getString(2));
		st.setCity(rs.getString(3));
		
		return st;
	}
	
	
}
