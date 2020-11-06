package cl.awkrsk6.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awkrsk6.modelo.Item;
import cl.awkrsk6.modelo.ItemRepositorio;

@Service
public class ItemServicioImpl implements ItemServicio {

	@Autowired
	ItemRepositorio ir;
	
	@Override
	public List<Item> obtenerItems() {
		return (List<Item>) ir.findAll();
	}

	@Override
	public void agregarItem(Item i) {
		ir.save(i);
	}

	@Override
	public void eliminarItem(int itemid) {
		ir.delete(itemid);
	}

	@Override
	public void editarItem(Item i) {
		ir.save(i);
	}

	@Override
	public Item obtenerItemPorId(int itemid) {
		return ir.findOne(itemid);
	}

}
