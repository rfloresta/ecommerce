package wyv.servicios;

import java.util.List;
import wyv.persistencia.Administrador;
import wyv.persistencia.AdministradorDao;
import wyv.persistencia.IOperacionesBD;

public class AdministradorServicio implements IOperacionesBD<Administrador>{

    
    AdministradorDao admDao;
    Administrador admin;
    
    public void setObjDao(AdministradorDao objDao) {
        this.admDao = objDao;
    }
    
    @Override
    public int registrar(Administrador a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Administrador a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrador buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Administrador> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrador ingresar(Administrador entrada) {
        entrada.getDni();
        entrada.getPassword();
        admin = admDao.ingresar(entrada);
        if (admin != null) {
            if (admin.getPassword().equals(entrada.getPassword())) {
                return admin;
            }
        }
        return null;
    }
    
    
    
}
