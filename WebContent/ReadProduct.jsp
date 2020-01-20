<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read Product</title>
</head>
<body>
	<h2>Read product</h2>
	<form action="ReadProductServlet" method="post">
		<p>
		<input type="text" name="txtId" id="textId" placeholder="ID" >
		</p>
		<input type="submit" value="search" >
	</form>
</body>
</html>