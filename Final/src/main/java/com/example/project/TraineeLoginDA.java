package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TraineeLoginDA {
	Connection con;
	PreparedStatement pst;

	
			public TraineeLogin trlog(TraineeLogin tl) {
			
			TraineeLogin td = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
				pst = con.prepareStatement("Select * from trainee where username=? or email=? and password=?");
				pst.setString(1, tl.username);
				pst.setString(2, tl.email);
				pst.setString(3, tl.password);
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					td = new TraineeLogin();
					td.setUsername(rs.getString(1));
					td.setEmail(rs.getString(2));
					td.setPassword(rs.getString(3));
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			return td;
		}
			public TraineeLogin examlogin(TraineeLogin tl) {
				TraineeLogin td = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
					pst = con.prepareStatement("Select * from trainee where tid=? and password=?");
					pst.setInt(1, tl.tid);
					pst.setString(2, tl.password);
					ResultSet rs = pst.executeQuery();
					if(rs.next()) {
						td = new TraineeLogin();
						td.setTid(rs.getInt(1));
						td.setPassword(rs.getString(2));
					}
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				return td;
				
			}
			public TraineeLogin midlogin(TraineeLogin tl) {
				TraineeLogin td = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
					pst = con.prepareStatement("Select * from trainee WHERE tid=? AND password=?");
					pst.setInt(1, tl.tid);
					pst.setString(2, tl.password);
					ResultSet rs = pst.executeQuery();
					if(rs.next()) {
						td = new TraineeLogin();
						td.setTid(rs.getInt(1));
						td.setPassword(rs.getString(2));
					}	
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				return td;
				
			}


}





