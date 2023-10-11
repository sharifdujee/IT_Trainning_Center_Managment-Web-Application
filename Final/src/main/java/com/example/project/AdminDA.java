package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AdminDA {
	Connection con;
	PreparedStatement pst;
	
	public List<Admin>allAdmin(){
		List <Admin>adList = new ArrayList<>();
		Admin a;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * From admin");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				a = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
				adList.add(a);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return adList;
		
	}
	public Admin AdminById(int id) {
		Admin ad = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * From admin where id=" +id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				ad = new Admin (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);	
		}
		return ad;
	}

	
	
	public void save(Admin a) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into admin values(?,?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, a.id);
			pst.setString(2, a.name);
			pst.setString(3, a.username);
			pst.setString(4, a.email);
			pst.setString(5, a.password);
			pst.setString(6, a.dob);
			pst.setString(7, a.gender);
			pst.setString(8, a.degree);
			pst.setString(9, a.join);
			pst.setString(10, a.profile);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}	
	}
	public void Adupdate(Admin a) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("update admin set name=?,username=?,email=?,dob=?,gender=?,degree=? where id=?");
			pst.setString(1, a.name);
			pst.setString(2, a.username);
			pst.setString(3, a.email);
			pst.setString(4, a.dob);
			pst.setString(5, a.gender);
			pst.setString(6, a.degree);;
			pst.setInt(7, a.id);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		
	}
	public void addelete(Admin a) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Delete From admin where id=?");
			pst.setInt(1, a.id);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
	}
	public Admin search(int id) {
		Admin a = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * From admin where id=?");
			pst.setInt(1,id);
			ResultSet rs = pst.executeQuery();
			while(rs.next());
			a = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		return  a;
	}
}


