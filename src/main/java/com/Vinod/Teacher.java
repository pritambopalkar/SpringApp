package com.Vinod;

public  class Teacher implements Common {

	private String teachername;

	
	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	public void displayInfo() {
		System.out.println("Hello Teacher "+getTeachername());
	}

}
