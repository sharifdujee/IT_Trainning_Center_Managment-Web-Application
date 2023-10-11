package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ScholarshipDA {
	Connection con;
	PreparedStatement pst;

	public List<Scholarship> allScholarship() {
		List<Scholarship> sList = new ArrayList<>();
		Scholarship sch;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * From scholarships");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				sch = new Scholarship(rs.getInt(1), rs.getDouble(2), rs.getDouble(3));
				sList.add(sch);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return sList;
	}

	public Scholarship ScholarshipById(int tid) {
		Scholarship sch = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * From scholarships Where tid=" + tid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				sch = new Scholarship(rs.getInt(1), rs.getDouble(2), rs.getDouble(3));

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return sch;
	}

	public void scsave(Scholarship sc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into scholarships values(?,?,?)");
			pst.setInt(1, sc.tid);
			pst.setDouble(2, sc.marks);
			pst.setDouble(3, sc.scholarship);
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public void schdelete(Scholarship sc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Delete From scholarships where tid=?");
			pst.setInt(1, sc.tid);
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public Scholarship smarks(int tid) {
		Scholarship sch = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select marks from result Where tid=?");
			pst.setInt(1, tid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				sch = new Scholarship(tid, rs.getInt(1));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return sch;
	}

}

