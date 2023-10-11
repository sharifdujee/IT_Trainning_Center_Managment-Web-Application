package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchDA {
	Connection con;
	PreparedStatement pst;
	public  Search searchById(int id) {
	Search se = null;
	try { 
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
		pst = con.prepareStatement("SELECT * from admin where id=?");
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			se= new Search(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
			
		}
	} catch (Exception e) {
		System.out.println(e);
//		e.printStackTrace();
	}
	return se;
}
}


