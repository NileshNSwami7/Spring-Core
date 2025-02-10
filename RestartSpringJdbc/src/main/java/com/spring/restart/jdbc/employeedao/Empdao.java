package com.spring.restart.jdbc.employeedao;

import java.util.List;

import com.spring.restart.jdbc.entities.Employeeinfo;

public interface Empdao {
	public int insert(Employeeinfo empinfo);
	public int updateinfo(Employeeinfo empinfo);
	public int deleterecord(Employeeinfo empinfo);
	public Employeeinfo getEmployeeRecord(String emp_id);
	public List<Employeeinfo>getAllEmployee();
}
