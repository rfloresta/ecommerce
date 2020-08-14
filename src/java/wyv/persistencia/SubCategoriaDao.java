package wyv.persistencia;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SubCategoriaDao implements IOperacionesBD<Subcategoria>{

    SubcategoriaJpa subCateJpa;
    @Override
    public String registrar(Subcategoria a) {
        try {
            subCateJpa= new SubcategoriaJpa();
            subCateJpa.create(a);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public String actualizar(Subcategoria a) {
        try {
            subCateJpa= new SubcategoriaJpa();
            subCateJpa.edit(a);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public String eliminar(String id) {
         try {
             subCateJpa= new SubcategoriaJpa();
            subCateJpa.destroy(Integer.parseInt(id));
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public Subcategoria buscar(String id) {
         try {
            subCateJpa= new SubcategoriaJpa();
            return subCateJpa.findSubcategoria(Integer.parseInt(id));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public List<Subcategoria> listar() {
         try {
            subCateJpa= new SubcategoriaJpa();
            return subCateJpa.findSubcategoriaEntities();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
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
