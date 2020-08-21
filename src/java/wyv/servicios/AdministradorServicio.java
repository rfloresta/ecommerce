package wyv.servicios;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static wyv.action.Encriptacion.Desencriptar;

import wyv.persistencia.Administrador;
import wyv.persistencia.AdministradorDao;
import wyv.persistencia.IOperacionesBD;

@Service
public class AdministradorServicio implements IOperacionesBD<Administrador> {

    @Autowired
    AdministradorDao admDao/*= new AdministradorDao()*/;
    Administrador admin;
    private List<Administrador> lstAdmin;

    @Override
    public String registrar(Administrador a) {
        return admDao.registrar(a);
    }

    @Override
    public String actualizar(Administrador a) {
        return admDao.actualizar(a);

    }

    @Override
    public String eliminar(String id) {
        return admDao.eliminar(id);

    }

    @Override
    public Administrador buscar(String id) {
        return admDao.buscar(id);
    }

    @Override
    public List<Administrador> listar() {
        return admDao.listar();
    }

    @Override
    public Administrador validar(Administrador entrada) {
        try {
            admin = admDao.validar(entrada);
            if (admin != null) {
                String passDesencriptado = Desencriptar(admin.getPassword());
                
                if (passDesencriptado.equals(entrada.getPassword())) {
                    return admin;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void nuevoObj() {
        admin = new Administrador();
    }

    //Metodo para el Chart Line
    public List<Map<String, String>> ventaMes() {
        return admDao.ventaMes();
    }

    public int ContarCliente() {
        return admDao.ContarCliente();
    }

    public int ContarAdministrador() {
        return admDao.ContarAdministrador();
    }

    public int ContarPedido() {
        return admDao.ContarPedido();
    }

    public Administrador validarEmail(String email) {
        try {
            lstAdmin = listar();
            for (Administrador a : lstAdmin) {
                if (a.getEmail().equals(email)) {
                    return a;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public String comparar(Administrador entrada) {
        String estado = "incorrecto";
        try {
            admin = admDao.buscar(entrada.getDni());
            if (admin.getCodigoGenerado().equals(entrada.getCodigoGenerado())) {
                estado = "ok";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return estado;
    }

    @Override
    public int contar() {
        return admDao.contar();
    }
}
