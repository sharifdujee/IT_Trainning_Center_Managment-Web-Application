package com.example.project;

public class Course {
	int cid;
	int cid1;
	String cname;
	String status;
	double price;
	public Course(int cid,int cid1, String cname, String status, double price) {
		super();
		this.cid1 = cid;
		this.cname = cname;
		this.status = status;
		this.price = price;
	}
	
	
	public Course(int cid, String cname, String status, double price) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.status = status;
		this.price = price;
	}


	public Course(int cid, int cid1, double price) {
		super();
		this.cid = cid;
		this.price = price;
	}
	
	

	
	public Course() {
		super();
	}


	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
