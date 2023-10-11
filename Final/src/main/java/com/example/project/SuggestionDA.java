package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SuggestionDA {
	Connection con;
	PreparedStatement pst;
	public List<Suggestion> allsugesstion(){
		List<Suggestion>suList = new ArrayList<>();
		Suggestion sug;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * From suggestion");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			sug = new Suggestion(rs.getInt(1),rs.getString(2), rs.getString(3));
			suList.add(sug);
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return suList;
			
	}
	public Suggestion SuggestionById(int tid) {
		Suggestion sug = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * From suggestion where tid="+tid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				sug = new Suggestion(rs.getInt(1),rs.getString(2),rs.getString(3));	
			}	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return sug;
	}
	
	

	public Suggestion cklevel(int tid) {
		Suggestion sug = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select klevel from result Where tid=?");
			pst.setInt(1, tid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				sug = new Suggestion (tid, rs.getString(1));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return sug;	
	}
	public void sugsave(Suggestion su) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into suggestion values(?,?,?)");
			pst.setInt(1, su.tid);
			pst.setString(2, su.klevel);
			pst.setString(3, su.course);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println();
		}
		}
	}






