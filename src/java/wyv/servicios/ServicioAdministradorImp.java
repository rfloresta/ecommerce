/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.servicios;


import wyv.persistencia.Administrador;
import wyv.persistencia.DaoAdministrador;
import wyv.persistencia.DaoAdministradorImp;
import wyv.presentacion.AdminBean;

/**
 *
 * @author Data
 */
public class ServicioAdministradorImp implements ServicioAdministrador {
    
    DaoAdministrador daoAdmin;
    Administrador admin;

    public void setDaoAdmin(DaoAdministrador daoAdmin) {
        this.daoAdmin = daoAdmin;
    }



    @Override  
    public Administrador buscarAdmin(String dni) {
        admin =new Administrador();
        DaoAdministradorImp dao=new DaoAdministradorImp();
        
        admin = dao.buscarAdmin(dni);
        return admin;
    }
    
    

    
}
