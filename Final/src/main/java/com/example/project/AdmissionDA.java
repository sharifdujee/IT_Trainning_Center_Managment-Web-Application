package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class AdmissionDA {
	Connection con;
	PreparedStatement pst;
	public void admissionsave(Admission admi) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into admission values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, admi.tid);
			pst.setString(2, admi.name);
			pst.setString(3, admi.username);
			pst.setString(4, admi.email);
			pst.setString(5, admi.password);
			pst.setString(6, admi.dob);
			pst.setString(7, admi.gender);
			pst.setString(8, admi.contact);
			pst.setString(9, admi.address);
			pst.setString(10, admi.city);
			pst.setInt(11, admi.postcode);
			pst.setString(12, admi.division);
			pst.setString(13, admi.districit);
			pst.setString(14, admi.skills);
			pst.setString(15, admi.qualification);
			pst.setString(16, admi.course);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	public List<Admission> alladmission(){
		List<Admission> admissionList = new ArrayList<>();
		Admission ad;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select* FROM admission");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				ad = new Admission(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16));
				admissionList.add(ad);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
		return admissionList;
	}
	public List<Admission> admissionByid(int tid){
		List<Admission> admissionList = new ArrayList<>();
		Admission adm;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
		pst = con.prepareStatement("SELECT  tid,name,username,email,dob,division,districit From  trainee WHERE tid =" +tid);
	
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				adm = new Admission(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				admissionList.add(adm);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
		return admissionList;
	}
	


public void deleteAdmission(Admission ad) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
		 pst = con.prepareStatement("Delete from admission where tid=?");
		 pst.setInt(1, ad.tid);
		 pst.executeUpdate();
		
	} catch (Exception e) {
		// TODO: handle exception
		System. out.println(e);
	}
	
}

}
//public void Adupdate(Admin a) {
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
//		pst = con.prepareStatement("update admin set name=?,username=?,email=?,dob=?,gender=?,degree=? where id=?");
//		pst.setString(1, a.name);
//		pst.setString(2, a.username);
//		pst.setString(3, a.email);
//		pst.setString(4, a.dob);
//		pst.setString(5, a.gender);
//		pst.setString(6, a.degree);;
//		pst.setInt(7, a.id);
//		pst.executeUpdate();
//		
//	} catch (Exception e) {
//		// TODO: handle exception
//		System.out.println(e);
//		
//	}
//	
//}
//public void addelete(Admin a) {
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
//		pst = con.prepareStatement("Delete From admin where id=?");
//		pst.setInt(1, a.id);
//		pst.executeUpdate();
//		
//	} catch (Exception e) {
//		// TODO: handle exception
//		System.out.println(e);
//		
//	}
//}
//
//
//
