/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.servicios;

import java.util.List;
import wyv.persistencia.Categoria;
import wyv.persistencia.CategoriaDao;
import wyv.persistencia.IOperacionesBD;

/**
 *
 * @author Data
 */
public class CategoriaServicio implements IOperacionesBD<Categoria> {

    CategoriaDao cateDao;
    Categoria categoria;
    
    @Override
    public String registrar(Categoria a) {
        cateDao = new CategoriaDao();
        return cateDao.registrar(a);
    }
    /*
    public String registrarSubCate(Categoria a) {
        cateDao = new CategoriaDao();
        return cateDao.registrarSubCate(a);
    }*/

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
    public Categoria ingresar(Categoria entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public List<Categoria> listarCategoria() {
       cateDao = new CategoriaDao();
        return cateDao.listarCategoria();
    }
     
      public List<Categoria> listarsubCategoria() {
       cateDao = new CategoriaDao();
        return cateDao.listarsubCategoria();
    }
    
}
