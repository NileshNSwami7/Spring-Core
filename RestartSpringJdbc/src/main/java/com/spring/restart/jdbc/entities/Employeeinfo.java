package com.spring.restart.jdbc.entities;

public class Employeeinfo {
	
	private String emp_id;
	private String emp_name;
	private String emp_profile;
	private int emp_salary;
	private String emp_location;
	public Employeeinfo() {
		super();
	}
	public Employeeinfo(String emp_id, String emp_name, String emp_profile, int emp_salary, String emp_location) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_profile = emp_profile;
		this.emp_salary = emp_salary;
		this.emp_location = emp_location;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_profile() {
		return emp_profile;
	}
	public void setEmp_profile(String emp_profile) {
		this.emp_profile = emp_profile;
	}
	public int getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String getEmp_location() {
		return emp_location;
	}
	public void setEmp_location(String emp_location) {
		this.emp_location = emp_location;
	}
	@Override
	public String toString() {
		return "Employeeinfo [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_profile=" + emp_profile
				+ ", emp_salary=" + emp_salary + ", emp_location=" + emp_location + "]";
	}
	
	
	
	
	
}
