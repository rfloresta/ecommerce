/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.servicios;

import java.util.List;
import wyv.persistencia.IOperacionesBD;
import wyv.persistencia.SubCategoriaDao;
import wyv.persistencia.Subcategoria;

/**
 *
 * @author bdeg_
 */
public class SubCategoriaServicio implements IOperacionesBD<Subcategoria>{

    SubCategoriaDao subCatDao;
     @Override
    public String registrar(Subcategoria a) {
       subCatDao=new SubCategoriaDao();
       return subCatDao.registrar(a);
    }

    @Override
    public String actualizar(Subcategoria a) {
       subCatDao=new SubCategoriaDao();
       return subCatDao.actualizar(a);
    }

    @Override
    public String eliminar(String id) {
        subCatDao=new SubCategoriaDao();
       return subCatDao.eliminar(id);
    }

    @Override
    public Subcategoria buscar(String id) {
       subCatDao=new SubCategoriaDao();
       return subCatDao.buscar(id);
    }

    @Override
    public List<Subcategoria> listar() {
        subCatDao=new SubCategoriaDao();
       return subCatDao.listar();
    }

    @Override
    public Subcategoria validar(Subcategoria entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
