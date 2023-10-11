package com.example.project.result;

public class Profile {
	int tid;
	String name;
	String username;
	String email;
	String dob;
	String degree;
	double result;
	double marks;
	String klevel;
	double scholarship;
	double comission;
	String mexamid;
	double mmarks;
	String mstatus;
	String fexamid;
	double fmarks;
	String fstatus;
	String course;
	String pstatus;
	String progre;
	String pastatus;
	
	public Profile(int tid, String name, String username, String email, String dob, String degree, double result,
			double marks, String klevel, double scholarship, double comission, String mexamid, double mmarks,
			String mstatus, String fexamid, double fmarks, String fstatus, String course,String pstatus,String progre,String pastatus) {
		super();
		this.tid = tid;
		this.name = name;
		this.username = username;
		this.email = email;
		this.dob = dob;
		this.degree = degree;
		this.result = result;
		this.marks = marks;
		this.klevel = klevel;
		this.scholarship = scholarship;
		this.comission = comission;
		this.mexamid = mexamid;
		this.mmarks = mmarks;
		this.mstatus = mstatus;
		this.fexamid = fexamid;
		this.fmarks = fmarks;
		this.fstatus = fstatus;
		this.course = course;
		this.pstatus = pstatus;
		this.progre = progre;
		this.pastatus = pastatus;
		
		
		
	}
	
	public Profile(int tid, String mexamid, double mmarks, String mstatus, String fexamid, double fmarks,
			String fstatus) {
		super();
		this.tid = tid;
		this.mexamid = mexamid;
		this.mmarks = mmarks;
		this.mstatus = mstatus;
		this.fexamid = fexamid;
		this.fmarks = fmarks;
		this.fstatus = fstatus;
	}

	public Profile() {
		super();
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
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
	public double getScholarship() {
		return scholarship;
	}
	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}
	public double getComission() {
		return comission;
	}
	public void setComission(double comission) {
		this.comission = comission;
	}
	public String getMexamid() {
		return mexamid;
	}
	public void setMexamid(String mexamid) {
		this.mexamid = mexamid;
	}
	public double getMmarks() {
		return mmarks;
	}
	public void setMmarks(double mmarks) {
		this.mmarks = mmarks;
	}
	public String getMstatus() {
		return mstatus;
	}
	public void setMstatus(String mstatus) {
		this.mstatus = mstatus;
	}
	public String getFexamid() {
		return fexamid;
	}
	public void setFexamid(String fexamid) {
		this.fexamid = fexamid;
	}
	public double getFmarks() {
		return fmarks;
	}
	public void setFmarks(double fmarks) {
		this.fmarks = fmarks;
	}
	public String getFstatus() {
		return fstatus;
	}
	public void setFstatus(String fstatus) {
		this.fstatus = fstatus;
	}
	

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getPstatus() {
		return pstatus;
	}

	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;	
	}

	public String getProgre() {
		return progre;
	}
	public void setProgres(String progre) {
		this.progre = progre;
	}

	public String getPastatus() {
		return pastatus;
	}

	public void setPastatus(String pastatus) {
		this.pastatus = pastatus;
	}

	public void setProgre(String progre) {
		this.progre = progre;
	}
	
}
