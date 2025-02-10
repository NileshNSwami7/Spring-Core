package com.spring.restart.jdbc.employeedao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.restart.jdbc.entities.Employeeinfo;

@Component("empdao")
public class Empdaoimpl implements Empdao{

	@Autowired
	private JdbcTemplate jdbctemp;
	
	public int insert(Employeeinfo empinfo) {
		String query = "insert into employeeinformation(emp_id,emp_name,emp_profile,emp_salary,emp_location) values(?,?,?,?,?)";
		int result = this.jdbctemp.update(query,empinfo.getEmp_id(),empinfo.getEmp_name(),empinfo.getEmp_profile(),
				empinfo.getEmp_salary(),empinfo.getEmp_location());
		return result;
	}
	
	public int updateinfo(Employeeinfo empinfo) {
		String query = "update employeeinformation set emp_profile=? , emp_location=? where emp_id=?";
		int result = this.jdbctemp.update(query,empinfo.getEmp_profile(),empinfo.getEmp_location(),empinfo.getEmp_id());
		return result;
	}
	
	public int deleterecord(Employeeinfo empinfo) {
		String query = "delete from employeeinformation where emp_id=?";
		int result = this.jdbctemp.update(query,empinfo.getEmp_id());
		return result;
	}
	
	public Employeeinfo getEmployeeRecord(String emp_id) {
		String query = "select * from employeeinformation where emp_id=?";
		RowMapper<Employeeinfo>rowMapper = new RowMapperImpl();
		Employeeinfo empinfo =this.jdbctemp.queryForObject(query,rowMapper,emp_id);
		return empinfo;
	}
	
	public List<Employeeinfo>getAllEmployee(){
		String query = "select * from employeeinformation";
		List<Employeeinfo> inf= this.jdbctemp.query(query, new RowMapperImpl());
		return inf;
	}
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

	
	
}
