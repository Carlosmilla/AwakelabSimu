package com.simAw.Controllador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simAw.models.Detallefactura;
import com.simAw.models.Factura;
import com.simAw.services.CategoriaServiceImpl;
import com.simAw.services.FacturaServiceImpl;

@Controller
public class MainController {

	@Autowired
	public FacturaServiceImpl ft;
	
	@Autowired
	public CategoriaServiceImpl ct;
	
	@RequestMapping("")
	public String mainPage(Model model) {
		return "index";
	}
	
	@RequestMapping(value = "/procesar")
	public String procesarF(Model model, @RequestParam("txtfact") int idFactura) { // se agrega parametro del formulario post en el jsp
		Factura fact = ft.obtenerFactId(idFactura); // se instancia factura para obtener la id por medio del metodo del service
		List<Detallefactura> detfact = fact.getDetalle(); // se llama al detalle y se solicitan los datos heredados
		
	    int subtotal = 0;
	    for (int i=0; i<detfact.size();i++) {
	    	subtotal += (detfact.get(i).getProductoid().getValor() * detfact.get(i).getCantidad());
	    }
	    int impuesto = (int)(subtotal * 0.19);
	    
	    int total = subtotal + impuesto;
		
	    model.addAttribute("sub", subtotal);
	    model.addAttribute("imp", impuesto);
	    model.addAttribute("tot", total);
		model.addAttribute("ft", fact); // se asignan atributos y objetos
		model.addAttribute("df", detfact);
		
		
		
		return "procesado"; // se retorna el jsp 
	}
}
