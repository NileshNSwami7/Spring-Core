package com.spring.restart.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.restart.jdbc.employeedao.Empdaoimpl;
import com.spring.restart.jdbc.entities.Employeeinfo;

@Configuration
@ComponentScan("com.spring.restart.jdbc.employeedao")
public class SpringJdbcConfiguartion {
	
	@Bean(name= {"ds"})
	public DataSource getDataSource() {
		DriverManagerDataSource drivermanager = new DriverManagerDataSource();
		drivermanager.setDriverClassName("com.mysql.cj.jdbc.Driver");
		drivermanager.setUrl("jdbc:mysql://localhost:3306/company_management");
		drivermanager.setUsername("root");
		drivermanager.setPassword("Tiger@1");
		return drivermanager;
	}
	
	@Bean(name= {"jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbctemplate = new JdbcTemplate();
		jdbctemplate.setDataSource(getDataSource());
		return jdbctemplate;
	}
	
//	@Bean(name= {"empdao"})
//	public Empdaoimpl getEmpdaoimpl() {
//		Empdaoimpl epiml = new Empdaoimpl();
//		epiml.setJdbctemp(getJdbcTemplate());
//		return epiml;
//	}
}
