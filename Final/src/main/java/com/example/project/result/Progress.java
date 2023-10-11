package com.example.project.result;

public class Progress {
	String id;
	int tid;
	int midno;
	String midstatus;
	int finalno;
	String finalstatus;
	double progre;
	public Progress(String id, int tid, int midno, String midstatus, int finalno, String finalstatus, double progre) {
		super();
		this.id = id;
		this.tid = tid;
		this.midno = midno;
		this.midstatus = midstatus;
		this.finalno = finalno;
		this.finalstatus = finalstatus;
		this.progre = progre;
	}
	
	
	
	public Progress(int tid, int midno, String midstatus, int finalno, String finalstatus, double progre) {
		super();
		this.tid = tid;
		this.midno = midno;
		this.midstatus = midstatus;
		this.finalno = finalno;
		this.finalstatus = finalstatus;
		this.progre = progre;
	}



	public Progress() {
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
	public int getMidno() {
		return midno;
	}
	public void setMidno(int midno) {
		this.midno = midno;
	}
	public String getMidstatus() {
		return midstatus;
	}
	public void setMidstatus(String midstatus) {
		this.midstatus = midstatus;
	}
	public int getFinalno() {
		return finalno;
	}
	public void setFinalno(int finalno) {
		this.finalno = finalno;
	}
	public String getFinalstatus() {
		return finalstatus;
	}
	public void setFinalstatus(String finalstatus) {
		this.finalstatus = finalstatus;
	}
	public double getProgre() {
		return progre;
	}
	public void setProgre(double progre) {
		this.progre = progre;
	}
	
	
	
	
	
}	