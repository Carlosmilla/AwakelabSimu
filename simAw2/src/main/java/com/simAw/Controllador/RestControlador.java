package com.simAw.Controllador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simAw.models.Categoria;
import com.simAw.models.Producto;
import com.simAw.services.CategoriaService;

@RestController
public class RestControlador {

	@Autowired
	CategoriaService catSer;
	
	@RequestMapping(value = "/prodcategoria/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Producto> obtenerProductoCategoria(@PathVariable int id) {
		Categoria cat = catSer.findCatId(id);
		return cat.getProducto();
	}
}
