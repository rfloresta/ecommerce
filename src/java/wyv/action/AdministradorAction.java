package wyv.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import wyv.servicios.AdministradorServicio;
import wyv.persistencia.Administrador;

@SuppressWarnings("serial")
public class AdministradorAction extends ActionSupport {

    AdministradorServicio admSer;
    private String resultado;
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
    
   @Action(value = "listarAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/administrador.jsp"),
	@Result(name = "error", location = "admin/error.jsp")

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
    
    @Action(value="registrarAdmin",results= {
			@Result(name="ok",location="/admin/principal/administrador.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String registrarAdmin() {
		try {
			new AdministradorServicio().registrar(admin);
			lstAdmin=new AdministradorServicio().listar();
			admin=new Administrador();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: registrarAdmin :: "+e.getMessage();
			return "error";
		}
	}
        
        
        @Action(value="editarAdmin",results= {
			@Result(name="ok",location="/admin/principal/administrador.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String editarAdmin() {
		
		try {
			admin =new AdministradorServicio().buscar(admin.getDni());
			lstAdmin=new AdministradorServicio().listar();
                        edit=1;
			return "ok";
		} catch (Exception e) {
			resultado="Error en: editarAdmin :: "+e.getMessage();
			return "error";
		}
	}
        
        
        @Action(value="actualizarAdmin",results= {
			@Result(name="ok",location="/admin/principal/administrador.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String actualizarAdmin() {
		
		try {
			new AdministradorServicio().actualizar(admin);
			lstAdmin=new AdministradorServicio().listar();
                        admin=new Administrador();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: eliminarMarca :: "+e.getMessage();
			return "error";
		}
	}

   @Action(value="eliminarAdmin",results= {
			@Result(name="ok",location="/admin/principal/administrador.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String eliminarAdmin() {
		
		try {
			new AdministradorServicio().eliminar(admin.getDni());
			lstAdmin=new AdministradorServicio().listar();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: eliminarMarca :: "+e.getMessage();
			return "error";
		}
	}

   

    @Action(value = "ingresoAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/inicio.jsp"),
        @Result(name = "incorrecto", location = "/admin/seguridad/login.jsp"),
	@Result(name = "error", location = "/admin/error.jsp")

    })
    public String ingresoAdmin() {
        try {
            
            admSer=new AdministradorServicio();
            adminLog = admSer.ingresar(adminLog);
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
}
