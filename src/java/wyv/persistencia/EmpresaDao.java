package wyv.persistencia;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmpresaDao implements IOperacionesBD<Empresa>{

    EmpresaJpa  empJpa=new EmpresaJpa();
    Empresa empresa;
    

    @Override
    public String registrar(Empresa a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String actualizar(Empresa a) {
        try {
            empJpa.edit(a);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public Empresa validar(Empresa entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empresa buscar(String id) {
       try {
           empresa=empJpa.findEmpresa(Integer.parseInt(id));
        } catch (NumberFormatException e) {
            e.getMessage();
        }
       return empresa;
    }

    @Override
    public List<Empresa> listar() {
        
           return empJpa.findEmpresaEntities();
        
    }

    @Override
    public int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
