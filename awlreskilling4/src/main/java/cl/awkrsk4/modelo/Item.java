package cl.awkrsk4.modelo;

public class Item {

	private int codproducto;
	private String nombreproducto;
	private int stock;
	private int rutproveedor;
	private int precio;
	
	public Item() {
		super();
	}

	public Item(int codproducto, String nombreproducto, int stock, int rutproveedor, int precio) {
		super();
		this.codproducto = codproducto;
		this.nombreproducto = nombreproducto;
		this.stock = stock;
		this.rutproveedor = rutproveedor;
		this.precio = precio;
	}

	public int getCodproducto() {
		return codproducto;
	}

	public void setCodproducto(int codproducto) {
		this.codproducto = codproducto;
	}

	public String getNombreproducto() {
		return nombreproducto;
	}

	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getRutproveedor() {
		return rutproveedor;
	}

	public void setRutproveedor(int rutproveedor) {
		this.rutproveedor = rutproveedor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Item [codproducto=" + codproducto + ", nombreproducto=" + nombreproducto + ", stock=" + stock
				+ ", rutproveedor=" + rutproveedor + ", precio=" + precio + "]";
	}
	
}
