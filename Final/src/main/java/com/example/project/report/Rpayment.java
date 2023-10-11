package com.example.project.report;

public class Rpayment {
	int tid;
	double tuitionfee;
	double scholarship;
	double comission;
	double payable;
	String status;
	
	public Rpayment(int tid, double tuitionfee, double scholarship, double comission, double payable, String status) {
		super();
		this.tid = tid;
		this.tuitionfee = tuitionfee;
		this.scholarship = scholarship;
		this.comission = comission;
		this.payable = payable;
		this.status = status;
	}
	
	public Rpayment() {
		super();
	}

	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
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
	
	

}
