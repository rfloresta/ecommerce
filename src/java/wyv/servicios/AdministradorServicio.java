package wyv.servicios;


import java.util.List;

import wyv.persistencia.Administrador;
import wyv.persistencia.AdministradorDao;
import wyv.persistencia.IOperacionesBD;


public class AdministradorServicio implements IOperacionesBD<Administrador>{

    
    AdministradorDao admDao;
    Administrador admin;

    public void setAdmDao(AdministradorDao admDao) {
        this.admDao = admDao;
    }
    
    @Override
    public String registrar(Administrador a) {
        admDao=new AdministradorDao();
        
        admDao.registrar(a);
        
       return "ok";
    }

    @Override
    public String actualizar(Administrador a) {
        admDao=new AdministradorDao();
        admDao.actualizar(a);
        
        return "ok";
        
    }

    @Override
    public String eliminar(String id) {
       
        admDao=new AdministradorDao();
        
        return admDao.eliminar(id);
        
    }

    @Override
    public Administrador buscar(String id) {
        admDao=new AdministradorDao();
        
        return admDao.buscar(id);
    }

    @Override
    public List<Administrador> listar() {
        admDao=new AdministradorDao();
        
      
        return admDao.listar();
    }
    
  

    @Override
    public Administrador ingresar(Administrador entrada) {
        admDao=new AdministradorDao();
        admin = admDao.ingresar(entrada);
        if (admin != null) {
            if (admin.getPassword().equals(entrada.getPassword())) {
                return admin;
            }
        }
        return null;
    }
    
    public void nuevoObj() {
       admin=new Administrador();
    }
    
}
