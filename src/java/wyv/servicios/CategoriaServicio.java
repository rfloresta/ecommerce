package wyv.servicios;

import java.util.List;
import org.springframework.stereotype.Service;
import wyv.persistencia.Categoria;
import wyv.persistencia.CategoriaDao;
import wyv.persistencia.IOperacionesBD;

@Service
public class CategoriaServicio implements IOperacionesBD<Categoria> {

    CategoriaDao cateDao;
    Categoria categoria;
    
    @Override
    public String registrar(Categoria a) {
        cateDao = new CategoriaDao();
        return cateDao.registrar(a);
    }

    @Override
    public String actualizar(Categoria a) {
        cateDao = new CategoriaDao();
        return cateDao.actualizar(a);
    }

    @Override
    public String eliminar(String id) {
       cateDao = new CategoriaDao();
       return cateDao.eliminar(id);
    }

    @Override
    public Categoria buscar(String id) {
        cateDao = new CategoriaDao();
        return cateDao.buscar(id);
    }

    @Override
    public List<Categoria> listar() {
        cateDao = new CategoriaDao();
        return cateDao.listar();
    }

    @Override
    public Categoria validar(Categoria entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public List<Categoria> listarCategoria() {
       cateDao = new CategoriaDao();
        return cateDao.listarCategoria();
    }
     
      public List<Categoria> listarsubCategoria(int id) {
       cateDao = new CategoriaDao();
        return cateDao.listarsubCategoria(id);
    }

    @Override
    public int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
