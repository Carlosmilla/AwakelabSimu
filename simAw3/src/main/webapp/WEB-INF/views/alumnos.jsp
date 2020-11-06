<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<form action="">
		<h1>Simulacro 3</h1>
		<table class="table table-dark">
			<tr>
				<th>id Curso</th>
				<th>Nombre Alumno</th>

			</tr>
			<c:forEach items="${alumno}" var="alum">
				<tr>
					<td>${alum.getNombre()}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>