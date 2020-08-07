package wyv.action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import static wyv.action.Encriptacion.Desencriptar;
import static wyv.action.Encriptacion.Encriptar;
import org.json.simple.JSONObject;
import wyv.persistencia.Cliente;
import wyv.servicios.CategoriaServicio;
import wyv.servicios.ClienteServicio;
import wyv.servicios.MarcaServicio;
import wyv.servicios.ProductoServicio;
import wyv.persistencia.Producto;
import wyv.persistencia.Categoria;
import wyv.persistencia.Marca;

@SuppressWarnings("serial")
public class ClienteAction extends ActionSupport implements SessionAware {

    ClienteServicio clieSer;
    private String resultado;
    private Cliente cliente;
    private List<Cliente> lstClie;
    private int edit;
    private int inicio;
    private String jsonPerfil;
    private int op;
    private Map<String, Object> sesion;
    private String passwordActual;
    private String estado = "error";
    private String mensajeError;
    private List<Producto> lstProducto;
    private List<Categoria> lstCategoria;
    private List<Marca> lstMarca;
    private String codigo;

    public String getMensajeError() {
        return mensajeError;
    }

    public List<Producto> getLstProducto() {
        return lstProducto;
    }

    public void setLstProducto(List<Producto> lstProducto) {
        this.lstProducto = lstProducto;
    }

    public List<Categoria> getLstCategoria() {
        return lstCategoria;
    }

    public void setLstCategoria(List<Categoria> lstCategoria) {
        this.lstCategoria = lstCategoria;
    }

    public List<Marca> getLstMarca() {
        return lstMarca;
    }

    public void setLstMarca(List<Marca> lstMarca) {
        this.lstMarca = lstMarca;
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

    public void setInicio(int inicio) {
        this.inicio = inicio;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
            lstProducto = new ProductoServicio().listar();
            lstCategoria = new CategoriaServicio().listar();
            //lstSubCategoria = new CategoriaServicio().listarsubCategoria(idCate);
            lstMarca = new MarcaServicio().listar();
            Cliente clie = null;
            for (Cliente c : lstClie) {
            String passDesencriptado= Desencriptar(c.getPassword());
                if (c.getEmail().equals(cliente.getEmail()) && passDesencriptado.equals(cliente.getPassword())) {
                    clie=c;
                    enviarSession(c);
                    addActionMessage("");
                    sesion.put("seccion", 1);
                    estado="ok";
                }
            }
            if(clie==null){
                    addFieldError("mensajeError","Usuario o contraseña incorrecta");
                    sesion.put("seccion", 0);
                    estado="incorrecto";
            }     
        } catch (Exception e) {
            resultado = "Error en: ingresoClie :: " + e.getMessage();
        }
        return estado;
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
        }catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "misDatos", results = {
        @Result(name = "ok", location = "/perfil.jsp")
    })
    public String misDatos() {
       return "ok";
//    public String buscarClie() {
//
//        try {
//
//            cliente = new ClienteServicio().buscar(String.valueOf(cliente.getIdCliente()));
//
//            return "ok";
//        } catch (Exception e) {
//            resultado = "Error en: buscarClie :: " + e.getMessage();
//            return "error";
//        }
    }

    @Action(value = "buscarCliePerfil", results = {})
    public void buscarCliePerfil() {
        try {
//<<<<<<< HEAD
//            String id=(String)sesion.get("id");
//            String pass=(String)sesion.get("pass");
//            cliente.setIdCliente(Integer.parseInt(id));
//            cliente.setPassword(pass);
//            new ClienteServicio().actualizar(cliente);
//            cliente = new ClienteServicio().buscar(id);
//            op = 2;
//            sesion.put("dni", cliente.getDni());
//            sesion.put("nombres", cliente.getNombres());
//            sesion.put("apellidos", cliente.getApellidos());
//            sesion.put("cel", cliente.getNumCelular());
//            sesion.put("dir", cliente.getDireccion());
//            sesion.put("email", cliente.getEmail());
//            sesion.put("seccion", 1);
//            return "ok";
//        } catch (Exception e) {
//            resultado = "Error en: actualizarClie :: " + e.getMessage();
//            return "error";
//=======
            HttpServletResponse response = ServletActionContext.getResponse();
            HttpServletRequest request = ServletActionContext.getRequest();
            PrintWriter out = response.getWriter();
            int idCliente = Integer.parseInt(request.getParameter("idClie"));
            cliente = new ClienteServicio().buscar(String.valueOf(idCliente));
            JSONObject json = new JSONObject();
            json.put("idClie", cliente.getIdCliente());
            json.put("nombres", cliente.getNombres());
            json.put("apellidos", cliente.getApellidos());
            json.put("dni", cliente.getDni());
            json.put("numCelular", cliente.getNumCelular());
            json.put("email", cliente.getEmail());
            json.put("direccion", cliente.getDireccion());
            json.put("password", cliente.getPassword());
            out.print(json);
        } catch (IOException | NumberFormatException e) {
            resultado = "Error en: buscarCliePerfil :: " + e.getMessage();
        }
    }

    @Action(value = "actualizarClie", results = {})
    public void actualizarClie() {
        try {
            HttpServletResponse response = ServletActionContext.getResponse();
            HttpServletRequest request = ServletActionContext.getRequest();
            PrintWriter out = response.getWriter();

            int idclie = Integer.parseInt(request.getParameter("idClie"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String dni = request.getParameter("dni");
            String numCelular = request.getParameter("numCelular");
            String direccion = request.getParameter("direccion");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            Cliente clie = new Cliente();
            clie.setIdCliente(idclie);
            clie.setNombres(nombre);
            clie.setApellidos(apellido);
            clie.setDni(dni);
            clie.setNumCelular(numCelular);
            clie.setDireccion(direccion);
            clie.setEmail(email);
            clie.setPassword(password);
            new ClienteServicio().actualizar(clie);
            sesion.put("NombreClienteCompleto", cliente.getNombres() + " " + cliente.getApellidos());
            inicio = 1;
            out.print("Actualizado");
        } catch (Exception e) {
            resultado = "Error en: eliminarMarca :: " + e.getMessage();
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
            Cliente clie = null;
                for (Cliente c : lstClie) {
                if (c.getEmail().equals(cliente.getEmail())) {
                    clie=c;
                    enviarSession(clie);
                    addActionMessage("¡Gracias por registrarte!");
                    sesion.put("seccion", 1);
                    estado="ok";
                }
            }
            if(clie==null){
                addFieldError("mensajeError","Falló al registrarse");
                    sesion.put("seccion", 0);
                    estado="incorrecto";
            }
            }
        } catch (Exception e) {
            resultado = "Error en: registrarse :: " + e.getMessage();
        }
        
        return estado;
    }
    
    public void enviarSession(Cliente cliente) {
        
            sesion.put("id", cliente.getIdCliente());
            sesion.put("dni", cliente.getDni());
            sesion.put("nombres", cliente.getNombres());
            sesion.put("apellidos", cliente.getApellidos());
            sesion.put("cel", cliente.getNumCelular());
            sesion.put("dir", cliente.getDireccion());
            sesion.put("email", cliente.getEmail());
            sesion.put("pass", cliente.getPassword());
    }
    
     @Action(value="devolverPagPass",results= {
	@Result(name="ok",location="/seguridad/cambiar-password-in.jsp")
	})
    public String devolverPag(){
        return "ok";
    }
    
    @Action(value="cambiarPasswordClieIn",results= {
			@Result(name="ok",location="/index.jsp"),
			@Result(name="error",location="/error.jsp"),
                        @Result(name="incorrecto",location="/seguridad/incorrecto.jsp")
	})
	public String cambiarPasswordClieIn() {
		try {
                        String passSession=Desencriptar((String)sesion.get("pass"));
                        String passForm=passwordActual;
                        if(passSession.equals(passForm)){
                        clieSer=new ClienteServicio();
			cliente = recibirSession();
			estado=clieSer.actualizar(cliente);
                            if(estado.equals("ok")){
                                cerrarSesionClie();
                            }
                        }else{
                        addActionError("La Contraseña Actual no es la correcta");
                        estado="incorrecto";
                        }
		} catch (Exception e) {
			resultado="Error en: cambiarPasswordClieIn :: "+e.getMessage();
			
		}
                return estado;
	}
        
        public Cliente recibirSession() {
            int id=(Integer)sesion.get("id");
            String dni=(String)sesion.get("dni");
            String nombres=(String)sesion.get("nombres");
            String apellidos=(String)sesion.get("apellidos");
            String dir=(String)sesion.get("dir");
            String cel=(String)sesion.get("cel");
            String email=(String)sesion.get("email");
            String passEncryp = Encriptar(cliente.getPassword());
            cliente.setIdCliente(id);
            cliente.setDni(dni);
            cliente.setNombres(nombres);
            cliente.setApellidos(apellidos);
            cliente.setEmail(email);
            cliente.setDireccion(dir);
            cliente.setNumCelular(cel);
            cliente.setPassword(passEncryp);
        return cliente;
        }
        
        @Action(value="cerrarSesionClie",results= {
			@Result(name="ok",location="/index.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String cerrarSesionClie() {
		try {
                        sesion.clear();
                        sesion.put("seccion", 0);
			return "ok";
		} catch (Exception e) {
			resultado="Error en: cerrarSesionCliente :: "+e.getMessage();
			return estado;
		}
	}
        
        @Action(value="restablecerPasswordClie",results= {
        @Result(name="ok",location="/seguridad/validar-codigo.jsp"),
        @Result(name="incorrecto",location="/seguridad/incorrecto.jsp"),
        @Result(name="error",location="/seguridad/incorrecto.jsp")}
        )
        public String restablecerPasswordClie() throws MessagingException, IOException{
            
            try {
            if (cliente.getEmail().isEmpty()) {
                addActionError("Debe ingresar el campo Email");
                estado="incorrecto";
            }else{ 
            clieSer=new ClienteServicio();
            String email=cliente.getEmail();
                System.out.println(email);
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
            String correoReceptor = email;
            String asunto = "W&V - Restablecer Contraseña";
            //genera un numero entre 1 y 5 y lo guarda en la variable codigo
            int cod = (int)(100000 * Math.random());
            cliente.setCodigoGenerado(String.valueOf(cod));
            clieSer.actualizar(cliente);
            String mensaje = "Hola "+cliente.getNombres()+".<br>Tu código de restablecimiento es: "+cod;
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje, "ISO-8859-1", "html");
            Transport t = session.getTransport("smtp");
            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();
            enviarSession(cliente);
            return "ok";
            }else{
            addActionError("El email no existe en el sistema");
            estado="incorrecto";
            }
           }
            } catch (MessagingException e) {
            resultado = "Error en: restablecerPasswordClie :: " + e.getMessage();
        }
            return estado;
        }
       
        
        @Action(value = "validarCodigoClie", results = {
        @Result(name="ok",location="/seguridad/cambiar-password-out.jsp"),
        @Result(name="incorrecto",location="/seguridad/incorrecto.jsp"),
        @Result(name="error",location="/seguridad/incorrecto.jsp")
    })
    public String validarCodigoClie() {
        try {
            if (codigo.isEmpty()) {
                addActionError("Debe ingresar el código");
                estado = "incorrecto";
            } else {
                clieSer = new ClienteServicio();
                int id =(Integer) sesion.get("id");
                cliente=new Cliente();
                cliente.setIdCliente(id);
                cliente.setCodigoGenerado(codigo);
                estado = clieSer.comparar(cliente);
                if (estado != null) {
                    return estado;
                } else {
                    addActionError("El código es incorrecto");
                    estado = "incorrecto";
                }
            }
        } catch (Exception e) {
            resultado = "Error en: validarCodigoClie :: " + e.getMessage();
            return estado;
        }
        return estado;
    }

    @Action(value = "cambiarPasswordOutClie", results = {
        @Result(name = "ok", location = "/index.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
        ,
                        @Result(name = "incorrecto", location = "/seguridad/incorrecto.jsp")
    })
    public String cambiarPasswordOutClie() {
        try {
            clieSer = new ClienteServicio();
            cliente = recibirSession();
            estado = clieSer.actualizar(cliente);
            addActionMessage("¡Constraseña restablecida!");
            return estado;
        } catch (Exception e) {
            resultado = "Error en: cambiarPasswordOutClie :: " + e.getMessage();
            return estado;
        }
    }
}
