/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.servicios;

import java.util.List;
import wyv.persistencia.Marca;
import wyv.persistencia.IOperacionesBD;
import wyv.persistencia.MarcaDao;

/**
 *
 * @author Data
 */
public class MarcaServicio implements IOperacionesBD<Marca> {

    MarcaDao marcDao;
    Marca marca;
    
    @Override
    public String registrar(Marca a) {
        marcDao = new MarcaDao();
        return marcDao.registrar(a);
    }

    @Override
    public String actualizar(Marca a) {
            marcDao = new MarcaDao();
            
            return marcDao.actualizar(a);   

    }

    @Override
    public String eliminar(String id) {
        marcDao = new MarcaDao();
        return marcDao.eliminar(id);
    }

    @Override
    public Marca buscar(String id) {
        marcDao = new MarcaDao();
        return marcDao.buscar(id);
    }

    @Override
    public List<Marca> listar() {
        marcDao = new MarcaDao();
        return marcDao.listar();
    }

    @Override
    public Marca validar(Marca entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
