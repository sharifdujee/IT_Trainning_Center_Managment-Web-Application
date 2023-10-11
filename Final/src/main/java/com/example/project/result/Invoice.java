package com.example.project.result;

public class Invoice {
	int tid;
	String name;
	String username;
	String course;
	double tuitionfee;
	double scholarship;
	double comission;
	double payable;
	String status;
	double fine;
	public Invoice(int tid, String name, String username, String course, double tuitionfee, double scholarship,
			double comission, double payable, String status,double fine) {
		super();
		this.tid = tid;
		this.name = name;
		this.username = username;
		this.course = course;
		this.tuitionfee = tuitionfee;
		this.scholarship = scholarship;
		this.comission = comission;
		this.payable = payable;
		this.status = status;
		this.fine = fine;
	}
	public Invoice() {
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public double getTuitionfee() {
		return tuitionfee;
	}
	public void setTuitionfee(double tuitionfee) {
		this.tuitionfee = tuitionfee;
	}
	public double getScholarship() {
		return scholarship;
	}
	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}
	public double getComission() {
		return comission;
	}
	public void setComission(double comission) {
		this.comission = comission;
	}
	public double getPayable() {
		return payable;
	}
	public void setPayable(double payable) {
		this.payable = payable;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getFine() {
		return fine;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
	
	

}
