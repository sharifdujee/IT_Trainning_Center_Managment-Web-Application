package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CourseDA {
	Connection con;
	PreparedStatement pst;
	public void add(Course c) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into course values(?,?,?,?)");
			pst.setInt(1, c.cid);
			pst.setString(2, c.cname);
			pst.setString(3, c.status);
			pst.setDouble(4, c.price);
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public Course coursePriceById(int cid) {
		Course ca = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select cid, price from course where cid = ?");
			pst.setInt(1, cid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				ca = new Course(cid,rs.getInt(1),rs.getDouble(2));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ca;
	}
	public List<Course>allCourse(){
		List <Course>coursesList = new ArrayList<>();
		Course co;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * From course");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				co = new Course(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4));
				coursesList.add(co);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return coursesList;

}
}

