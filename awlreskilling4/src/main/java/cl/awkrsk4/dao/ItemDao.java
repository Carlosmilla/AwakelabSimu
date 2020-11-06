package cl.awkrsk4.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.awkrsk4.modelo.Item;

public class ItemDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<Item> getItems(){
	    return template.query("select * from item",new RowMapper<Item>(){    
	        public Item mapRow(ResultSet rs, int row) throws SQLException {    
	            Item i=new Item();
	            i.setCodproducto(rs.getInt(1));
	            i.setNombreproducto(rs.getString(2));
	            i.setStock(rs.getInt(3));
	            i.setRutproveedor(rs.getInt(4));
	            i.setPrecio(rs.getInt(5));           
	            return i;
	        }
	    });  
	}

	public int guardarItem(Item i) {
		String sql = "insert into item (codproducto, nombreproducto, stock, rutproveedor, precio) values ('" + i.getCodproducto() + "','" + i.getNombreproducto() + "','" + i.getStock() + "','" + i.getRutproveedor() + "','" + i.getPrecio() +"')";
		return template.update(sql);
	}

	public int editarItem(Item i) {
		String sql = "update item set nombreproducto = '" + i.getNombreproducto() + "', stock = '" + i.getStock() + "', rutproveedor = '"+ i.getRutproveedor() +"', precio = '" + i.getPrecio() + "' where codproducto = '" + i.getCodproducto() + "'";
		return template.update(sql);		
	}

	public int eliminarItem(int codproducto) {
		String sql = "delete from item where codproducto = '" + codproducto + "'";
		return template.update(sql);
	}

}
