package wyv.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wyv.persistencia.Categoria;
import wyv.persistencia.IOperacionesBD;
import wyv.persistencia.Marca;
import wyv.persistencia.Producto;
import wyv.persistencia.ProductoDao;

@Service
public class ProductoServicio implements  IOperacionesBD<Producto>{

    @Autowired
    ProductoDao proDao;
    Producto pro;
    
    @Override
    public String registrar(Producto a) {
        return proDao.registrar(a);
    }

    @Override
    public String actualizar(Producto a) {
        return proDao.actualizar(a);
    }

    @Override
    public String eliminar(String id) {
        return proDao.eliminar(id);
    }

    @Override
    public Producto buscar(String id) {
        return proDao.buscar(id);
    }

    @Override
    public List<Producto> listar() {
        return proDao.listar();
    }

    @Override
    public Producto validar(Producto entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
