package com.example.project.attendence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;






public class AttendenceDA {
	Connection con;
	PreparedStatement pst;
	public List<Attendence>allattendence(){
		List <Attendence> attendenceList = new ArrayList<>();
		Attendence att;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("SELECT * From attendence");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				att = new Attendence(rs.getString(1), rs.getInt(2),rs.getString(3),rs.getString(4));
				attendenceList.add(att);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
		return attendenceList;	
	}
	
	public void saveattendence( Attendence atd) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Insert into attendence values(?,?,?,?)");
			pst.setString(1,null);
			pst.setInt(2, atd.tid);
			pst.setString(3,atd.date);
			pst.setString(4, atd.status);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public List<Attendence> attendenceById(int tid){
		List<Attendence> showattendence = new ArrayList<>();
		Attendence att;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("SELECT* FROM attendence WHERE tid=" + tid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				att = new Attendence(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4));
				showattendence.add(att);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
		return showattendence;
	}
	public List<Attendence> attendenceByDate(String date){
		List<Attendence> showAttendencedate = new ArrayList<>();
		Attendence atd;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("SELECT* FROM attendence WHERE date=" + date);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				atd = new Attendence(rs.getInt(1),rs.getString(2),rs.getString(3));
				showAttendencedate.add(atd);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return showAttendencedate;
	}
	public Attendence attendenceByStatus(String present) {
		Attendence att = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("SELECT count(status) FROM attendence WHERE status=" + present);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				att = new Attendence(rs.getString(1));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return att;
	}

}

