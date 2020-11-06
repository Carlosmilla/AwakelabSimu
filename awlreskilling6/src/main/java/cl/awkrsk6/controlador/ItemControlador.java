package cl.awkrsk6.controlador;

import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awkrsk6.modelo.Item;
import cl.awkrsk6.modelo.Proveedor;
import cl.awkrsk6.servicio.ItemServicio;
import cl.awkrsk6.servicio.ProveedorServicio;

@Controller
public class ItemControlador {

	static Logger log = Logger.getLogger(ItemControlador.class);
	
	@Autowired
	ItemServicio is;
	
	@Autowired
	ProveedorServicio ps;
	
	
	@RequestMapping("/listaitems")
	public String veritems(Model m) {
		
		log.setLevel(Level.INFO);
		log.info("Entramos a la lista de items");
		
		List<Item> litems = is.obtenerItems();		
		m.addAttribute("itemslista", litems);
		return "listadoitems";
	}

	@RequestMapping("/nuevoitem")
	public String newitem(Model m) {
		//log.setLevel(Level.WARN);
		log.log(Level.WARN, "Estamos entrando al nuevo item");

		List<Proveedor> lprov = ps.obtenerProveedores();
		m.addAttribute("provlista", lprov);
		m.addAttribute("command", new Item());
		return "itemform";
	}
	
	@RequestMapping(value="guardaritem", method=RequestMethod.POST)
	public String newitemsave(@ModelAttribute("itm") Item itm) {
		log.log(Level.ERROR, "Item agregado");
		is.agregarItem(itm);
		return "redirect:/listaitems";
	}

	@RequestMapping("/editaritem/{itemid}")
	public String edititem(@PathVariable int itemid, Model m) {
		log.log(Level.FATAL, "Ingresamos a la edición de item");
		List<Proveedor> lprov = ps.obtenerProveedores();
		m.addAttribute("provlista", lprov);
		
		Item it = new Item();
		it = is.obtenerItemPorId(itemid);
		
		m.addAttribute("command", it);
		return "itemeditform";
	}

	@RequestMapping("/eliminaritem/{itemid}")
	public String deleteitem(@PathVariable int itemid, Model m) {						
		is.eliminarItem(itemid);
		return "redirect:/listaitems";
	}

	@RequestMapping(value="actualizaritem", method=RequestMethod.POST)
	public String edititemsave(@ModelAttribute("itm") Item itm) {
		is.editarItem(itm);
		return "redirect:/listaitems";
	}

}
