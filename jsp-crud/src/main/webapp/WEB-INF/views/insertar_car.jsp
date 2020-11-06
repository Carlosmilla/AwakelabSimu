<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>insertar Auto</h3>
	<form:form modelAttribute="auto">
		<label>Modelo: </label>
		<form:input type="text" path="modelo_auto" />
		<label>Precio: </label>
		<form:input type="number" path="precio_auto" />
		<label>Propietario: </label>
		<form:input type="text" path="propietario" />
		<button type="submit">Guardar</button>
	</form:form>
	<c:url value="http://localhost:8090/listarAutos" var="url2">
	</c:url>
	<a href="${url2}">Volver</a>
</body>
</html>