<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Editar Proveedor</title>
</head>
<body>
	<h1>Editar Proveedor</h1>
	<form:form action="${pageContext.request.contextPath}/actualizarproveedor" method="post">
		RUT proveedor: <form:input path="rutproveedor" readonly="true" /><br/>
		Nombre proveedor: <form:input path="nombreproveedor"/><br/>
		Dirección: <form:input path="direccion"/><br/>
		Comuna: <form:input path="comuna"/><br/>
		<input type="submit" value="Editar proveedor" />
	</form:form>
	<br/>
	<a href="${pageContext.request.contextPath}">Volver a la página principal</a>

</body>
</html>
