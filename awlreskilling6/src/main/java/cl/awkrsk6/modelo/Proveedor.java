package cl.awkrsk6.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proveedor {

	@Id
	private int rutproveedor;
	private String nombreproveedor;
	private String direccion;
	private String comuna;
	
	public Proveedor() {
		super();
	}

	public Proveedor(int rutproveedor, String nombreproveedor, String direccion, String comuna) {
		super();
		this.rutproveedor = rutproveedor;
		this.nombreproveedor = nombreproveedor;
		this.direccion = direccion;
		this.comuna = comuna;
	}

	public int getRutproveedor() {
		return rutproveedor;
	}

	public void setRutproveedor(int rutproveedor) {
		this.rutproveedor = rutproveedor;
	}

	public String getNombreproveedor() {
		return nombreproveedor;
	}

	public void setNombreproveedor(String nombreproveedor) {
		this.nombreproveedor = nombreproveedor;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	@Override
	public String toString() {
		return "Proveedor [rutproveedor=" + rutproveedor + ", nombreproveedor=" + nombreproveedor + ", direccion="
				+ direccion + ", comuna=" + comuna + "]";
	}
	
	
	
}
