package com.spring.restart.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.restart.jdbc.employeedao.Empdao;
import com.spring.restart.jdbc.employeedao.Empdaoimpl;
import com.spring.restart.jdbc.entities.Employeeinfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hi folks get ready to work" );
        //Spring Jdbc Template byusing xml file
        
//      ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/restart/jdbc/restartjdbc.xml");
        
        //Jdbc configuration by using annotation
        
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfiguartion.class);
        
        Empdao ed = context.getBean("empdao",Empdao.class);
        
        Employeeinfo empinfo = new Employeeinfo();
        
        	//insert record into table
        
//        empinfo.setEmp_id("IN01706");
//        empinfo.setEmp_name("Akshay Bhosale");
//        empinfo.setEmp_profile("Software Developer");
//        empinfo.setEmp_salary(50000);
//        empinfo.setEmp_location("Mumbai");
        
        	//update record
//        empinfo.setEmp_id("IN01708");
//        empinfo.setEmp_profile("DevOps Engineer");
//        empinfo.setEmp_location("Pune");
        
           //delete record
//          empinfo.setEmp_id("IN01703");
          
          //Get Single Record
          empinfo.setEmp_id("IN01705");
          
//        int result =ed.insert(empinfo);
//        int result = ed.updateinfo(empinfo);
//        int result = ed.deleterecord(empinfo);
          
         //Get Single Record
//        Employeeinfo edinfo=ed.getEmployeeRecord("IN01705");
//        System.out.println(edinfo);
//        System.out.println("Number of row inserted "+result);
          
          List<Employeeinfo>empl = ed.getAllEmployee();
          for(Employeeinfo ls:empl) {
        	  System.out.println(ls);
          }
    }
}
