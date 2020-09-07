<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>Simulacro 2</h1>
<div class="form-group">
<form action="procesar" method="post" role = "form" data-toggle="validator">
	Factura ID: <input type="text" name="txtfact" />
	<input type="submit" value="Obtener" class="btn btn-primary mb-1"/>
</form>
</div>
</div>
</body>
</html>