package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class QuestionDA {
	Connection con;
	PreparedStatement pst;
	public void qusave (Question q) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql:localhost:3306/fproject","root","Rohan@2008oxford");
			pst = con.prepareStatement("insert into question values(?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, q.qid);
			pst.setString(2, q.queston1);
			pst.setString(3, q.queston2);
			pst.setString(4, q.queston3);
			pst.setString(5, q.queston4);
			pst.setString(6, q.queston5);
			pst.setString(7, q.queston6);
			pst.setString(8, q.queston7);
			pst.setString(9, q.queston8);
			pst.setString(10, q.queston9);
			pst.setString(11, q.queston10);
			pst.setBoolean(12, false);
			pst.executeUpdate();
		
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}


