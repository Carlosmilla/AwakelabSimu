package cl.awkrsk6.servicio;

import java.util.List;

import cl.awkrsk6.modelo.Item;

public interface ItemServicio {

	List<Item> obtenerItems();
	void agregarItem(Item i);
	void eliminarItem(int itemid);
	void editarItem(Item i);
	Item obtenerItemPorId(int itemid);
	
}
