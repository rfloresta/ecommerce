/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.persistencia;

import java.util.List;

/**
 *
 * @author bdeg_
 */
public class SubCategoriaDao implements IOperacionesBD<Subcategoria>{

    SubcategoriaJpa subCateJpa= new SubcategoriaJpa();
    @Override
    public String registrar(Subcategoria a) {
        try {
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
            
            return subCateJpa.findSubcategoria(Integer.parseInt(id));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public List<Subcategoria> listar() {
         try {
            
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
    
}
