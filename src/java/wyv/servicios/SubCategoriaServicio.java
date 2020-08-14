package wyv.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wyv.persistencia.IOperacionesBD;
import wyv.persistencia.SubCategoriaDao;
import wyv.persistencia.Subcategoria;

@Service
public class SubCategoriaServicio implements IOperacionesBD<Subcategoria>{
    
    @Autowired
    SubCategoriaDao subCatDao;
    
     @Override
    public String registrar(Subcategoria a) {
       return subCatDao.registrar(a);
    }

    @Override
    public String actualizar(Subcategoria a) {
       return subCatDao.actualizar(a);
    }

    @Override
    public String eliminar(String id) {
       return subCatDao.eliminar(id);
    }

    @Override
    public Subcategoria buscar(String id) {
       return subCatDao.buscar(id);
    }

    @Override
    public List<Subcategoria> listar() {
       return subCatDao.listar();
    }

    @Override
    public Subcategoria validar(Subcategoria entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
