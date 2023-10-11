package com.example.project.result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProfileDA {
	Connection con;
	PreparedStatement pst;
	public Profile traineeprofileById(int tid) {
		Profile pro = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("SELECT trainee.tid,trainee.name,trainee.username,trainee.email,trainee.dob,trainee.degree,trainee.result,assessment.marks,assessment.klevel,scholarships.scholarship,comissions.comission,midterm.mexamid,midterm.marks,midterm.status,final.fexamid,final.marks,final.status, admission.course, management.pstatus , progress.progre, payment.status FROM trainee JOIN assessment ON trainee.tid = assessment.tid JOIN scholarships ON trainee.tid = scholarships.tid JOIN comissions ON trainee.tid = comissions.tid JOIN midterm ON trainee.tid= midterm.tid JOIN final ON trainee.tid = final.tid  JOIN admission ON trainee.tid = admission.tid JOIN management ON trainee.tid = management.tid JOIN progress ON trainee.tid = progress.tid JOIN payment ON trainee.tid = payment.tid WHERE trainee.tid=?");
			pst.setInt(1, tid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				pro = new Profile(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getDouble(7),rs.getDouble(8),rs.getString(9),rs.getDouble(10),rs.getDouble(11),rs.getString(12),rs.getDouble(13),rs.getString(14),rs.getString(15),rs.getDouble(16),rs.getString(17),rs.getString(18),rs.getString(19),rs.getString(20),rs.getString(21));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
			e.printStackTrace();
		}
		return pro;
	}
	
	public List<Profile>allresult(){
		List<Profile>adresult = new ArrayList<>();
		Profile pr ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("SELECT midterm.tid,midterm.mexamid,midterm.marks, midterm.status,final.fexamid,final.marks,final.status FROM midterm JOIN final ON midterm.tid= final.tid");
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				
				pr = new Profile(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getString(7));
				adresult.add(pr);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		return adresult;
	}

public List<Profile> resultById(int tid) {
	List<Profile>showResult = new ArrayList<>(); 
	Profile pr ;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
		pst = con.prepareStatement("SELECT midterm.tid,midterm.mexamid,midterm.marks, midterm.status,final.fexamid,final.marks,final.status FROM midterm JOIN final ON midterm.tid= final.tid where midterm. tid=" + tid );
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			pr = new Profile (rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getString(7));
		 showResult.add(pr);
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);	
	}
	return  showResult ;
}
}

