/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.persistencia;

import wyv.presentacion.AdminBean;

/**
 *
 * @author Data
 */
public class DaoAdministradorImp implements DaoAdministrador{

    AdministradorJpa adminJpa=new AdministradorJpa();
    
    @Override
    public Administrador buscarAdmin(String id) {
        Administrador admin=new Administrador();
        try {
           
           admin =adminJpa.findAdministrador(id);
           
          
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       return   admin;
        
    }
    
}
