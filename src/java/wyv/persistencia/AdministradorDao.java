package wyv.persistencia;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class AdministradorDao implements IOperacionesBD<Administrador> {

    AdministradorJpa admJpa;

    @Override
    public String registrar(Administrador a) {
        try {
            admJpa = new AdministradorJpa();
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
            admJpa = new AdministradorJpa();
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
            admJpa = new AdministradorJpa();
            admJpa.destroy(id);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return null;
        }

    }

    @Override
    public Administrador buscar(String id) {
        admJpa = new AdministradorJpa();
        return admJpa.findAdministrador(id);
    }

    @Override
    public List<Administrador> listar() {
        admJpa = new AdministradorJpa();

        return admJpa.findAdministradorEntities();
    }

    @Override
    public Administrador validar(Administrador entrada) {
admJpa = new AdministradorJpa();
        return admJpa.findAdministrador(entrada.getDni());

    }

    // Metodo para la line Chart
    public List<Map<String, String>> ventaMes() {
        admJpa = new AdministradorJpa();
        return admJpa.ventaMes();
    }

    public int ContarCliente() {
        admJpa = new AdministradorJpa();
        return admJpa.ContarClientes();
    }

    public int ContarAdministrador() {
        admJpa = new AdministradorJpa();
        return admJpa.ContarAdministrador();
    }

    public int ContarPedido() {
        admJpa = new AdministradorJpa();
        return admJpa.ContarPedido();
    }

    @Override
    public int contar() {
        admJpa = new AdministradorJpa();
       return admJpa.getAdministradorCount();
    }
}
