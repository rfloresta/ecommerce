package wyv.servicios;

import java.util.ArrayList;
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
    private List<Administrador> lstAdmin =new ArrayList<>();

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
                System.out.println("aua");
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
           
            lstAdmin = admDao.listar();
            System.out.println("La liesta tiene " + lstAdmin.size());
            for(Administrador a : lstAdmin) {
                 System.out.println("Llego aqui");
                System.out.println("el admin"+ a.getEmail());
                if (a.getEmail().equals(email)) {
                    
                    admin= a;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            admin = null;
        }
        return admin;
    }
    
    
//    public static void  main(String[] args){
//        AdministradorServicio a=new AdministradorServicio();
//       Administrador administrador=new Administrador(); 
//        administrador=  a.validarEmail("bestradag05@gmail.com");
//        System.out.println("El admin es : " + administrador.getNombres());
//       
//    }

    public String comparar(Administrador entrada) {
        String estado = "incorrecto";
        try {
            admin = admDao.buscar(entrada.getDni());
            System.out.println(admin.getCodigoGenerado());
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
