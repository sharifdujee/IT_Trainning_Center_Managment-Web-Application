package com.example.project.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FinalDA {
	
	Connection con;
	PreparedStatement pst;
	public void savefinal(Final fin) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Insert into final values(?,?,?,?,?,?,?,?,?)");
			pst.setString(1, fin.fexamid);
			pst.setInt(2, fin.tid);
			pst.setDouble(3, fin.a1);
			pst.setDouble(4, fin.a2);
			pst.setDouble(5, fin.a3);
			pst.setDouble(6, fin.a4);
			pst.setDouble(7, fin.a5);
			pst.setDouble(8, fin.marks);
			pst.setString(9, fin.status);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
	}
	public Final finalResultById(String fexamid, int tid) {
		Final fin = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select marks, status from final where  fexamid=? and tid=?");
			pst.setString(1, fexamid);
			pst.setInt(2, tid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				fin = new Final(fexamid,tid, rs.getDouble(1),rs.getString(2));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
		return fin;
	}
	

}



