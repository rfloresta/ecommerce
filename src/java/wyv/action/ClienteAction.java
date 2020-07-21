/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import static wyv.action.Encriptacion.Desencriptar;
import wyv.persistencia.Cliente;
import static wyv.action.Encriptacion.Encriptar;
import wyv.persistencia.RecuperarPassword;
import wyv.servicios.ClienteServicio;
import wyv.servicios.RecuperarPasswordServicio;

/**
 *
 * @author Data
 */
@SuppressWarnings("serial")
public class ClienteAction extends ActionSupport implements SessionAware {

    ClienteServicio clieSer;
    RecuperarPasswordServicio recSer;
    private String resultado;
    private Cliente cliente;
    private RecuperarPassword recuperar;
    private List<Cliente> lstClie;
    private int edit;
    private int inicio;
    private String jsonPerfil;
    private int op;
    private Map<String, Object> sesion;
    private String estado="error";
    private String passwordActual;

    public RecuperarPassword getRecuperar() {
        return recuperar;
    }

    public void setRecuperar(RecuperarPassword recuperar) {
        this.recuperar = recuperar;
    }

    
        
    public String getResultado() {
        return resultado;
    }

    public String getJsonPerfil() {
        return jsonPerfil;
    }

    public void setJsonPerfil(String jsonPerfil) {
        this.jsonPerfil = jsonPerfil;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Cliente> getLstClie() {
        return lstClie;
    }

    public int getEdit() {
        return edit;
    }

    public int getInicio() {
        return inicio;
    }

    public void setClieSer(ClienteServicio clieSer) {
        this.clieSer = clieSer;
    }

    public String getPasswordActual() {
        return passwordActual;
    }

    public void setPasswordActual(String passwordActual) {
        this.passwordActual = passwordActual;
    }
    
    @Override
    public void setSession(Map<String, Object> map) {
        this.sesion = map;
    }
    

    @Action(value = "ingresoCliente", results = {
        @Result(name = "ok", location = "/catalogo.jsp")
        ,
        @Result(name = "incorrecto", location = "/catalogo.jsp")
        ,
	@Result(name = "error", location = "/error.jsp"),})
    public String ingresoCliente() {
        try {
            clieSer = new ClienteServicio();
            lstClie = clieSer.listar();
            
            String id = "";
            String dni = "";
            String nombres = "";
            String apellidos = "";
            String dir = "";
            String cel = "";
            String email = "";
            String pass = "";
            
            for (Cliente c : lstClie) {
                
            String passDesencriptado= Desencriptar(c.getPassword());
                if (c.getEmail().equals(cliente.getEmail()) && passDesencriptado.equals(cliente.getPassword())) {
                    id = c.getIdCliente().toString();
                    dni = c.getDni();
                    nombres = c.getNombres();
                    apellidos = c.getApellidos();
                    dir = c.getDireccion();
                    cel = c.getNumCelular();
                    email = c.getEmail();
                    pass = c.getPassword();
                    sesion.put("seccion", 1);
                } else {
                    addActionError("Email o password incorectos");
                    sesion.put("seccion", 0);
                }
            }
            sesion.put("id", id);
            sesion.put("dni", dni);
            sesion.put("nombres", nombres);
            sesion.put("apellidos", apellidos);
            sesion.put("cel", cel);
            sesion.put("dir", dir);
            sesion.put("email", email);
            sesion.put("pass", pass);
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: ingresoClie :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "listarClie", results = {
        @Result(name = "ok", location = "/admin/principal/cliente.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String listarClie() {
        try {
            clieSer = new ClienteServicio();
            lstClie = clieSer.listar();
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "registrarClie", results = {
        @Result(name = "ok", location = "/admin/principal/cliente.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String registrarClie() {
        try {
            new ClienteServicio().registrar(cliente);
            lstClie = new ClienteServicio().listar();
            cliente = new Cliente();
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: registrarCate :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "editarClie", results = {
        @Result(name = "ok", location = "/admin/principal/cliente.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String editarClie() {

        try {
            cliente = new ClienteServicio().buscar(String.valueOf(cliente.getIdCliente()));
            lstClie = new ClienteServicio().listar();
            edit = 1;
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: editarAdmin :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "misDatos", results = {
        @Result(name = "ok", location = "/perfil.jsp")
    })
    public String misDatos() {
       return "ok";
    }

    /* Prueba
        @Action(value="buscarCliePerfil",results= {
			@Result(name="ok",location="/clientePerfil.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String buscarCliePerfil() {
		
		try {
			cliente =new ClienteServicio().buscar(String.valueOf(cliente.getIdCliente()));
			jsonPerfil = new Gson().toJson(cliente.getNombres());
                        System.out.println("Json perfil "+ jsonPerfil);
			return "ok";
		} catch (Exception e) {
			resultado="Error en: editarAdmin :: "+e.getMessage();
			return "error";
		}
	}
     */
    @Action(value = "actualizarClie", results = {
        @Result(name = "ok", location = "/perfil.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String actualizarClie() {

        try {
            String id=(String)sesion.get("id");
            String pass=(String)sesion.get("pass");
            cliente.setIdCliente(Integer.parseInt(id));
            cliente.setPassword(pass);
            new ClienteServicio().actualizar(cliente);
            cliente = new ClienteServicio().buscar(id);
            op = 2;
            sesion.put("dni", cliente.getDni());
            sesion.put("nombres", cliente.getNombres());
            sesion.put("apellidos", cliente.getApellidos());
            sesion.put("cel", cliente.getNumCelular());
            sesion.put("dir", cliente.getDireccion());
            sesion.put("email", cliente.getEmail());
            sesion.put("seccion", 1);
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: actualizarClie :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "eliminarClie", results = {
        @Result(name = "ok", location = "/admin/principal/cliente.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String eliminarClie() {

        try {
            new ClienteServicio().eliminar(String.valueOf(cliente.getIdCliente()));
            lstClie = new ClienteServicio().listar();
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: eliminarMarca :: " + e.getMessage();
            return "error";
        }
    }
    
    @Action(value = "registrarse", results = {
        @Result(name = "ok", location = "/catalogo.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String registrarse() {
        try {
            clieSer=new ClienteServicio();
            String passEncryp = Encriptar(cliente.getPassword());
            cliente.setPassword(passEncryp);
            estado=clieSer.registrar(cliente);
            if(estado.equals("ok")){
            sesion.put("nombres", cliente.getNombres());
            sesion.put("apellidos", cliente.getApellidos());
            sesion.put("email", cliente.getEmail());
            sesion.put("pass", cliente.getPassword());
            sesion.put("seccion", 1);
            resultado="¡Gracias por registrarte!";
            }
            return estado;
        } catch (Exception e) {
            resultado = "Error en: registrarCate :: " + e.getMessage();
            return estado;
        }
    }
    
    @Action(value="cambiarPasswordClie",results= {
			@Result(name="ok",location="/cambiar_password.jsp"),
			@Result(name="error",location="/error.jsp"),
                        @Result(name="incorrecto",location="/cambiar_password.jsp")
	})
	public String cambiarPasswordClie() {
		try {
                        String passSession=Desencriptar((String)sesion.get("pass"));
                        String passForm=passwordActual;
                        if(passSession.equals(passForm)){
                        clieSer=new ClienteServicio();
			String id=(String)sesion.get("id");
                        String dni=(String)sesion.get("dni");
                        String nombres=(String)sesion.get("nombres");
                        String apellidos=(String)sesion.get("apellidos");
                        String dir=(String)sesion.get("dir");
                        String cel=(String)sesion.get("cel");
                        String email=(String)sesion.get("email");
                        String passEncryp = Encriptar(cliente.getPassword());
                        cliente.setIdCliente(Integer.parseInt(id));
                        cliente.setDni(dni);
                        cliente.setNombres(nombres);
                        cliente.setApellidos(apellidos);
                        cliente.setEmail(email);
                        cliente.setDireccion(dir);
                        cliente.setNumCelular(cel);
                        cliente.setPassword(passEncryp);
			estado=clieSer.actualizar(cliente);
                        sesion.put("incorrecto", 0);
			return estado;
                        }
                        sesion.put("incorrecto", 1);
                        return estado="incorrecto";
		} catch (Exception e) {
			resultado="Error en: cambiarPasswordCliente :: "+e.getMessage();
			return estado;
		}
	}
        
        @Action(value="cerrarSesionClie",results= {
			@Result(name="ok",location="/index.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String cerrarSesionClie() {
		try {
                        sesion.clear();
                        sesion.put("seccion", 0);
			return estado="ok";
		} catch (Exception e) {
			resultado="Error en: cerrarSesionCliente :: "+e.getMessage();
			return estado;
		}
	}
        
        @Action(value="restablecerPasswordClie",results= {
			@Result(name="ok",location="/cliente/seguridad/validar-codigo.jsp"),
			@Result(name="error",location="/cliente/error.jsp"),
                        @Result(name="incorrecto",location="/cliente/seguridad/restablecer-password.jsp")
	})
        public String restablecerPasswordClie() throws MessagingException{
            try {
            clieSer=new ClienteServicio();
            String email=cliente.getEmail();
            cliente=clieSer.validarEmail(email);
            if(cliente!=null){
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");//usamos gmail como host 
            props.setProperty("mail.smtp.starttls.enable", "true");// habilitamos el protocol seguro TLS
            props.setProperty("mail.smtp.port", "587");//Puerto de gmail
            props.setProperty("mail.smtp.auth", "true");//Autorización
            
            Session session = Session.getDefaultInstance(props);
            String correoRemitente = "prueba10021@gmail.com";
            String passwordRemitente = "prueba12344";
            String correoReceptor = cliente.getEmail();
            String asunto = "W&V - Restablecer Contraseña";
            //genera un numero entre 1 y 5 y lo guarda en la variable codigo
            int codigo = (int)(100000 * Math.random());
            
            //Actualizamos el código de la tabla recuperar_password del usuario
            recSer=new RecuperarPasswordServicio();
            recuperar.setIdUsuario(cliente.getIdCliente().toString());
            recuperar.setCodigo(String.valueOf(codigo));
            recSer.actualizar(recuperar);
            
            String mensaje = "Hola "+cliente.getNombres()+"<br>Tu código de restableción es: "+codigo;
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje, "ISO-8859-1", "html");
            Transport t = session.getTransport("smtp");
            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();
            estado="ok";
            }else{
            addActionError("El email no existe en el sistema");
            estado="incorrecto";
            }
            }catch (MessagingException e){
                System.out.println(e.getMessage());
                 return estado;
        }
        return estado;
        }
        
        
        
}
