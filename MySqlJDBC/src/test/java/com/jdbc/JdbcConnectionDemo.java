package com.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnectionDemo {

	public static void main(String[] args) {
		try {
			// driver load
			Connection con = DriverManager.getConnection("jdbc:mysql:///hr", "Sagar Shelke Mysql", "Shelke@14041999");
			System.out.println("Connection successful");
			Statement st = con.createStatement();
			String query = "Select * from countries"; 
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString(1) + "  " + rs.getString(02) + "  " + rs.getInt(03));
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("error");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	
	
}
