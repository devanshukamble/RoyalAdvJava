package com.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddCookieServlet")
public class AddCookieServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstname");
		Cookie c = new Cookie("firstname", firstName);
		response.addCookie(c);
		RequestDispatcher rd = request.getRequestDispatcher("InputCookie.jsp");
		rd.forward(request, response);
	}
}
