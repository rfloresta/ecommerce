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
    Cliente cliente;

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
    public Cliente validar(Cliente entrada) {
         clieDao = new ClienteDao();
        cliente = clieDao.validar(entrada);
        try {
            if (cliente != null) {
            if (cliente.getEmail().equals(entrada.getEmail())) {
                return cliente;
            }
        }
        } catch (Exception e) {
             System.out.println(e.getMessage());
             return null;
        }
        return null;
    }
    
    public String registrarse(Cliente a) {
        clieDao=new ClienteDao();
        clieDao.registrar(a);
        return "ok";
        
    }
    
    public Cliente validarEmail(String email){
            List<Cliente> lstClie = listar();
            for (Cliente c : lstClie) {
                if (c.getEmail().equals(email)) {
                    return c;
                } 
            }
            return null;
        }
     
    public String comparar(Cliente entrada) {
        try {
            clieDao = new ClienteDao();
            cliente = clieDao.buscar(entrada.getIdCliente().toString());
            if (cliente != null) {
                if (cliente.getCodigoGenerado().equals(entrada.getCodigoGenerado())) {
                    return "ok";
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }
}
