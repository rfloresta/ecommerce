package wyv.persistencia;
import java.util.List;

public class AdministradorDao implements IOperacionesBD<Administrador> {
    
    AdministradorJpa admJpa=new AdministradorJpa();

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
//        try {
//            adminJpa.destroy(String.valueOf(id));
//            msg="ok";
//        } catch (Exception e) {
//            msg=e.getMessage();
//        }
//        return msg;
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrador buscar(int id) {

     return  admJpa.findAdministrador(String.valueOf(id));
    }

    @Override
    public List<Administrador> listar() {
       return admJpa.findAdministradorEntities();
    }

    @Override
    public Administrador ingresar(Administrador entrada) {
       
     return admJpa.findAdministrador(entrada.getDni());
  
    }

    
    
}
