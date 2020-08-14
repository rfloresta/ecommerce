package wyv.persistencia;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class AdministradorDao implements IOperacionesBD<Administrador> {

    AdministradorJpa admJpa = new AdministradorJpa();

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
        return admJpa.findAdministrador(id);
    }

    @Override
    public List<Administrador> listar() {

        return admJpa.findAdministradorEntities();
    }

    @Override
    public Administrador validar(Administrador entrada) {

        return admJpa.findAdministrador(entrada.getDni());

    }

    // Metodo para la line Chart
    public List<Map<String, String>> ventaMes() {
        return admJpa.ventaMes();
    }

    public int ContarCliente() {
        return admJpa.ContarClientes();
    }

    public int ContarAdministrador() {
        return admJpa.ContarAdministrador();
    }

    public int ContarPedido() {
        return admJpa.ContarPedido();
    }

    @Override
    public int contar() {
       return admJpa.getAdministradorCount();
    }
}
