package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbCon {
	public static void main(String[] args) {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/Royal";
		String userName = "root";
		String password = "";
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Db Connected");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
