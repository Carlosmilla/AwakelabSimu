package cl.awkrsk6.modelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepositorio extends CrudRepository<Proveedor, Integer> {

}
