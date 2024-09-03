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

@WebServlet("/InputSearchServlet")
public class InputSearchServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cat = request.getParameter("cat");
		try {
			String driverClassName = "com.mysql.cj.jdbc.Driver";
			String dbUrl = "jdbc:mysql://localhost:3306/Royal";
			String dbUserName = "root";
			String dbPassword = "";
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			System.out.println("Db Connected");
			PreparedStatement ps = con.prepareStatement("select * from products where categorey=?");
			ps.setString(1, cat);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				Integer price = rs.getInt("price");
				String categorey = rs.getString("categorey");
				Integer qty = rs.getInt("qty");
				System.out.println(name + " " + price + " " + categorey + " " + qty);
				request.setAttribute("rs", rs);
				request.getRequestDispatcher("InputSearchDisplay.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
