<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<div class="form-class" center>
<br>
Cliente: <c:out value="${ft.getCliente()}"></c:out> <br>
Fecha: <c:out value="${ft.getFecha()}"></c:out> <br>
<br>
</div>
<table class="table table-dark">
<tr>
	<th>Producto</th>
	<th>Precio</th>
	<th>Cantidad</th>
</tr>
<c:forEach items="${df}" var="detf">
<tr>
	<td>${detf.getProductoid().getNombre()}</td>
	<td>${detf.getProductoid().getValor()}</td>
	<td><c:out value="${detf.cantidad}" /></td>
</tr>
</c:forEach>
</table>
<br>
<div class="form-class">
Subtotal: <c:out value="${sub}"></c:out> <br>
impuesto: <c:out value="${imp}"></c:out> <br>
Total: <c:out value="${tot}"></c:out> <br>
</div>
</div>
</body>
</html>