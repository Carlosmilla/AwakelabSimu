<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Crear Proveedor</title>
</head>
<body>
	<h1>Crear Proveedor</h1>
	<form:form action="guardarproveedor" method="post">
		RUT proveedor: <form:input path="rutproveedor"/><br/>
		Nombre proveedor: <form:input path="nombreproveedor"/><br/>
		Dirección: <form:input path="direccion"/><br/>
		Comuna: <form:input path="comuna"/><br/>
		<input type="submit" value="Crear proveedor" />
	</form:form>
	<br/>
	<a href="${pageContext.request.contextPath}">Volver a la página principal</a>

</body>
</html>
