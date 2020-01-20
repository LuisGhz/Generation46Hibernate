<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Product</title>
</head>
<body>
	<form action="CreateProductServlet" method="post">
		<p>
			<input type="text" id="txtProductId" name="txtProductId" placeholder="Product ID">
		</p>
		<p>
			<input type="text" id="txtProduct" name="txtProduct" placeholder="Product" >
		</p>
		<p>
			<input type="text" id="txtProductName" name="txtProductName" placeholder="Product Name">
		</p>
		<p>
			<input type="text" id="txtProductPrice" name="txtProductPrice" placeholder="Product Price">
		</p>
		<p>
			<input type="text" id="txtJson" name="txtJson" placeholder="Json Text: " >
		</p>
		<input type="submit" value="Create Product">
	</form>
</body>
</html>