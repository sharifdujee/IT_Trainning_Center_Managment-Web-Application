package com.example.project;

public class Certificate {
	int tid;
	String name;
	String division;
	String districit;
	double progre;
	String course;
	String status;
	public Certificate(int tid, String name, String division, String districit, double progre, String course,
			String status) {
		super();
		this.tid = tid;
		this.name = name;
		this.division = division;
		this.districit = districit;
		this.progre = progre;
		this.course = course;
		this.status = status;
	}
	public Certificate() {
		super();
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getDistricit() {
		return districit;
	}
	public void setDistricit(String districit) {
		this.districit = districit;
	}
	public double getProgre() {
		return progre;
	}
	public void setProgre(double progre) {
		this.progre = progre;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
