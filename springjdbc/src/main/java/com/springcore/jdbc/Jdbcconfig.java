package com.springcore.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.dao.Studentdao;
import com.springjdbc.dao.Studentimpl;

@Configuration
@ComponentScan(basePackages={"com.springjdbc.dao"})
public class Jdbcconfig {

	@Bean ("ds")
	public DataSource getDatasource() {
		
		DriverManagerDataSource dmd = new DriverManagerDataSource();
		dmd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmd.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dmd.setUsername("root");
		dmd.setPassword("Tiger1");
		
		return dmd;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getjdbctemplate() {
		JdbcTemplate jdbctemplate = new JdbcTemplate();
		jdbctemplate.setDataSource(getDatasource());
		return jdbctemplate;
	}
	
	
}
