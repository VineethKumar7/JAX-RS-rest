package com.cts.rest;

public class student {
	public String sname;
	public int rollno;
	public int marks;
	
	
	public student(int rollno) {
		super();
		this.rollno = rollno;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String sname, int rollno, int marks) {
		super();
		this.sname = sname;
		this.rollno = rollno;
		this.marks = marks;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
