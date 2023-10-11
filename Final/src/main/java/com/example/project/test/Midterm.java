package com.example.project.test;

public class Midterm {
	String mexamid;
	int tid;
	double a1;
	double a2;
	double a3;
	double a4;
	double a5;
	double marks;
	String status;
	public Midterm(String mexamid, int tid, double a1, double a2, double a3, double a4, double a5, double marks,String status) {
		super();
		this.mexamid = mexamid;
		this.tid = tid;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		this.a5 = a5;
		this.marks = marks;
		this.status = status;
	}
	public Midterm() {
		super();
	}
	public Midterm( String mexamid, int tid, double marks, String status) {
		super();
		this.mexamid = mexamid;
		this.tid = tid;
		this.marks = marks;
		this.status = status;
	}
	
	
	public String getMexamid() {
		return mexamid;
	}

	public void setMexamid(String mexamid) {
		this.mexamid = mexamid;
	}

	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public double getA1() {
		return a1;
	}
	

	public void setA1(double a1) {
		this.a1 = a1;
	}
	public double getA2() {
		return a2;
	}
	public void setA2(double a2) {
		this.a2 = a2;
	}
	public double getA3() {
		return a3;
	}
	public void setA3(double a3) {
		this.a3 = a3;
	}
	public double getA4() {
		return a4;
	}
	public void setA4(double a4) {
		this.a4 = a4;
	}
	public double getA5() {
		return a5;
	}
	public void setA5(double a5) {
		this.a5 = a5;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
