package com.example.project.report;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReportDA {

	public List<Rpayment> PaymentReport() {
		List<Rpayment> pr = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_sense", "root", "Rohan@2008oxford");
			PreparedStatement pst = con
					.prepareStatement("SELECT tid, tuitionfee, scholarship, comission, payable, status FROM payment");
			ResultSet rs = pst.executeQuery();
			Rpayment rp;
			while (rs.next()) {
				rp = new Rpayment();
				rp.setTid(rs.getInt(1));
				rp.setTuitionfee(rs.getDouble(2));
				rp.setScholarship(rs.getDouble(3));
				rp.setComission(rs.getDouble(4));
				rp.setPayable(rs.getDouble(5));
				rp.setStatus(rs.getString(6));
				
				pr.add(rp);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return pr;
	}

}