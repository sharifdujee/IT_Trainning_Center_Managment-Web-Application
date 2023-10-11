package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminloginDA {
Connection con;
PreparedStatement pst;

	public Adminlogin log (Adminlogin al) {
		Adminlogin ad = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * from admin where username=? and email=? and password=?");
			pst.setString(1, al.username);
			pst.setString(2, al.email);
			pst.setString(3, al.password);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				ad = new Adminlogin();
				ad.setUsername(rs.getString(3));
				ad.setEmail(rs.getString(4));
				ad.setPassword(rs.getString(5));
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return ad;
	}
	public Adminlogin adminlog(Adminlogin adl) {
		Adminlogin ad = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * from admin where username=? or email=? and password=?");
			pst.setString(1, adl.username);
			pst.setString(2, adl.email);
			pst.setString(3, adl.password);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				ad = new Adminlogin();
				ad.setUsername(rs.getString(1));
				ad.setEmail(rs.getString(2));
				ad.setPassword(rs.getString(3));		
			}
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);	
		}
		return adl;
				
	}

}

//*****
//package com.example.demo;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//public class LoginDA {
//	Connection con;
//	PreparedStatement pst;
//
//	public Login check(Login u) {
//		Login q = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "nh123456"));
//			PreparedStatement pst = con.prepareStatement("Select * from log_admin where email=? AND password=?");
//
//			pst.setString(1, u.email);
//			pst.setString(2, u.password);
//			ResultSet rs = pst.executeQuery();
//			if (rs.next()) {
//				q = new Login();
//				q.setEmail(rs.getString(1));
//				q.setPassword(rs.getString(2));
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//
//		}
//		return q;
//	}
//	
//	
//	public Login checkcustomar(Login u) {
//		Login l = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject", "root", "nh123456"));
//			PreparedStatement pst = con.prepareStatement("Select * from customer_admin where customer_id=? AND email=? AND password=?");
//			pst.setInt(1, u.customer_id);
//			pst.setString(2, u.email);
//			pst.setString(3, u.password);
//			ResultSet rs = pst.executeQuery();
//			
//			while (rs.next()) {
//				System.out.println(rs.getString(3));
//				l = new Login();
//				l.setCustomer_id(rs.getInt(1));
//				l.setEmail(rs.getString(2));
//				l.setPassword(rs.getString(3));
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//
//		}
//		return l;
//	}
//
//}
