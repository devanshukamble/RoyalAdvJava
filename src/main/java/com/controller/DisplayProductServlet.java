package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DisplayProductServlet")
public class DisplayProductServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String driverClassName = "com.mysql.cj.jdbc.Driver";
			String dbUrl = "jdbc:mysql://localhost:3306/Royal";
			String dbUserName = "root";
			String dbPassword = "";
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			PreparedStatement pstmt = con.prepareStatement("select * from products");

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String pName = rs.getString("name");
				System.out.println(pName);
			}
			request.setAttribute("rs", rs);
			request.getRequestDispatcher("DisplayProduct.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
