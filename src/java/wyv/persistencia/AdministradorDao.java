package wyv.persistencia;
import java.util.List;

public class AdministradorDao implements IOperacionesBD<Administrador> {
    
    AdministradorJpa admJpa=new AdministradorJpa();

    @Override
    public String registrar(Administrador a) {
        try {
            admJpa.create(a);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @Override
    public String actualizar(Administrador a) {
        try {
            admJpa.edit(a);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public String eliminar(String id) {
        try {
           admJpa.destroy(id);
           return "ok";
       } catch (Exception e) {
            e.getMessage();
            return null;
        }
      
    }

    @Override
    public Administrador buscar(String id) {

     return  admJpa.findAdministrador(id);
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
