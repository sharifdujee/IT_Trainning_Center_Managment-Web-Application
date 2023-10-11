package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AdmissionFeeDA {
	Connection con;
	PreparedStatement pst;
	
	public void addfee(AdmissionFee af) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fproject", "root", "Rohan@2008oxford");
			pst = con.prepareStatement("insert into admissionfee values(?,?,?,?,?,?)");
			pst.setInt(1, af.tid);
			pst.setInt(2, af.courseid);
			pst.setDouble(3, af.cprice);
			pst.setString(4, af.reference);
			pst.setDouble(5, af.nprice);
			pst.setDouble(6, af.fpay);
			pst.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
