package com.Pritam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Application {

	public static void main(String[] args) {
		
		
		  ApplicationContext ac = new ClassPathXmlApplicationContext("annotation-config.xml");
		  
		  EmployeeDetails d1 = ac.getBean("employeeDetails" , EmployeeDetails.class);
		  
		  d1.myName();
		
		
		
	}

}
