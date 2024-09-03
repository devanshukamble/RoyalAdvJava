<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	%>

	<h2>List Products</h2>

	<table border="1">
		<tr>  
			<th>Name</th>
			<th>Category</th>
			<th>Price</th>

		</tr>
		<%
		while (rs.next()) {
			String pName = rs.getString("name");
			String category = rs.getString("categorey");
			Integer price = rs.getInt("price");
			out.println("<tr>");
			out.print("<td>" + pName + "</td>");
			out.print("<td>" + category + "</td>");
			out.print("<td>" + price + "</td>");

			out.print("</tr>");
		}
		%>

	</table>

</body>
</html>