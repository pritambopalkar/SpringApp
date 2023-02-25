package com.Vinod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("Config.xml");
		
		
		  Common c1 = (Common) ac.getBean("common"); 
		  Common c2 = (Common) ac.getBean("common");
		  Common c3 = (Common) ac.getBean("common");
		  Common c4 = (Common) ac.getBean("common");
		  Common c5 = (Common) ac.getBean("common");
		  
		  	c1.displayInfo();
		  	c2.displayInfo();
		  	c3.displayInfo();
		  	c4.displayInfo();
		  	c5.displayInfo();
			
	}
}
