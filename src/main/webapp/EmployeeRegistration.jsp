<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="EmployeeRegistrationServlet" method="post">
		First Name : <input type="text" name="firstName"/><br>
		Email : <input type="text" name="email"/><br>
		Password : <input type="password" name="password"/><br>
		<button type="submit">Register</button>
	</form>
</body>
</html>