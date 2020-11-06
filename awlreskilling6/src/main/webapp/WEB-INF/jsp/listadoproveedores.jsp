<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Listado de proveedores</h1>

<table>
	<tr>
		<th>RUT</th>
		<th>Nombre proveedor</th>
		<th>Dirección</th>
		<th>Comuna</th>
		<th>Acciones</th>
	</tr>
	<c:forEach items="${proveedoreslista}" var="prov">
	<tr>
		<td><c:out value="${prov.getRutproveedor()}" /></td>
		<td><c:out value="${prov.getNombreproveedor()}" /></td>
		<td><c:out value="${prov.getDireccion()}" /></td>
		<td><c:out value="${prov.getComuna()}" /></td>
		<td>
			<a href="${pageContext.request.contextPath}/eliminarprov/${prov.getRutproveedor()}">Eliminar</a>&nbsp;
			<a href="${pageContext.request.contextPath}/editarprov/${prov.getRutproveedor()}">Editar</a>&nbsp;
		</td>
	</tr>
	</c:forEach>
</table>

<a href="${pageContext.request.contextPath}">Volver a la página principal</a>


</body>
</html>