<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
      
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Formulario</h3>
<br>
<form action="/index/update" method="post">
<table>
 <tr>
            <td><b>Name</b></td>
            <td><input type='text' name='nombre' value="${user.nombre}" /></td>
        </tr>
 
        <tr>
            <td><b>Surname</b></td>
            <td><input type='text' name='apodo' value="${user.apodo}" /></td>
        </tr>
 
        <tr>
            <td><b>Adress</b></td>
            <td><input type='text' name='faccion' value="${user.faccion}" /></td>
            
        </tr>
 
 			<input type='hidden' id='id' name='id' value="${user.id}"/>
        <tr>
            <td></td>
            <td>
                <button type="submit" >Actualizar info</button>
            </td>
        </tr>
</table>
</form>
</body>
</html>