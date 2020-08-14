package wyv.action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static wyv.action.Encriptacion.Desencriptar;
import static wyv.action.Encriptacion.Encriptar;
import wyv.persistencia.Cliente;
import wyv.servicios.ClienteServicio;
import wyv.persistencia.Producto;
import wyv.persistencia.Categoria;
import wyv.persistencia.Marca;

@Component("ClienteAction")
@Scope(value = "prototype")
public class ClienteAction extends ActionSupport implements SessionAware {

    @Autowired
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
    public String ingresoCliente(/*Cliente cliente*/) {
        try {
            lstClie = clieSer.listar();
            for (Cliente c : lstClie) {
                String passDesencriptado = Desencriptar(c.getPassword());
                if (c.getEmail().equals(cliente.getEmail()) && passDesencriptado.equals(cliente.getPassword())) {
                    enviarSession(c);
                    addActionMessage("");
                    sesion.put("seccion", 1);
                    return "ok";
                }
            }
            addFieldError("mensajeError", "Usuario o contraseña incorrecta");
            sesion.put("seccion", 0);
            estado = "incorrecto";
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
            lstClie = clieSer.listar();
            estado = "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
        }
        return estado;
    }

    @Action(value = "misDatos", results = {
        @Result(name = "ok", location = "/perfil.jsp")
    })
    public String misDatos() {
        return "ok";
    }

    @Action(value = "registrarse", results = {
        @Result(name = "ok", location = "/catalogo.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String registrarse(Cliente cliente) {
        try {
            Cliente clie = clieSer.validarEmail(cliente.getEmail());
            if (clie == null) {
                String passEncryp = Encriptar(cliente.getPassword());
                cliente.setPassword(passEncryp);
                estado = clieSer.registrar(cliente);
                cliente = clieSer.validarEmail(cliente.getEmail());
//                enviarSession(cliente);
//                sesion.put("seccion", 1);
                addActionMessage("¡Gracias por registrarte!");
            } else {
                addActionError("El Email ya se encuentra registrado");
//                sesion.put("seccion", 0);
                estado = "incorrecto";
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

    @Action(value = "devolverPagPass", results = {
        @Result(name = "ok", location = "/seguridad/cambiar-password-in.jsp")
    })
    public String devolverPag() {
        return "ok";
    }

    @Action(value = "cambiarPasswordClieIn", results = {
        @Result(name = "ok", location = "/index.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
        ,
                        @Result(name = "incorrecto", location = "/seguridad/incorrecto.jsp")
    })
    public String cambiarPasswordClieIn(/*String passwordSession, String passwordActual, Cliente cliente*/) {
        try {
            String passwordSession = Desencriptar((String) sesion.get("pass"));
            if (passwordSession.equals(passwordActual)) {
                cliente = recibirSession();
                estado = clieSer.actualizar(cliente);
                cerrarSesionClie();
            } else {
                addActionError("La Contraseña Actual no es la correcta");
                estado = "incorrecto";
            }
        } catch (Exception e) {
            resultado = "Error en: cambiarPasswordClieIn :: " + e.getMessage();
        }
        return estado;
    }

    public Cliente recibirSession() {
        int id = (Integer) sesion.get("id");
        String dni = (String) sesion.get("dni");
        String nombres = (String) sesion.get("nombres");
        String apellidos = (String) sesion.get("apellidos");
        String dir = (String) sesion.get("dir");
        String cel = (String) sesion.get("cel");
        String email = (String) sesion.get("email");
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

    @Action(value = "cerrarSesionClie", results = {
        @Result(name = "ok", location = "/index.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String cerrarSesionClie() {
        try {
            sesion.clear();
            sesion.put("seccion", 0);
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: cerrarSesionCliente :: " + e.getMessage();
            return estado;
        }
    }

    @Action(value = "restablecerPasswordClie", results = {
        @Result(name = "ok", location = "/seguridad/validar-codigo.jsp")
        ,
        @Result(name = "incorrecto", location = "/seguridad/incorrecto.jsp")
        ,
        @Result(name = "error", location = "/seguridad/incorrecto.jsp")}
    )
    public String restablecerPasswordClie(/*Cliente cliente*/) throws MessagingException, IOException {
        try {
            if (cliente.getEmail().isEmpty()) {
                addActionError("Debe ingresar el campo Email");
                estado = "incorrecto";
            } else {
                String email = cliente.getEmail();
                cliente = clieSer.validarEmail(email);
                if (cliente != null) {
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
                    int cod = (int) (100000 * Math.random());
                    cliente.setCodigoGenerado(String.valueOf(cod));
                    estado = clieSer.actualizar(cliente);
                    String mensaje = "Hola " + cliente.getNombres() + ".<br>Tu código de restablecimiento es: " + cod;
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
                } else {
                    addActionError("El email no existe en el sistema");
                    estado = "incorrecto";
                }
            }
        } catch (MessagingException e) {
            resultado = "Error en: restablecerPasswordClie :: " + e.getMessage();
        }
        return estado;
    }

    @Action(value = "validarCodigoClie", results = {
        @Result(name = "ok", location = "/seguridad/cambiar-password-out.jsp")
        ,
        @Result(name = "incorrecto", location = "/seguridad/incorrecto.jsp")
        ,
        @Result(name = "error", location = "/seguridad/incorrecto.jsp")
    })
    public String validarCodigoClie(/*String codigo, int id*/) {
        try {
            if (codigo.isEmpty()) {
                addActionError("Debe ingresar el código");
                estado = "incorrecto";
            } else {
                int id = (Integer) sesion.get("id");
                cliente = new Cliente();
                cliente.setIdCliente(id);
                cliente.setCodigoGenerado(codigo);
                estado = clieSer.comparar(cliente);
                if (estado.equals("incorrecto")) {
                    addActionError("El código es incorrecto");
                }
            }
        } catch (Exception e) {
            resultado = "Error en: validarCodigoClie :: " + e.getMessage();
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
    public String cambiarPasswordOutClie(/*Cliente cliente*/) {
        try {
            cliente = recibirSession();
            if(cliente.getPassword().isEmpty()){
                addActionError("Debe completar el password");
                estado="incorrecto";
            }else{
                estado = clieSer.actualizar(cliente);
                addActionMessage("¡Constraseña restablecida!");
            }
        } catch (Exception e) {
            resultado = "Error en: cambiarPasswordOutClie :: " + e.getMessage();
        }
        return estado;
    }
}
