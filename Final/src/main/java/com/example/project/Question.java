package com.example.project;

public class Question {
	int qid;
	String queston1;
	String queston2;
	String queston3;
	String queston4;
	String queston5;
	String queston6;
	String queston7;
	String queston8;
	String queston9;
	String queston10;
	String answer1;
	boolean answer;
	public Question(int qid,String queston1, String queston2, String queston3, String queston4, String queston5,
			String queston6, String queston7, String queston8, String queston9, String queston10, boolean answer) {
		super();
		this.qid = qid;
		this.queston1 = queston1;
		this.queston2 = queston2;
		this.queston3 = queston3;
		this.queston4 = queston4;
		this.queston5 = queston5;
		this.queston6 = queston6;
		this.queston7 = queston7;
		this.queston8 = queston8;
		this.queston9 = queston9;
		this.queston10 = queston10;
		this.answer = answer;
	}
	public Question() {
		super();
	}
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQueston1() {
		return queston1;
	}
	public void setQueston1(String queston1) {
		this.queston1 = queston1;
	}
	public String getQueston2() {
		return queston2;
	}
	public void setQueston2(String queston2) {
		this.queston2 = queston2;
	}
	public String getQueston3() {
		return queston3;
	}
	public void setQueston3(String queston3) {
		this.queston3 = queston3;
	}
	public String getQueston4() {
		return queston4;
	}
	public void setQueston4(String queston4) {
		this.queston4 = queston4;
	}
	public String getQueston5() {
		return queston5;
	}
	public void setQueston5(String queston5) {
		this.queston5 = queston5;
	}
	public String getQueston6() {
		return queston6;
	}
	public void setQueston6(String queston6) {
		this.queston6 = queston6;
	}
	public String getQueston7() {
		return queston7;
	}
	public void setQueston7(String queston7) {
		this.queston7 = queston7;
	}
	public String getQueston8() {
		return queston8;
	}
	public void setQueston8(String queston8) {
		this.queston8 = queston8;
	}
	public String getQueston9() {
		return queston9;
	}
	public void setQueston9(String queston9) {
		this.queston9 = queston9;
	}
	public String getQueston10() {
		return queston10;
	}
	public void setQueston10(String queston10) {
		this.queston10 = queston10;
	}
	public boolean isAnswer() {
		return answer;
	}
	public void setAnswer(boolean answer) {
		this.answer = answer;
	}
	

}
