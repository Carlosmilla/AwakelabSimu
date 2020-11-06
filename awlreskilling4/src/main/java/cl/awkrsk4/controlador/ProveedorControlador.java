package cl.awkrsk4.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awkrsk4.dao.ProveedorDao;
import cl.awkrsk4.modelo.Proveedor;

@Controller
public class ProveedorControlador {

	@Autowired
	ProveedorDao pd;

	@RequestMapping("/listaproveedores")
	public String verproveedores(Model m) {
		List<Proveedor> lproveedores = pd.getProveedores();
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
		pd.guardarProveedor(prov);
		return "redirect:/listaproveedores";
	}
	
	@RequestMapping("/eliminarprov/{proveedorrut}")
	public String deleteprov(@PathVariable int proveedorrut, Model m) {
		pd.eliminarProveedor(proveedorrut);
		return "redirect:/listaproveedores";
	}

	@RequestMapping("/editarprov/{proveedorrut}")
	public String editprov(@PathVariable int proveedorrut, Model m) {
		List<Proveedor> lprov = pd.getProveedores();
		Proveedor pr = new Proveedor();
		
		for (int i=0;i<lprov.size();i++) {
			if (lprov.get(i).getRutproveedor() == proveedorrut) {
				pr = lprov.get(i);
			}
		}
		
		m.addAttribute("command", pr);
		return "proveditform";
	}
	
	@RequestMapping(value="actualizarproveedor", method=RequestMethod.POST)
	public String editprovsave(@ModelAttribute("prov") Proveedor prov) {
		pd.editarProveedor(prov);
		return "redirect:/listaproveedores";
	}
	
	
}
