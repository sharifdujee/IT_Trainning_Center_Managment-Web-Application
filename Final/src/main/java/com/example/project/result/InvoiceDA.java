package com.example.project.result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InvoiceDA {
	Connection con;
	PreparedStatement pst;
	public Invoice invoiceById(int tid) {
		Invoice inv = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("SELECT  trainee.tid, trainee.name, trainee.username,  admission.course, payment.tuitionfee,payment.scholarship,payment.comission, payment.payable,payment.status, management.fine From trainee Join admission ON trainee.tid = admission.tid Join payment ON trainee.tid = payment.tid join management ON trainee.tid = management.tid  where  trainee.tid = ?");
			pst.setInt(1, tid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				inv = new Invoice(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getDouble(6),rs.getDouble(7),rs.getDouble(8),rs.getString(9),rs.getDouble(10));
			}
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return inv;
	}
	

}


