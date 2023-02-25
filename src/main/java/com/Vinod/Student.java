package com.Vinod;

public class Student implements Common {

	private String name;

	private int rollnumber;

	
	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public void setName(String Ramesh) {
		this.name = Ramesh;
	}

	public String getName() {
		return name;
	}

	public void displayInfo() {
		System.out.println("Hello Student: " +getRollnumber());

	}

}
