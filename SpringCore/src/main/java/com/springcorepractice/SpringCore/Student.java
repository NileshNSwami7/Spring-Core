package com.springcorepractice.SpringCore;

public class Student {
	
	private int studentid;
	private String studentname;
	private String Studentaddress;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddress() {
		return Studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		Studentaddress = studentaddress;
	}
	public Student(int studentid, String studentname, String studentaddress) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		Studentaddress = studentaddress;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", Studentaddress=" + Studentaddress
				+ "]";
	}
	
	
}
