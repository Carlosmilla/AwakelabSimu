package cl.awkrsk6.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awkrsk6.modelo.Proveedor;
import cl.awkrsk6.modelo.ProveedorRepositorio;

@Service
public class ProveedorServicioImpl implements ProveedorServicio {

	@Autowired
	ProveedorRepositorio pr;
	
	@Override
	public List<Proveedor> obtenerProveedores() {
		return (List<Proveedor>) pr.findAll();
	}

	@Override
	public void agregarProveedor(Proveedor p) {
		pr.save(p);
	}

	@Override
	public void eliminarProveedor(int proveedorrut) {
		pr.delete(proveedorrut);
	}

	@Override
	public void editarProveedor(Proveedor p) {
		pr.save(p);
	}

	@Override
	public Proveedor obtenerProveedorPorRut(int proveedorrut) {
		return pr.findOne(proveedorrut);
	}

}
