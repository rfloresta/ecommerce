/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.servicios;

import java.util.List;
import wyv.persistencia.IOperacionesBD;
import wyv.persistencia.Producto;
import wyv.persistencia.ProductoDao;

/**
 *
 * @author Data
 */
public class Productoservicio implements  IOperacionesBD<Producto>{

    ProductoDao proDao;
    
    @Override
    public String registrar(Producto a) {
        
        proDao=new ProductoDao();
        return proDao.registrar(a);
    }

    @Override
    public String actualizar(Producto a) {
        proDao=new ProductoDao();
        return proDao.actualizar(a);
    }

    @Override
    public String eliminar(String id) {
        proDao=new ProductoDao();
        return proDao.eliminar(id);
    }

    @Override
    public Producto buscar(String id) {
        proDao=new ProductoDao();
        return proDao.buscar(id);
    }

    @Override
    public List<Producto> listar() {
        proDao=new ProductoDao();
        return proDao.listar();
    }

    @Override
    public Producto ingresar(Producto entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
