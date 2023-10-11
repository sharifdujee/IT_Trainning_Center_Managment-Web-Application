package com.example.project;

public class Trainee {
	int tid;
	String name;
	String username;
	String email;
	String password;
	String dob;
	String gender;
	String degree;
	String subject;
	String session;
	String institution;
	String result;
	String division;
	String districit;
	String reference;
	String img;
	public Trainee(int tid, String name, String username, String email, String password, String dob,
			String gender,String degree, String subject, String session, String institution, String result, String division,
			String district, String reference,String img) {
		super();
		this.tid = tid;
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.dob= dob;
		this.degree = degree;
		this.subject = subject;
		this.session = session;
		this.institution = institution;
		this.result = result;
		this.districit = division;
		this.division = districit;
		this.reference = reference;
		this.img = img;
		
	}
	public Trainee() {
		super();
	}
	public int getNid() {
		return tid;
	}
	public void setNid(int nid) {
		this.tid = nid;
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
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getDistricit() {
		return districit;
	}
	public void setDistricit(String districit) {
		this.districit = districit;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getImg() {
		return img;
	}
	public void setimg(String img) {
		this.img = img;
	}
	
	
	

}
