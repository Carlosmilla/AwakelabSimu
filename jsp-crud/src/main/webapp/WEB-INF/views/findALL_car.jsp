<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Lista de carros</h3>
	<c:url value="http://localhost:8090/insertarAuto" var="url1">
	</c:url>
	<a href="${url1}">Agregar Auto</a>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Modelo</th>
				<th>Precio</th>
				<th>Propietario</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="card" items="${listaCarros}">
				<tr>
					<td>${card.id_auto}</td>
					<td>${card.modelo_auto}</td>
					<td>${card.precio_auto}</td>
					<td>${card.propietario}</td>
					<td>
					<c:url value="http://localhost:8090/editarAuto/" var="url3">
	                </c:url>
					<a href="${url3}+${card.id_auto}">Editar</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>