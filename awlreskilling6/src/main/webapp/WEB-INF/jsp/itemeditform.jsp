<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Editar Item</title>
</head>
<body>
	<h1>Editar Item</h1>
	<form:form action="${pageContext.request.contextPath}/actualizaritem" method="post">
		Codigo producto: <form:input path="codproducto" readonly="true" /><br/>
		Nombre producto: <form:input path="nombreproducto"/><br/>
		Stock: <form:input path="stock"/><br/>
		RUT Proveedor: <!--<form:input path="rutproveedor"/>-->
		<form:select path="rutproveedor" items="${provlista}" itemLabel="nombreproveedor" itemValue="rutproveedor"></form:select>
		<br/>
		Precio: <form:input path="precio"/><br/>
		<input type="submit" value="Editar item" />
	</form:form>
	<br/>
	<a href="${pageContext.request.contextPath}">Volver a la página principal</a>

</body>
</html>
