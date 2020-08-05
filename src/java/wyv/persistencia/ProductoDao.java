/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.persistencia;

import java.util.List;

/**
 *
 * @author Data
 */
public class ProductoDao implements IOperacionesBD<Producto>{

    ProductoJpa proJpa=new ProductoJpa();
    @Override
    public String registrar(Producto a) {
        try {

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
            proJpa.edit(a);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public String eliminar(String id) {
        int idPro= Integer.parseInt(id);
        try {
            proJpa.destroy(idPro);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public Producto buscar(String id) {
        int idPro= Integer.parseInt(id);
        try {
            
            return proJpa.findProducto(idPro);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public List<Producto> listar() {
        try {
           
            return  proJpa.findProductoEntities();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public Producto validar(Producto entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public List<Subcategoria> listarSubPorCate(int id) {
        try {
           
            return  proJpa.listarSubPorCate(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
    
    
}
