package com.cisco.training.basics;

public class Student {
	
	int rollNo;
	String name;
	Grade grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, Grade grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
	
	

}
