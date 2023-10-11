package com.example.project;

public class AdmissionFee {
	int tid;
	int courseid;
	double cprice;
	String reference;
	double nprice;
	double fpay;
	public AdmissionFee(int tid,int courseid, double cprice, String reference, double nprice, double fpay) {
		super();
		this.tid = tid;
		this.cprice = cprice;
		this.reference = reference;
		this.nprice = nprice;
		this.fpay = fpay;
	}
	public AdmissionFee() {
		super();
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public double getCprice() {
		return cprice;
	}
	public void setCprice(double cprice) {
		this.cprice = cprice;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public double getNprice() {
		return nprice;
	}
	public void setNprice(double nprice) {
		this.nprice = nprice;
	}
	public double getFpay() {
		return fpay;
	}
	public void setFpay(double fpay) {
		this.fpay = fpay;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	
	
	
	

}
