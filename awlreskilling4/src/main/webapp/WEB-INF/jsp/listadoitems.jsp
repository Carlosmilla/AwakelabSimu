<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de items</title>
</head>
<body>
	
	<h1>Listado de items</h1>
	
	<table>
		<tr>
			<th>Codigo producto</th>
			<th>Nombre</th>
			<th>Stock</th>
			<th>RUT Proveedor</th>
			<th>Precio</th>
			<th>Acciones</th>
		</tr>
		<c:forEach items="${itemslista}" var="item">	
		<tr>
			<td><c:out value="${item.getCodproducto()}" /></td>
			<td><c:out value="${item.getNombreproducto()}" /></td>
			<td><c:out value="${item.getStock()}" /></td>
			<td><c:out value="${item.getRutproveedor()}" /></td>
			<td><c:out value="${item.getPrecio()}" /></td>
			<td>
				<a href="eliminaritem/<c:out value="${item.getCodproducto()}" />">Eliminar</a> &nbsp;
				<a href="editaritem/<c:out value="${item.getCodproducto()}" />">Editar</a> &nbsp;				
			</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>