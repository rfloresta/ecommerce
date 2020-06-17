package wyv.action;

import com.opensymphony.xwork2.ActionContext;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import wyv.servicios.AdministradorServicio;
import wyv.persistencia.Administrador;

@SuppressWarnings("serial")
public class AdministradorAction extends ActionSupport {

    AdministradorServicio admSer;
    private String resultado;
    private String estado="error";
    private Administrador admin;
    private static Administrador adminLog;// Variable estática para que el nombre del admin logeado no cambie al ejecutar cualquier opcion que utilice la clase Administrador
    private List<Administrador> lstAdmin;
    private int edit;

    
    
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
    

    
    
    @Action(value = "ingresoAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/inicio.jsp"),
        @Result(name = "incorrecto", location = "/admin/seguridad/login.jsp"),
	@Result(name = "error", location = "/admin/error.jsp"),
            

    })
       public String ingresoAdmin() {
        try {
            
            admSer=new AdministradorServicio();
            adminLog = admSer.ingresar(adminLog);
            
            if (adminLog == null) {
            resultado = "Dni y/o password incorrecto";
            return "incorrecto";
            }
             
            /*Map admSession = ActionContext.getContext().getSession();
            
             admSession.put("admSession" ,adminLog);
              System.out.println(" prueba " + admSession.values());*/
             
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: ingresoAdmin :: " + e.getMessage();
            return "error";
        }
    }   
       
   @Action(value = "listarAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/administrador.jsp"),
	@Result(name = "error", location = "admin/error.jsp"),

    })
    public String listarAdmin() {
        try {
            admSer=new AdministradorServicio();
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
    @Action(value="registrarAdmin",results= {
			@Result(name="ok",location="/admin/principal/administrador.jsp"),
			@Result(name="error",location="/admin/error.jsp"),
                        @Result(name="input",location="/admin/principal/administrador.jsp")
	})
	public String registrarAdmin() {
		try {        
                        admSer=new AdministradorServicio();
                        estado=admSer.registrar(admin);
			lstAdmin=admSer.listar();
			admin=new Administrador();
			return estado;
		} catch (Exception e) {
			resultado="Error en: registrarAdmin :: "+e.getMessage();
			return estado;
		}
	}

        @Action(value="editarAdmin",results= {
			@Result(name="ok",location="/admin/principal/administrador.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String editarAdmin() {
		
		try {
//                    if(getAdmin().getDni().equals(LOG)){
//           addFieldError("dni", "Ingrese el DNI");
//       }
                        admSer=new AdministradorServicio();
			admin=admSer.buscar(admin.getDni());
			lstAdmin=admSer.listar();
                        edit=1;
			return "ok";
		} catch (Exception e) {
			resultado="Error en: editarAdmin :: "+e.getMessage();
			return "error";
		}
	}
        
        
        @Action(value="actualizarAdmin",results= {
			@Result(name="ok",location="/admin/principal/administrador.jsp"),
			@Result(name="error",location="/admin/error.jsp")
	})
	public String actualizarAdmin() {
		
		try {
                        admSer=new AdministradorServicio();
			estado=admSer.actualizar(admin);
			lstAdmin=admSer.listar();
                        admin=new Administrador();
			return estado;
		} catch (Exception e) {
			resultado="Error en: eliminarMarca :: "+e.getMessage();
			return estado;
		}
	}

   @Action(value="eliminarAdmin",results= {
			@Result(name="ok",location="/admin/principal/administrador.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String eliminarAdmin() {
		
		try {
                        admSer=new AdministradorServicio();
			estado=admSer.eliminar(admin.getDni());
			lstAdmin=admSer.listar();
			return estado;
		} catch (Exception e) {
			resultado="Error en: eliminarMarca :: "+e.getMessage();
			return estado;
		}
	}

    
   

}