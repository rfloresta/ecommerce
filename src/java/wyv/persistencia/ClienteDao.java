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
public class ClienteDao implements IOperacionesBD<Cliente>{
    
    ClienteJpa clieJpa=new ClienteJpa();

    @Override
    public String registrar(Cliente a) {
        try {
           
            clieJpa.create(a);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public String actualizar(Cliente a) {
         try {
            clieJpa.edit(a);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public String eliminar(String id) {
        try {
           
            int clieId= Integer.parseInt(id);
            clieJpa.destroy(clieId);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public Cliente buscar(String id) {
        try {
            
            int clieId= Integer.parseInt(id);
            return clieJpa.findCliente(clieId);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public List<Cliente> listar() {
        try {
            
            
            return clieJpa.findClienteEntities();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public Cliente ingresar(Cliente entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
