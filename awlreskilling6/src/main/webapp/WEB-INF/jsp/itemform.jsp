<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Crear Item</title>
</head>
<body>
	<h1>Crear Item</h1>
	<form:form action="guardaritem" method="post">
		Codigo producto: <form:input path="codproducto"/><br/>
		Nombre producto: <form:input path="nombreproducto"/><br/>
		Stock: <form:input path="stock"/><br/>
		RUT Proveedor: <!--<form:input path="rutproveedor"/>-->
		<form:select path="rutproveedor" items="${provlista}" itemLabel="nombreproveedor" itemValue="rutproveedor"></form:select>
		<br/>
		Precio: <form:input path="precio"/><br/>
		<input type="submit" value="Crear item" />
	</form:form>
	<br/>
	<a href="${pageContext.request.contextPath}">Volver a la página principal</a>

</body>
</html>
