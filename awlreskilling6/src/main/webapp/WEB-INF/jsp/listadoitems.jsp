<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<jsp:include page="header.jsp"/>

<main role="main">

  <!-- Main jumbotron for a primary marketing message or call to action -->
  <div class="jumbotron">
    <div class="container">
      <h1 class="display-3">Listado de Items</h1>
    </div>
  </div>

  <div class="container">
    <!-- Example row of columns -->
    <div class="table-responsive">

	<table class="table table-striped table-sm">
		<thead>
		<tr>
			<th>Codigo producto</th>
			<th>Nombre</th>
			<th>Stock</th>
			<th>RUT Proveedor</th>
			<th>Precio</th>
			<th>Acciones</th>
		</tr>
		</thead>
		<tbody>
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
		</tbody>
	</table>


    </div>

    <hr>

  </div> <!-- /container -->

</main>

<jsp:include page="footer.jsp"/>
