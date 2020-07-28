package wyv.servicios;

import java.util.List;
import java.util.Map;
import static wyv.action.Encriptacion.Desencriptar;

import wyv.persistencia.Administrador;
import wyv.persistencia.AdministradorDao;
import wyv.persistencia.IOperacionesBD;

public class AdministradorServicio implements IOperacionesBD<Administrador> {

    AdministradorDao admDao;
    Administrador admin;

    private List<Administrador> lstAdmin;
    public void setAdmDao(AdministradorDao admDao) {
        this.admDao = admDao;
    }

    @Override
    public String registrar(Administrador a) {
        admDao = new AdministradorDao();
        return admDao.registrar(a);
    }

    @Override
    public String actualizar(Administrador a) {
        admDao = new AdministradorDao();
        return admDao.actualizar(a);

    }

    @Override
    public String eliminar(String id) {

        admDao = new AdministradorDao();
        return admDao.eliminar(id);

    }

    @Override
    public Administrador buscar(String id) {
        admDao = new AdministradorDao();
        return admDao.buscar(id);
    }

    @Override
    public List<Administrador> listar() {
        admDao = new AdministradorDao();
        return admDao.listar();
    }

    @Override
    public Administrador validar(Administrador entrada) {
        admDao = new AdministradorDao();
        admin = admDao.validar(entrada);
        try {
            if (admin != null) {
                String passDesencriptado= Desencriptar(admin.getPassword());
            if (passDesencriptado.equals(entrada.getPassword())) {
                return admin;
            }
        }
        } catch (Exception e) {
             System.out.println(e.getMessage());
             return null;
        }
        return null;
    }

    public void nuevoObj() {
        admin = new Administrador();
    }
    
    //Metodo para el Chart Line
    
    public List<Map<String, String>> ventaMes()
    {
        
        return   admDao.ventaMes();
    }
    
    // Metodo para contar cliente
    
    public int ContarCliente()
    {
        return admDao.ContarCliente();
    }
    //Metodo para contar Administrador
    public int ContarAdministrador()
    {
        return admDao.ContarAdministrador();
    }
    
    //Metodo para contar Pedidos
    
    public int ContarPedido()
    {
        return admDao.ContarPedido();
    }
    
   public Administrador validarEmail(String email){
            lstAdmin = listar();
            for (Administrador a : lstAdmin) {
                if (a.getEmail().equals(email)) {
                    return a;
                } 
            }
            return null;
        }
   public String comparar(Administrador entrada) {
        try {
            admDao = new AdministradorDao();
            admin = admDao.buscar(entrada.getDni());
            if (admin != null) {
                if (admin.getCodigoGenerado().equals(entrada.getCodigoGenerado())) {
                    return "ok";
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }
}
