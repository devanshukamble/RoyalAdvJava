package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SaveProductServlet")
public class SaveProductServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("pname");
		String cat = request.getParameter("categorey");
		Integer price = Integer.parseInt(request.getParameter("pprice"));
		Integer qty = Integer.parseInt(request.getParameter("qty"));
//		database connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/Royal";
			String userName = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Db Connected");

			PreparedStatement ps = con
					.prepareStatement("insert into products (name,categorey,price,qty) values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, cat);
			ps.setInt(3, price);
			ps.setInt(4, qty);
			int record = ps.executeUpdate();
			if (record > 0) {
				System.out.println("Product Added");
				request.getRequestDispatcher("DisplayProductServlet").forward(request, response);
				// RequestDispatcher rd = request.getRequestDispatcher("AddProduct.jsp");
				// rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
