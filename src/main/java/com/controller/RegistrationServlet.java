package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("RegistrationServlet called");

		String firstName = request.getParameter("fn");
		String lastName = request.getParameter("ln");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		String gender = request.getParameter("gender");
		String state = request.getParameter("state");
		String address = request.getParameter("add");
		String hobby[] = request.getParameterValues("hobby");

		if (firstName == null || firstName.trim().length() == 0) {
			firstName = "Enter First Name";
		}
		if (lastName == null || lastName.trim().length() == 0) {
			lastName = "Enter Last Name";
		}
		if (email == null || email.trim().length() == 0) {
			email = "Enter Email";
		}
		if (gender == null) {
			gender = "Enter Gender";
		}
		if (state == null) {
			state = "Select State";
		}
		if (address == null || address.trim().length() == 0) {
			address = "Enter Address";
		}
		if (password == null || password.trim().length() == 0) {
			password = "Enter Password";
		}
		if (hobby == null) {
			System.out.println("hobby is null");
		}
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.print("<h1>Registration Successful</h1>");
		out.print("<h1>First Name = " + firstName + "</h1>");
		out.print("<h1>Last Name = " + lastName + "</h1>");
		out.print("<h1>Email = " + email + "</h1>");
		out.print("<h1>Password = " + password + "</h1>");
		out.print("<h1>Gender = " + gender + "</h1>");
		out.print("<h1>Hobby</h1>" + "<h2>");
		for (int i = 0; i < hobby.length; i++) {
			out.print(hobby[i]);
			System.out.println("Hobby = " + hobby[i]);
		}
		out.print("</h2>");
		out.print("<h1>State = " + state + "</h1>");
		out.print("<h1>Address = " + address + "</h1>");

	}
}