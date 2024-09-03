<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="SaveProductServlet" method="post">
		Name :<input type="text" name="pname"/><br>
		Price :<input type="text" name="pprice"/><br>
		Categorey :<input type="text" name="categorey"/><br>
		Qty :<input type="text" name="qty"/><br><br>
		<input type="submit" value="Add Product"/>
	</form>
</body>
</html>