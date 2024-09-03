package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer n1 = Integer.parseInt(request.getParameter("n1"));
		Integer n2 = Integer.parseInt(request.getParameter("n2"));
		String opr = request.getParameter("opr");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if (opr.equals("+")) {
			out.print("<h1>Answer = " + (n1 + n2) + "</h1>");
		} else if (opr.equals("-")) {
			out.print("<h1>Answer = " + (n1 - n2) + "</h1>");
		} else if (opr.equals("*")) {
			out.print("<h1>Answer = " + (n1 * n2) + "</h1>");
		} else if (opr.equals("/")) {
			out.print("<h1>Answer = " + (n1 / n2) + "</h1>");
		}
	}
}
