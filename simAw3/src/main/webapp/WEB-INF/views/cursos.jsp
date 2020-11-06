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
		<h1>Simulacro 3</h1>
		<table class="table table-dark">
			<tr>
				<th>Curso</th>
				<th>Nombre</th>
				<th>cantidad Alumnos</th>
				<th>Ver Alumnos</th>

			</tr>
			<c:forEach items="${cur}" var="cur">
				<tr>
					<td>${cur.getIdcurso()}</td>
					<td>${cur.getNombre()}</td>
					<td>${cur.getAlumno().stream().count()}</td>
					<td><c:url value="http://localhost:8079/verAlumnos/"
							var="url3">
						</c:url> <a href="${url3}+${cur.getIdcurso()}"
						class="btn btn-primary btn-danger">Ver Alumnos</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>