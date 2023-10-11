package com.example.project.result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.project.Admin;
import com.example.project.Payment;

public class ProgressDA {
	Connection con;
	PreparedStatement pst;
	public List<Progress>allprogress(){
		List<Progress> progressList = new ArrayList<>();
		Progress pg;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("SELECT * From progress");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				pg = new Progress(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDouble(7));
				progressList.add(pg);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return progressList;
	}
	public List <Progress> progressById(int tid){
		List<Progress> showprogress = new ArrayList<>();
		Progress prg;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("SELECT * From progress WHERE tid =" + tid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				prg = new Progress(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDouble(7));
				showprogress.add(prg);
			
			}} catch (Exception e) {
			// TODO: handle exception
				System.out.println(e);
		}
		return showprogress;
	}
	
	public void saveprogress(Progress prg) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into progress values(?,?,?,?,?,?,?)");
			pst.setString(1, null);
			pst.setInt(2, prg.tid);
			pst.setInt(3, prg.midno);
			pst.setString(4, prg.midstatus);
			pst.setInt(5, prg.finalno);
			pst.setString(6, prg.finalstatus);
			pst.setDouble(7, prg.progre);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
	}
	public void update(Progress prgs) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("update progress set progress=? WHERE tid=?");
			pst.setDouble(1, prgs.progre);
			pst.setInt(2, prgs.tid);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
	}
	public Progress ProgressById(int tid) {
		Progress prg = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("SELECT midno,midstatus,finalno, finalstatus,progress FROM progress WHERE tid=?");
			pst.setInt(1, tid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				prg  = new Progress(tid,rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getDouble(5));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
		return prg;
	}
	
	public void ProgressUpdate(Progress prg) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("update progress set midno=?,midstatus=?,finalno =?, finalstatus=?,progress=? WHERE tid=?");
			pst.setInt(1, prg.midno);
			pst.setString(2, prg.midstatus);
			pst.setInt(3, prg.finalno);
			pst.setString(4, prg.finalstatus);
			pst.setDouble(5, prg.progre);
			pst.setInt(6, prg.tid);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	public void deleterecord( Progress pa) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Delete from progress where tid=?");
			pst.setInt(1, pa.tid);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
}


