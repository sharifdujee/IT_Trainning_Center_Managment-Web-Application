package com.example.project.attendence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ManagementDA {
	Connection con;
	PreparedStatement pst;
	
	public List<Management>allmanagement(){
		List<Management> managementList = new ArrayList<>();
		Management manag;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("SELECT * FROM management");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				manag = new Management(rs.getString(1),rs.getInt(2),rs.getDouble(3),rs.getString(4));
				managementList.add(manag);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
		return managementList;
	}
		public Management allmanagementById(int tid){
			
			Management manag = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
				pst = con.prepareStatement("SELECT * FROM management where tid="+tid);
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					manag = new Management(rs.getString(1),rs.getInt(2),rs.getDouble(3),rs.getString(4));
					
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
				e.printStackTrace();
			}
			return manag;	
	}
		
	public void Savemanagement(Management mana) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into management values(?,?,?,?)");
			pst.setString(1, null);
			pst.setInt(2, mana.tid);
			pst.setDouble(3, mana.fine);
			pst.setString(4, mana.pstatus);
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
	}

}







