package com.example.project;

public class Comission {
	int tid;
	double marks;
	double comission;
	public Comission(int tid, double marks, double comission) {
		super();
		this.tid = tid;
		this.marks = marks;
		this.comission = comission;
	}
	public Comission(int tid, double comission) {
		super();
		this.tid = tid;
		this.comission = comission;
	}
	public Comission() {
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
	public double getComission() {
		return comission;
	}
	public void setComission(double comission) {
		this.comission = comission;
	}
	
	

}
