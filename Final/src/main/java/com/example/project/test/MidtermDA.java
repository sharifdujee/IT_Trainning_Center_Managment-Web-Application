package com.example.project.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MidtermDA {
	Connection con;
	PreparedStatement pst;
	public void Midtermsave(Midterm mid) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Insert into midterm values(?,?,?,?,?,?,?,?,?)");
			pst.setString(1, mid.mexamid);
			pst.setInt(2, mid.tid);
			pst.setDouble(3, mid.a1);
			pst.setDouble(4, mid.a2);
			pst.setDouble(5, mid.a3);
			pst.setDouble(6, mid.a4);
			pst.setDouble(7, mid.a5);
			pst.setDouble(8, mid.marks);
			pst.setString(9, mid.status);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public Midterm midResultById( String mexamid, int tid) {
		Midterm mid = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select marks, status from midterm where mexamid = ? and  tid=?");
			pst.setString(1, mexamid);
			pst.setInt(2, tid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				mid = new Midterm( mexamid ,tid, rs.getDouble(1),rs.getString(2));
			}
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
		return mid;
	}
	
	

}

