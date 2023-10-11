package com.example.project;

public class TraineeLogin {
	int tid;
	String username;
	String email;
	String password;
	public TraineeLogin(int tid, String username, String email, String password) {
		super();
		this.tid= tid;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public TraineeLogin() {
		super();
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
