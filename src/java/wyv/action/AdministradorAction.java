package wyv.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import wyv.servicios.AdministradorServicio;
import wyv.persistencia.Administrador;

@SuppressWarnings("serial")
public class AdministradorAction extends ActionSupport implements SessionAware {

    AdministradorServicio admSer;
    private String resultado;
    private String estado;
    private Administrador admin;
    private static Administrador adminLog;// Variable estática para que el nombre del admin logeado no cambie al ejecutar cualquier opcion que utilice la clase Administrador
    private List<Administrador> lstAdmin;
    private List<String> listaMes;
    private List<String> listaTotal;
    private int edit;
    private int contarCliente;
    private int contarAdministrador;
    private int contarPedidos;
    private String jsonMes; 
    private String jsonTotal;
    private Map<String, Object> sesion;
    

     @Override
    public void setSession(Map<String, Object> map) {
        this.sesion = map;
    }

    
    public int getContarAdministrador() {
        return contarAdministrador;
    }

    public void setContarAdministrador(int contarAdministrador) {
        this.contarAdministrador = contarAdministrador;
    }

    public int getContarPedidos() {
        return contarPedidos;
    }

    public void setContarPedidos(int contarPedidos) {
        this.contarPedidos = contarPedidos;
    }

    public int getContarCliente() {
        return contarCliente;
    }

    public void setContarCliente(int contarCliente) {
        this.contarCliente = contarCliente;
    }
    
    public String getJsonMes() {
        return jsonMes;
    }

    public void setJsonMes(String jsonMes) {
        this.jsonMes = jsonMes;
    }

    public String getJsonTotal() {
        return jsonTotal;
    }

    public void setJsonTotal(String jsonTotal) {
        this.jsonTotal = jsonTotal;
    }
    public Administrador getAdminLog() {
        return adminLog;
    }

    public void setAdminLog(Administrador adminLog) {
        this.adminLog = adminLog;
    }

    public String getResultado() {
        return resultado;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public List<Administrador> getLstAdmin() {
        return lstAdmin;
    }

    public int getEdit() {
        return edit;
    }

    public void setAdmSer(AdministradorServicio admSer) {
        this.admSer = admSer;
    }

    public AdministradorServicio getAdmSer() {
        return admSer;
    }

    @Action(value = "ingresoAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/inicio.jsp")
        ,
        @Result(name = "incorrecto", location = "/admin/seguridad/login.jsp")
        ,
	@Result(name = "error", location = "/admin/error.jsp"),})
    public String ingresoAdmin() {
        try {

            admSer = new AdministradorServicio();
            adminLog = admSer.ingresar(adminLog);
            sesion.put("privilegio", adminLog.getPrivilegio());
            sesion.put("NombreCompleto", adminLog.getNombres() + " " + adminLog.getApellidos());
            sesion.put("Nombre", adminLog.getNombres());
            //Metodo para mandar listas al dashboard
            List<Map<String, String>>lista= admSer.ventaMes();
            List<String> listaMesP=new ArrayList();
            List<String> listaTotalP=new ArrayList();
            // se separa las liastas
            for (int i = 0; i < lista.size(); i++) {

                listaMesP.add(lista.get(i).get("Fecha"));
                listaTotalP.add(lista.get(i).get("Total"));

            }
            // Se separa las listas para mandarlo en formato JSON
            listaMes= listaMesP;
            listaTotal= listaTotalP;
            // Se envia al formato Json
             jsonMes = new Gson().toJson(listaMes);
             jsonTotal = new Gson().toJson(listaTotal);
            
             //Metodo para contarCliente
             contarCliente = admSer.ContarCliente();
             //Fin metodo para contar Cliente
            
             //Metodo para contar Administradores
             contarAdministrador= admSer.ContarAdministrador();
             //Fin Metodo para contr Administradores
             
             //Metodo para contar Pedidos
             contarPedidos = admSer.ContarPedido();
             //Fin metodo para contar pedidos
            if (adminLog == null) {
                resultado = "Dni y/o password incorrecto";
                return "incorrecto";
            }

            return "ok";
        } catch (Exception e) {
            resultado = "Error en: ingresoAdmin :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "listarAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/administrador.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp"),})
    public String listarAdmin() {
        try {
            admSer = new AdministradorServicio();
            lstAdmin = admSer.listar();

            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarAdmin :: " + e.getMessage();
            return "error";
        }
    }

//    @Override
//    public void validate(){
//        if(getAdmin().getDni() == null){
//            addFieldError("dni", "Ingrese el DNI");
//        }
//        if(getAdmin().getNombres()== null){
//            addFieldError("nombres", "Ingrese Nombres");
//        }
//        if(getAdmin().getApellidos()== null){
//            addFieldError("apellidos", "Ingrese Apellidos");
//        }
//        if(getAdmin().getPassword()== null){
//            addFieldError("password", "Ingrese Password");
//        }
//    }
    //HACER ASÍ EL MANTENIMIENTO, CON LA VARIABLE "estado"
    @Action(value = "registrarAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/administrador.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
        ,
                        @Result(name = "input", location = "/admin/principal/administrador.jsp")
    })
    public String registrarAdmin() {
        try {
            admSer = new AdministradorServicio();
            estado = admSer.registrar(admin);
            lstAdmin = new AdministradorServicio().listar();
            admin = new Administrador();
            return estado;
        } catch (Exception e) {
            resultado = "Error en: registrarAdmin :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "editarAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/administrador.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String editarAdmin() {

        try {
//                    if(getAdmin().getDni().equals(LOG)){
//           addFieldError("dni", "Ingrese el DNI");
//       }
            admin = new AdministradorServicio().buscar(admin.getDni());
            lstAdmin = new AdministradorServicio().listar();
            edit = 1;
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: editarAdmin :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "actualizarAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/administrador.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String actualizarAdmin() {

        try {
            new AdministradorServicio().actualizar(admin);
            lstAdmin = new AdministradorServicio().listar();
            admin = new Administrador();
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: eliminarMarca :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "eliminarAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/administrador.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String eliminarAdmin() {

        try {
            new AdministradorServicio().eliminar(admin.getDni());
            lstAdmin = new AdministradorServicio().listar();
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: eliminarMarca :: " + e.getMessage();
            return "error";
        }
    }

   
}
