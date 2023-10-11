package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import com.example.project.Assessment;

public class AssessmentDA {
	Connection con;
	PreparedStatement pst;
	
	public void assave(Assessment as) {
		System.out.println(as.q1);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into assessment values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, as.tid);
			pst.setDouble(2, as.q1);
			pst.setDouble(3, as.q2);
			pst.setDouble(4, as.q3);
			pst.setDouble(5, as.q4);
			pst.setDouble(6, as.q5);
			pst.setDouble(7, as.q6);
			pst.setDouble(8, as.q7);
			pst.setDouble(9, as.q8);
			pst.setDouble(10, as.q9);
			pst.setDouble(11, as.q10);
			pst.setDouble(12, as.marks);
			pst.setString(13, as.klevel);
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
	
	
	
		
		

}
