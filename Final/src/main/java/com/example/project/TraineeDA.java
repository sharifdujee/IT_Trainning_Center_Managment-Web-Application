package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;



import java.util.ArrayList;

public class TraineeDA {
	Connection con;
	PreparedStatement pst;
	public List<Trainee>allTrainee(){
		List<Trainee> trList = new ArrayList<>();
		Trainee tr;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * From trainee");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
			tr = new Trainee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16));
				trList.add(tr);
			
		}
		}catch (Exception e) {
			System.out.println(e);
		}
		return  trList;
		
	}
	public Trainee TraineeById(int tid) {
		Trainee tr  = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Select * From trainee where tid=" +tid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				tr = new Trainee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16));
					
			}	
		} 	catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return tr;
				
	}
	public Trainee tsave(Trainee t) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into trainee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, t.tid);
			pst.setString(2, t.name);
			pst.setString(3, t.username);
			pst.setString(4, t.email);
			pst.setString(5, t.password);
			pst.setString(6, t.dob);
			pst.setString(7, t.gender);
			pst.setString(8, t.degree);
			pst.setString(9, t.subject);
			pst.setString(10, t.session);
			pst.setString(11, t.institution);
			pst.setString(12, t.result);
			pst.setString(13, t.division);
			pst.setString(14, t.districit);
			pst.setString(15, t.reference);
			pst.setString(16, t.img);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return t;
	}
	public Trainee  tsignin(int tid) {
		Trainee tt = new Trainee();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
		pst = con.prepareStatement("Select * from trainee where tid =?" + tid);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			tt = new Trainee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7), rs.getString(8), rs.getString(9),rs.getString(10), rs.getString(11),rs.getString(12), rs.getString(13), rs.getString(14),rs.getString(15), rs.getString(16));
			
					
		}
		con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
		return tt;
	}
	

//	public Guide gsigin(int gid) {
//		Guide g = new Guide();
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flutter_test", "root", "Rohan@2008oxford");
//			pst = con.prepareStatement("Select * from guide where gid = " + gid);
//			ResultSet rs = pst.executeQuery();
//			while(rs.next()) {
//				g = new Guide(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
//			}
//			con.close();
//			
//			
//		} catch (Exception e) {
//			System.out.println(e);
//			// TODO: handle exception
//			e.printStackTrace();
//			
//		}
//		return g;
//		
//	}
	
	public  void trupdate(Trainee t) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("update trainee set name=?,username=?, email=?,dob=?, gender=?, degree=?,subject=?,session=?, institution=?, result=?, division=?, districit=?,reference=?, img= ? where nid=?");
			pst.setString(1, t.name);
			pst.setString(2, t.username);
			pst.setString(3, t.email);
			pst.setString(4, t.dob);
			pst.setString(5, t.gender);
			pst.setString(6, t.degree);
			pst.setString(7, t.subject);
			pst.setString(8, t.session);
			pst.setString(9, t.institution);
			pst.setString(10, t.result);
			pst.setString(11, t.division);
			pst.setString(12, t.districit);
			pst.setString(13, t.reference);
			pst.setString(14, t.img);
			pst.setInt(15, t.tid);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void trdelete(Trainee t) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("Delete From trainee Where nid=?");
			pst.setInt(1, t.tid);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
}
	}



//public void Adupdate(Admin a) {
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
//		pst = con.prepareStatement("update trainee set name=?,username=?,email=?,dob=?,gender=?,degree=? where id=?");
//		pst.setString(1, a.name);
//		pst.setString(2, a.username);
//		pst.setString(3, a.email);
//		pst.setString(4, a.dob);
//		pst.setString(5, a.gender);
//		pst.setString(6, a.degree);;
//		pst.setInt(7, a.id);
//		pst.executeUpdate();
//		
//	} catch (Exception e) {
//		// TODO: handle exception
//		System.out.println(e);
//		
//	}
//	
//}
//public void addelete(Admin a) {
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
//		pst = con.prepareStatement("Delete From admin where id=?");
//		pst.setInt(1, a.id);
//		pst.executeUpdate();
//		
//	} catch (Exception e) {
//		// TODO: handle exception
//		System.out.println(e);
//		
//	}
//}
//
//
