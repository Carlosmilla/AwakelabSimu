package cl.awkrsk6.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awkrsk6.modelo.Proveedor;
import cl.awkrsk6.servicio.ProveedorServicio;

@Controller
public class ProveedorControlador {

	@Autowired
	ProveedorServicio ps;
	
	@RequestMapping("/listaproveedores")
	public String verproveedores(Model m) {
		List<Proveedor> lproveedores = ps.obtenerProveedores();
		m.addAttribute("proveedoreslista", lproveedores);
		return "listadoproveedores";
	}
	
	@RequestMapping("/nuevoproveedor")
	public String newproveedor(Model m) {
		m.addAttribute("command", new Proveedor());
		return "provform";
	}
	
	@RequestMapping(value="guardarproveedor", method=RequestMethod.POST)
	public String newproveedorsave(@ModelAttribute("prov") Proveedor prov) {
		ps.agregarProveedor(prov);
		return "redirect:/listaproveedores";
	}
	
	@RequestMapping("/eliminarprov/{proveedorrut}")
	public String deleteprov(@PathVariable int proveedorrut, Model m) {
		ps.eliminarProveedor(proveedorrut);
		return "redirect:/listaproveedores";
	}

	@RequestMapping("/editarprov/{proveedorrut}")
	public String editprov(@PathVariable int proveedorrut, Model m) {
		Proveedor pr = new Proveedor();
		
		pr = ps.obtenerProveedorPorRut(proveedorrut);
		
		m.addAttribute("command", pr);
		return "proveditform";
	}
	
	@RequestMapping(value="actualizarproveedor", method=RequestMethod.POST)
	public String editprovsave(@ModelAttribute("prov") Proveedor prov) {
		ps.editarProveedor(prov);
		return "redirect:/listaproveedores";
	}
	
	
}
