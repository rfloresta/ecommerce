/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.servicios;

import java.util.List;
import wyv.persistencia.Cliente;
import wyv.persistencia.ClienteDao;
import wyv.persistencia.IOperacionesBD;

/**
 *
 * @author Data
 */
public class ClienteServicio implements  IOperacionesBD<Cliente>{
    
    ClienteDao clieDao;

    public void setClieDao(ClienteDao clieDao) {
        this.clieDao = clieDao;
    }
    
    

    @Override
    public String registrar(Cliente a) {
        clieDao=new ClienteDao();
        clieDao.registrar(a);
        return "ok";
        
    }

    @Override
    public String actualizar(Cliente a) {
        clieDao=new ClienteDao();
        clieDao.actualizar(a);
        
        return "ok";
    }

    @Override
    public String eliminar(String id) {
        clieDao=new ClienteDao();
        
        return clieDao.eliminar(id);
    }

    @Override
    public Cliente buscar(String id) {
        clieDao=new ClienteDao();
        return clieDao.buscar(id);
    }

    @Override
    public List<Cliente> listar() {
        clieDao=new ClienteDao();
        return clieDao.listar();
    }

    @Override
    public Cliente ingresar(Cliente entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
