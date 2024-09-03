<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="BoxCricketRegestrationServlet" method="post">
		<h1>Box Cricket Registration</h1>
		Student Name : <input type="text" name="sn"/><br>
		Player Type : <select name="playerType">
			<option value="">Select Skill</option>
			<option value="bt">Batsman</option>
			<option value="bw">Bowler</option>
			<option value="fi">Filder</option>
		</select>
		<input type="submit"/>
	</form>
</body>
</html>