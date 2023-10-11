package com.example.project.attendence;

public class Attendence {
	String id;
	int tid;
	String date;
	String status;
	public Attendence(  int tid, String date, String status) {
		super();
		this.tid = tid;
		this.date = date;
		this.status = status;
	}
	
	
	

	public Attendence(String status) {
		super();
		this.status = status;
	}




	public Attendence(String id, int tid, String date, String status) {
		super();
		this.id = id;
		this.tid = tid;
		this.date = date;
		this.status = status;
	}



	public Attendence() {
		super();
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
