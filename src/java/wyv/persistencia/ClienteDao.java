package wyv.persistencia;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ClienteDao implements IOperacionesBD<Cliente>{
    
    ClienteJpa clieJpa;

    @Override
    public String registrar(Cliente a) {
        try {
            clieJpa=new ClienteJpa();
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
            clieJpa=new ClienteJpa();
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
           clieJpa=new ClienteJpa();
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
            clieJpa=new ClienteJpa();
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
            clieJpa=new ClienteJpa();
            return clieJpa.findClienteEntities();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public Cliente validar(Cliente entrada) {
        clieJpa=new ClienteJpa();
        return clieJpa.findCliente(entrada.getIdCliente());
    }

    @Override
    public int contar() {
        clieJpa=new ClienteJpa();
        return clieJpa.getClienteCount();
    }
    
}
