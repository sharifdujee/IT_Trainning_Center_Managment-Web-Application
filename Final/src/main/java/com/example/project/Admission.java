package com.example.project;

public class Admission {
	int tid;
	String name;
	String username;
	String email;
	String password;
	String dob;
	String gender;
	String contact;
	String address;
	String city;
	int postcode;
	String division;
	String districit;
	String skills;
	String qualification;
	String course;
	double scholarship;
	double comission;
	String Suggestion;
	
	public Admission(int tid, String name, String username, String email, String password, String dob, String gender,
			String contact, String address, String city, int postcode, String division, String districit, String skills,
			String qualification, String course) {
		super();
		this.tid = tid;
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.contact = contact;
		this.address = address;
		this.city = city;
		this.postcode = postcode;
		this.division = division;
		this.districit = districit;
		this.skills = skills;
		this.qualification = qualification;
		this.course = course;
	}
	public Admission() {
		super();
	}
	




	public Admission(int tid, String name, String username, String email, String dob, String division,
			String districit) {
		super();
		this.tid = tid;
		this.name = name;
		this.username = username;
		this.email = email;
		this.dob = dob;
		this.division = division;
		this.districit = districit;
	}
	public Admission(int tid, String name, String username, String email, String dob, String gender, double scholarship,
			double comission, String suggestion) {
		super();
		this.tid = tid;
		this.name = name;
		this.username = username;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.scholarship = scholarship;
		this.comission = comission;
		Suggestion = suggestion;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
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
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
