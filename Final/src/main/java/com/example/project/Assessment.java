package com.example.project;

public class Assessment {
	int tid;
	double q1;
	double q2;
	double q3;
	double q4;
	double q5;
	double q6;
	double q7;
	double q8;
	double q9;
	double q10;
	double marks;
	String klevel;
	public Assessment(int tid, double q1, double q2, double q3, double q4, double q5, double q6, double q7, double q8,
			double q9, double q10, double marks, String klevel) {
		super();
		this.tid = tid;
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.q5 = q5;
		this.q6 = q6;
		this.q7 = q7;
		this.q8 = q8;
		this.q9 = q9;
		this.q10 = q10;
		this.marks = marks;
		this.klevel = klevel;
	}
	public Assessment() {
		super();
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public double getQ1() {
		return q1;
	}
	public void setQ1(double q1) {
		this.q1 = q1;
	}
	public double getQ2() {
		return q2;
	}
	public void setQ2(double q2) {
		this.q2 = q2;
	}
	public double getQ3() {
		return q3;
	}
	public void setQ3(double q3) {
		this.q3 = q3;
	}
	public double getQ4() {
		return q4;
	}
	public void setQ4(double q4) {
		this.q4 = q4;
	}
	public double getQ5() {
		return q5;
	}
	public void setQ5(double q5) {
		this.q5 = q5;
	}
	public double getQ6() {
		return q6;
	}
	public void setQ6(double q6) {
		this.q6 = q6;
	}
	public double getQ7() {
		return q7;
	}
	public void setQ7(double q7) {
		this.q7 = q7;
	}
	public double getQ8() {
		return q8;
	}
	public void setQ8(double q8) {
		this.q8 = q8;
	}
	public double getQ9() {
		return q9;
	}
	public void setQ9(double q9) {
		this.q9 = q9;
	}
	public double getQ10() {
		return q10;
	}
	public void setQ10(double q10) {
		this.q10 = q10;
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
