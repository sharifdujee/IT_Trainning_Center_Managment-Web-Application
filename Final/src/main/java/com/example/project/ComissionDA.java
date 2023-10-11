package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ComissionDA {
	Connection con;
	PreparedStatement pst; 
	public List<Comission> allComission(){
		List<Comission> cList = new ArrayList<>();
		Comission com;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * From comissions");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				com = new Comission(rs.getInt(1), rs.getDouble(2),rs.getDouble(3));
				cList.add(com);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return cList;
	}
	public Comission ComissionById(int tid) {
		Comission co = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * From comissions where tid =" + tid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				co = new Comission(rs.getInt(1),rs.getDouble(2),rs.getDouble(3));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return co;
	}
	public void cosave(Comission co) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into comissions values(?,?,?)");
			pst.setInt(1, co.tid);
			pst.setDouble(2, co.marks);
			pst.setDouble(3, co.comission);
			pst.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public Comission scmarks(int tid) {
		Comission com = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select marks from result Where tid=?");
			pst.setInt(1, tid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				com = new Comission(tid, rs.getInt(1));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return com;
	}

}

