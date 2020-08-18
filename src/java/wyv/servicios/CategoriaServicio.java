package wyv.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wyv.persistencia.Categoria;
import wyv.persistencia.CategoriaDao;
import wyv.persistencia.IOperacionesBD;

@Service
public class CategoriaServicio implements IOperacionesBD<Categoria> {
    @Autowired
    CategoriaDao cateDao;
    Categoria categoria;
    
    @Override
    public String registrar(Categoria a) {
        return cateDao.registrar(a);
    }
    
    @Override
    public String actualizar(Categoria a) {
        return cateDao.actualizar(a);
    }

    @Override
    public String eliminar(String id) {
       return cateDao.eliminar(id);
    }

    @Override
    public Categoria buscar(String id) {
        return cateDao.buscar(id);
    }

    @Override
    public List<Categoria> listar() {
        return cateDao.listar();
    }

    @Override
    public Categoria validar(Categoria entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public List<Categoria> listarCategoria() {
        return cateDao.listar();
    }
     
      public List<Categoria> listarsubCategoria() {
        return cateDao.listarsubCategoria();
    }

    @Override
    public int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
