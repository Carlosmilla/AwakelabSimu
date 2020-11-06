<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
      
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Registro de usuarios</h3>
	<br>
	<form action='/index/add' method="post">
		<table class='table table-hover table-responsive table-bordered'>
			<tr>
				<td><b>Nombre</b></td>
				<td><input type='text' name='nombre' required /></td>
			</tr>
			<tr>
				<td><b>Apodo</b></td>
				<td><input type='text' name='apodo' required /></td>
			</tr>
			<tr>
				<td><b>Faccion</b></td>
				<td><input type='text' name='faccion' required /></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button type="submit">Register</button>
				</td>
			</tr>
		</table>
		<b><c:out value="${danger}"></c:out></b>
	</form>

	<h3>Lista de usuarios</h3>
	<br>
	<table>
		<thead>
			<tr>
				<th><b>Nombre</b></th>
				<th><b>Apodo</b></th>
				<th><b>Faccion</b></th>
				<th><b>Operaciones</b></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="us">
				<tr>
					<td><c:out value="${us.nombre}"></c:out></td>
					<td><c:out value="${us.apodo}"></c:out></td>
					<td><c:out value="${us.faccion}"></c:out></td>
					<td><a href="/index/${us.id}/form">
							<button type="submit">Editar</button>
					</a></td>
					<td><a href="/index/${us.id}/delete">
							<button type="submit">Borrar</button>
					</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>