package com.example.project.attendence;

public class Management {
	String id;
	
	int tid;
	double fine;
	String pstatus;
	public Management(int tid, double fine, String pstatus) {
		super();
		this.tid = tid;
		this.fine = fine;
		this.pstatus = pstatus;
	}
	public Management(String id, int tid, double fine, String pstatus) {
		super();
		this.id = id;
		this.tid = tid;
		this.fine = fine;
		this.pstatus = pstatus;
	}
	public Management() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public double getFine() {
		return fine;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
	public String getPstatus() {
		return pstatus;
	}
	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}
	
	
}
