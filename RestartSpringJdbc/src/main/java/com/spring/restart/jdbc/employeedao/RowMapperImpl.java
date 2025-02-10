package com.spring.restart.jdbc.employeedao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.restart.jdbc.entities.Employeeinfo;

public class RowMapperImpl implements RowMapper<Employeeinfo> {

	public Employeeinfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employeeinfo info = new Employeeinfo();
		info.setEmp_id(rs.getString(1));
		info.setEmp_name(rs.getString(2));
		info.setEmp_profile(rs.getString(3));
		info.setEmp_salary(rs.getInt(4));
		info.setEmp_location(rs.getString(5));
		return info;
	}
}
