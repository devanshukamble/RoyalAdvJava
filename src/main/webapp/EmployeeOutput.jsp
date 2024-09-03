<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String fn = (String)request.getAttribute("fn");
		String email = (String)request.getAttribute("email");
		String pwd = (String)request.getAttribute("pwd");
	%>
	<h1><%= fn %></h1>
	<h1><%= email %></h1>
	<h1><%= pwd %></h1>
</body>
</html>