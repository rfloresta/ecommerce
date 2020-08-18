package wyv.persistencia;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MarcaDao  implements IOperacionesBD<Marca>{

    MarcaJpa marcaJpa=new MarcaJpa();
    
    @Override
    public String registrar(Marca a) {
        try {
            marcaJpa.create(a);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public String actualizar(Marca a) {
        try {
            marcaJpa.edit(a);
            return "ok";
        } catch (Exception e) {
            
            e.getMessage();
            return "error";
        }
    }

    @Override
    public String eliminar(String id) {
        int idMarca=Integer.parseInt(id);
        try {
            marcaJpa.destroy(idMarca);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public Marca buscar(String id) {
        
        int idMarca=Integer.parseInt(id);
         try {
            return marcaJpa.findMarca(idMarca);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public List<Marca> listar() {
         try {
            return marcaJpa.findMarcaEntities();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public Marca validar(Marca entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
