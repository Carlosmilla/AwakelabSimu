<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>Listado de ciudades y ayudas</h1>
	<div>
		<table>
			<thead>
				<tr>
					
					<th>Tipo de Ayuda</th>
					<th>Monto</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ayu}" var="c">
					<tr>
						
						<td>${c.getMotivo()}</td>
						<td>${c.getMonto()}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div></div>
</body>
</html>