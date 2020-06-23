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
    private String estado="error";
    private Administrador admin;
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
    
    public Map getSession() {
          return sesion;
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
        @Result(name = "ok", location = "/admin/principal/inicio.jsp")
        ,
        @Result(name = "incorrecto", location = "/admin/seguridad/login.jsp")
        ,
	@Result(name = "error", location = "/admin/error.jsp")})
    public String ingresoAdmin() {
        try {

            admSer = new AdministradorServicio();
            admin = admSer.ingresar(admin);
            sesion.put("privilegio", admin.getPrivilegio());
            sesion.put("nombreCompleto", admin.getNombres() + " " + admin.getApellidos());
            sesion.put("nombre", admin.getNombres());
            sesion.put("dni", admin.getDni());
            //Metodo para mandar listas al dashboard
            List<Map<String, String>>lista= admSer.ventaMes();
            List<String> listaMesP=new ArrayList();
            List<String> listaTotalP=new ArrayList();
            // se separa las listas
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
            if (admin == null) {
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
    //HACER ASÍ EL MANTENIMIENTO, CON LA VARIABLE "estado
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
        
         @Action(value="cargarPerfilAdmin",results= {
			@Result(name="ok",location="/admin/principal/perfil.jsp"),
			@Result(name="error",location="/admin/error.jsp")
	})
	public String cargarDatos() {
		
		try {
                        admSer=new AdministradorServicio();
                        String dni=(String)sesion.get("dni");
			admin=admSer.buscar(dni);
			return "ok";
		} catch (Exception e) {
			resultado="Error en: cargarPerfilAdmin :: "+e.getMessage();
			return "error";
		}
	}

    
        @Action(value="actualizarDatosAdmin",results= {
			@Result(name="ok",location="/admin/principal/perfil.jsp"),
			@Result(name="error",location="/admin/error.jsp")
	})
	public String actualizarDatos() {
		
		try {
                        admSer=new AdministradorServicio();
			estado=admSer.actualizar(admin);
			String dni=(String)sesion.get("dni");
			admin=admSer.buscar(dni);
			return estado;
		} catch (Exception e) {
			resultado="Error en: cargarPerfilAdmin :: "+e.getMessage();
			return estado;
		}
	}

    
    }



