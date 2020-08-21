package wyv.persistencia;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductoDao implements IOperacionesBD<Producto> {

    ProductoJpa proJpa;

    @Override
    public String registrar(Producto a) {
        try {
            proJpa = new ProductoJpa();
            proJpa.create(a);
            return "ok";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "error";
        }
    }

    @Override
    public String actualizar(Producto a) {
        try {
            proJpa = new ProductoJpa();
            proJpa.edit(a);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public String eliminar(String id) {
        int idPro = Integer.parseInt(id);
        try {
            proJpa = new ProductoJpa();
            proJpa.destroy(idPro);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public Producto buscar(String id) {
        int idPro = Integer.parseInt(id);
        try {
            proJpa = new ProductoJpa();
            return proJpa.findProducto(idPro);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public List<Producto> listar() {
        try {
            proJpa = new ProductoJpa();
            return proJpa.findProductoEntities();
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    @Override
    public Producto validar(Producto entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Subcategoria> listarSubPorCate(int id) {
        try {
            proJpa = new ProductoJpa();
            return proJpa.listarSubPorCate(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
    
     public List<Producto> buscarProducto(String value) {
        try {
            proJpa = new ProductoJpa();
            return proJpa.buscarProducto(value);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
     
}
