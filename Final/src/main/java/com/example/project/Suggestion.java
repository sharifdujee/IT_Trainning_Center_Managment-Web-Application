package com.example.project;

public class Suggestion {
	int tid;
	double marks;
	String klevel;
	String course;
	public Suggestion(int tid, double marks, String klevel, String course) {
		super();
		this.tid = tid;
		this.marks = marks;
		this.klevel = klevel;
		this.course = course;
	}
	
	public Suggestion(int tid, String klevel, String course) {
		super();
		this.tid = tid;
		this.klevel = klevel;
		this.course = course;
	}
	

	public Suggestion(int tid, String klevel) {
		super();
		this.tid = tid;
		this.klevel = klevel;
	}

	public Suggestion() {
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
	public String getKlevel() {
		return klevel;
	}
	public void setKlevel(String klevel) {
		this.klevel = klevel;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
