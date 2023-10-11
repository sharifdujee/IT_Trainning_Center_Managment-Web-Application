package com.example.project;

public class Scholarship {
	int tid;
	double marks;
	double scholarship;
	public Scholarship(int tid, double marks, double scholarship) {
		super();
		this.tid = tid;
		this.marks = marks;
		this.scholarship = scholarship;
	}
	
	
	public Scholarship(int tid, double marks) {
		super();
		this.tid = tid;
		this.marks = marks;
	}


	public Scholarship() {
		super();
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public double getScholarship() {
		return scholarship;
	}
	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}
	
	

}
