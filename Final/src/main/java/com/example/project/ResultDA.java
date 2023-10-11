package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResultDA {
	Connection con;
	PreparedStatement pst;
	public Result ResultById(int tid) {
		Result res = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select marks,klevel From assessment Where tid=?");
			pst.setInt(1, tid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				res = new Result(tid, rs.getDouble(1),rs.getString(2));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return res;
		
	}
	public void rsave(Result rs) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into result values(?,?,?)");
			pst.setInt(1, rs.tid);
			pst.setDouble(2, rs.marks);
			pst.setString(3, rs.klevel);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}



