package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PaymentDA {
	Connection con;
	PreparedStatement pst;
	public List<Payment> paymentall(){
		List<Payment> paymentList = new ArrayList<>();
		Payment pa;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
		pst = con.prepareStatement("Select * From payment");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			pa = new Payment(rs.getInt(1),rs.getDouble(2),rs.getDouble(3),rs.getDouble(4),rs.getDouble(5),rs.getString(6));
			paymentList.add(pa);
			
		} }catch (Exception e) {
			// TODO: handle exception
		}
		return paymentList;
		
	}
	public  Payment paymentById(int tid) {
		Payment pa = null;
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("SELECT  scholarships.tid, scholarships.scholarship, comissions.comission from scholarships JOIN comissions  ON  scholarships.tid = comissions.tid WHERE scholarships.tid =?");
			pst.setInt(1, tid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				pa= new Payment(rs.getInt(1),rs.getDouble(2),rs.getDouble(3));
				
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return pa;
	}
	
	public void paymentsave(Payment pa) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into payment values(?,?,?,?,?,?)");
			pst.setInt(1, pa.tid);
			pst.setDouble(2, pa.tuitionfee);
			pst.setDouble(3, pa.scholarship);
			pst.setDouble(4, pa.comission);
			pst.setDouble(5, pa.payable);
			pst.setString(6, pa.status);
			pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
	}
	public void updateById(Payment pad) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("update payment set tuitionfee=?,scholarship=?,comission=?, payable=?, status=? WHERE tid=?");
			pst.setDouble(1, pad.tuitionfee);
			pst.setDouble(2, pad.scholarship);
			pst.setDouble(3, pad.comission);
			pst.setDouble(4, pad.payable);
			pst.setString(5, pad.status);
			pst.setInt(6,pad.tid );
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
//	public List<Admin>allAdmin(){
//		List <Admin>adList = new ArrayList<>();
//		Admin a;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
//			pst = con.prepareStatement("Select * From admin");
//			ResultSet rs = pst.executeQuery();
//			while(rs.next()) {
//				a = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
//				adList.add(a);
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		return adList;
}



