package com.Pritam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.Models.Employee;

@Component
public class EmployeeDetails {

	public Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	@Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void myName() {

		System.out.println("Hello " + getEmployee().getEmp_fname() + " " + getEmployee().getEmp_Lname());
	}

}
