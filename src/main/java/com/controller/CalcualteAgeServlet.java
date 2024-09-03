package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalcualteAgeServlet")
public class CalcualteAgeServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bYearStr = request.getParameter("birthYear");
		boolean isError = false;
		String error = "";
		if (bYearStr == null || bYearStr.trim().length() == 0) {
			isError = true;
			error = "Enter Birth Year";
		} else if (bYearStr.matches("[0-9]{4}") == false) {
			isError = true;
			error = "Enter valid birth year";
		}

		if (isError == true) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print(error);
		} else {

			Integer birthYear = Integer.parseInt(bYearStr);
			Integer currentYear = Calendar.getInstance().get(Calendar.YEAR);
//			Integer currentYear = 2024;

			if (birthYear >= 1924 && birthYear <= 2023) {

				Integer age = currentYear - birthYear;
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.print(age);
			} else {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.print("Please Enter Valid BirthYear");
			}

		}
	}
}
