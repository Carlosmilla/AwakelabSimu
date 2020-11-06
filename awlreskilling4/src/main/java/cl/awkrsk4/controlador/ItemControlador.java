package cl.awkrsk4.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awkrsk4.dao.ItemDao;
import cl.awkrsk4.dao.ProveedorDao;
import cl.awkrsk4.modelo.Item;
import cl.awkrsk4.modelo.Proveedor;

@Controller
public class ItemControlador {

	@Autowired
	ItemDao id;
	
	@Autowired
	ProveedorDao pd;
	
	
	@RequestMapping("/listaitems")
	public String veritems(Model m) {
		List<Item> litems = id.getItems();		
		m.addAttribute("itemslista", litems);
		return "listadoitems";
	}

	@RequestMapping("/nuevoitem")
	public String newitem(Model m) {
		List<Proveedor> lprov = pd.getProveedores();
		m.addAttribute("provlista", lprov);
		m.addAttribute("command", new Item());
		return "itemform";
	}
	
	@RequestMapping(value="guardaritem", method=RequestMethod.POST)
	public String newitemsave(@ModelAttribute("itm") Item itm) {
		id.guardarItem(itm);
		return "redirect:/listaitems";
	}

	@RequestMapping("/editaritem/{itemid}")
	public String edititem(@PathVariable int itemid, Model m) {
		List<Proveedor> lprov = pd.getProveedores();
		m.addAttribute("provlista", lprov);
		
		List<Item> litems = id.getItems();
		Item it = new Item();
		
		for (int i=0;i<litems.size();i++) {
			if (litems.get(i).getCodproducto() == itemid) {
				it = litems.get(i);
			}
		}
				
		m.addAttribute("command", it);
		return "itemeditform";
	}

	@RequestMapping("/eliminaritem/{itemid}")
	public String deleteitem(@PathVariable int itemid, Model m) {						
		id.eliminarItem(itemid);
		return "redirect:/listaitems";
	}

	@RequestMapping(value="actualizaritem", method=RequestMethod.POST)
	public String edititemsave(@ModelAttribute("itm") Item itm) {
		id.editarItem(itm);
		return "redirect:/listaitems";
	}

}
