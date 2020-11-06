package cl.awkrsk6.servicio;

import java.util.List;

import cl.awkrsk6.modelo.Proveedor;

public interface ProveedorServicio {

	List<Proveedor> obtenerProveedores();
	void agregarProveedor(Proveedor p);
	void eliminarProveedor(int proveedorrut);
	void editarProveedor(Proveedor p);
	Proveedor obtenerProveedorPorRut(int proveedorrut);

}
