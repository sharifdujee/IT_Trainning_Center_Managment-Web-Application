package com.example.project;

public class Result {
	int tid;
	double marks;
	String klevel;
	public Result() {
		super();
	}
	public Result(int tid, double marks, String klevel) {
		super();
		this.tid = tid;
		this.marks = marks;
		this.klevel = klevel;
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
	public String getKlevel() {
		return klevel;
	}
	public void setKlevel(String klevel) {
		this.klevel = klevel;
	}
				
	

}
