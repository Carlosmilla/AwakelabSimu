package cl.awkrsk4.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.awkrsk4.modelo.Proveedor;

public class ProveedorDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<Proveedor> getProveedores(){
	    return template.query("select * from proveedor",new RowMapper<Proveedor>(){    
	        public Proveedor mapRow(ResultSet rs, int row) throws SQLException {    
	            Proveedor p=new Proveedor();
	            
	            p.setRutproveedor(rs.getInt(1));
	            p.setNombreproveedor(rs.getString(2));
	            p.setDireccion(rs.getString(3));
	            p.setComuna(rs.getString(4));
	            
	            return p;
	        }
	    });  
	}
	
	public int guardarProveedor(Proveedor p) {
		String sql = "insert into proveedor (rutproveedor, nombreproveedor, direccion, comuna) values ('" + p.getRutproveedor() + "','" + p.getNombreproveedor() + "','" + p.getDireccion() + "','" + p.getComuna() + "')";
		return template.update(sql);
	}
	
	public int eliminarProveedor(int proveedorrut) {
		String sql = "delete from proveedor where rutproveedor = '" + proveedorrut + "'";
		return template.update(sql);
	}
	
	public int editarProveedor(Proveedor p) {
		String sql = "update proveedor set nombreproveedor = '" + p.getNombreproveedor() + "', direccion = '" + p.getDireccion() + "', comuna = '" + p.getComuna() + "' where rutproveedor = '" + p.getRutproveedor() + "'";
		System.out.println(sql);
		return template.update(sql);
	}
	
	
}
