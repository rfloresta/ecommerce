package wyv.action;

import com.google.gson.Gson;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static wyv.action.Encriptacion.Desencriptar;
import wyv.servicios.AdministradorServicio;
import wyv.persistencia.Administrador;
import static wyv.action.Encriptacion.Encriptar;

@Component("AdministradorAction")
@Scope(value = "prototype")
public class AdministradorAction extends ActionSupport implements SessionAware {

    @Autowired
    AdministradorServicio admSer;
    private String resultado;
    private String estado = "error";
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

    private String passwordActual;
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

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

    public String getPasswordActual() {
        return passwordActual;
    }

    public void setPasswordActual(String passwordActual) {
        this.passwordActual = passwordActual;
    }

    @Action(value = "ingresoAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/inicio.jsp")
        ,
        @Result(name = "incorrecto", location = "/admin/seguridad/login.jsp")
        ,
	@Result(name = "error", location = "/admin/error.jsp")})
    public String ingresoAdmin(/*Administrador admin*/) {
        try {
            admSer = new AdministradorServicio();
            admin = admSer.validar(admin);
            if (admin != null) {
                List<Map<String, String>> lista = admSer.ventaMes();
                List<String> listaMesP = new ArrayList();
                List<String> listaTotalP = new ArrayList();
                // se separa las listas
                for (int i = 0; i < lista.size(); i++) {
                    listaMesP.add(lista.get(i).get("Fecha"));
                    listaTotalP.add(lista.get(i).get("Total"));
                }
                // Se separa las listas para mandarlo en formato JSON
                listaMes = listaMesP;
                listaTotal = listaTotalP;

                // Se envia al formato Json
                jsonMes = new Gson().toJson(listaMes);
                jsonTotal = new Gson().toJson(listaTotal);

                contarAdministrador = admSer.contar();
                contarCliente = admSer.ContarCliente();
                contarPedidos = admSer.ContarPedido();
                enviarSession(admin);
                estado = "ok";
            } else {
                addActionError("Usuario y/o Contraseña incorrectos");
                estado = "incorrecto";
            }
        } catch (Exception e) {
            resultado = "Error en: ingresoAdmin :: " + e.getMessage();
        }
        return estado;
    }

    public void enviarSession(Administrador admin) {
        sesion.put("nombres", admin.getNombres());
        sesion.put("apellidos", admin.getApellidos());
        sesion.put("dni", admin.getDni());
        sesion.put("email", admin.getEmail());
        sesion.put("privilegio", admin.getPrivilegio());
        sesion.put("pass", admin.getPassword());
        sesion.put("cod", admin.getCodigoGenerado());
    }

    @Action(value = "listarAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/administrador.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp"),})
    public String listarAdmin() {
        try {
            lstAdmin = admSer.listar();
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarAdmin :: " + e.getMessage();
            return "error";
        }
    }

    //HACER ASÍ EL MANTENIMIENTO, CON LA VARIABLE "estado"
    @Action(value = "registrarAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/administrador.jsp")
        ,
			@Result(name = "error", location = "/admin/error.jsp")
        ,
                        @Result(name = "input", location = "/admin/principal/administrador.jsp")
    })
    public String registrarAdmin() {
        try {
            String passEncryp = Encriptar(admin.getPassword());
            admin.setPassword(passEncryp);
            estado = admSer.registrar(admin);
            lstAdmin = admSer.listar();
            admin = new Administrador();
            return estado;
        } catch (Exception e) {
            resultado = "Error en: registrarAdmin :: " + e.getMessage();
            return estado;
        }
    }

    @Action(value = "editarAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/administrador.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String editarAdmin() {

        try {
            admin = admSer.buscar(admin.getDni());
            lstAdmin = admSer.listar();
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
			@Result(name = "error", location = "/admin/error.jsp")
    })
    public String actualizarAdmin() {

        try {
            estado = admSer.actualizar(admin);
            lstAdmin = admSer.listar();
            admin = new Administrador();
            return estado;
        } catch (Exception e) {
            resultado = "Error en: eliminarMarca :: " + e.getMessage();
            return estado;
        }
    }

    @Action(value = "eliminarAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/administrador.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String eliminarAdmin() {

        try {
            estado = admSer.eliminar(admin.getDni());
            lstAdmin = admSer.listar();
            return estado;
        } catch (Exception e) {
            resultado = "Error en: eliminarMarca :: " + e.getMessage();
            return estado;
        }
    }

    @Action(value = "cargarPerfilAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/perfil.jsp")
        ,
			@Result(name = "error", location = "/admin/error.jsp")
    })
    public String cargarDatosAdmin() {

        try {
            String dni = (String) sesion.get("dni");
            admin = admSer.buscar(dni);
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: cargarPerfilAdmin :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "actualizarDatosAdmin", results = {
        @Result(name = "ok", location = "/admin/principal/perfil.jsp")
        ,
			@Result(name = "error", location = "/admin/error.jsp")
    })
    public String actualizarDatosAdmin() {

        try {
            estado = admSer.actualizar(admin);
            String dni = (String) sesion.get("dni");
            admin = admSer.buscar(dni);
            return estado;
        } catch (Exception e) {
            resultado = "Error en: actualizarDatosAdmin :: " + e.getMessage();
            return estado;
        }
    }

    @Action(value = "cambiarPasswordInAdmin", results = {
        @Result(name = "ok", location = "/admin/seguridad/login.jsp")
        ,
			@Result(name = "error", location = "/admin/error.jsp")
        ,
                        @Result(name = "incorrecto", location = "/admin/seguridad/cambiar-password-in.jsp")
    })
    public String cambiarPasswordInAdmin() {
        try {
            Administrador adminSession = recibirSession();
            if (adminSession.getPassword().equals(passwordActual)) {//validar password de la sesion con el password que viene del form
                adminSession.setPassword(Encriptar(admin.getPassword()));//enviar el password nuevo
                estado = admSer.actualizar(adminSession);
                return estado;
            }
            addActionError("La Contraseña Actual no es la correcta");
            return estado = "incorrecto";
        } catch (Exception e) {
            resultado = "Error en: cambiarPasswordInAdmin :: " + e.getMessage();
            return estado;
        }
    }

    public Administrador recibirSession() throws Exception {
        String dni = (String) sesion.get("dni");
        String apellidos = (String) sesion.get("apellidos");
        String nombres = (String) sesion.get("nombres");
        String email = (String) sesion.get("email");
        String privilegio = sesion.get("privilegio").toString();
        String cod = (String) sesion.get("cod");
        String passSession = (String) sesion.get("pass");
        admin.setDni(dni);
        admin.setNombres(nombres);
        admin.setApellidos(apellidos);
        admin.setEmail(email);
        admin.setPrivilegio(privilegio.charAt(0));
        admin.setPassword(Desencriptar(passSession));
        admin.setCodigoGenerado(cod);
        return admin;
    }

    @Action(value = "restablecerPasswordAdmin", results = {
        @Result(name = "ok", location = "/admin/seguridad/validar-codigo.jsp")
        ,
			@Result(name = "error", location = "/admin/error.jsp")
        ,
                        @Result(name = "incorrecto", location = "/admin/seguridad/restablecer-password.jsp")
    })
    public String restablecerPasswordAdmin() {
        try {
            if (admin.getEmail().isEmpty()) {
                addActionError("Debe ingresar el campo Email");
                return estado = "incorrecto";
            } else {
                admSer = new AdministradorServicio();
                String email = admin.getEmail();
                admin = admSer.validarEmail(email);
                if (admin != null) {

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
                    //genera un numero entre 1 y 5 y lo guarda en la variable cod
                    int cod = (int) (100000 * Math.random());

                    admin.setCodigoGenerado(String.valueOf(cod));
                    admSer.actualizar(admin);

                    String mensaje = "Hola " + admin.getNombres() + ".<br>Tu código de restablecimiento es: " + cod;
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(correoRemitente));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
                    message.setSubject(asunto);
                    message.setText(mensaje, "ISO-8859-1", "html");
                    Transport t = session.getTransport("smtp");
                    t.connect(correoRemitente, passwordRemitente);
                    t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
                    t.close();
                    enviarSession(admin);
                    estado = "ok";
                } else {
                    addActionError("El email no existe en el sistema");
                    estado = "incorrecto";
                }
            }
        } catch (MessagingException e) {
            resultado = "Error en: restablecerPasswordAdmin :: " + e.getMessage();
            return estado;
        }
        return estado;
    }

    @Action(value = "validarCodigoAdmin", results = {
        @Result(name = "ok", location = "/admin/seguridad/cambiar-password-out.jsp")
        ,
			@Result(name = "error", location = "/admin/error.jsp")
        ,
                        @Result(name = "incorrecto", location = "/admin/seguridad/validar-codigo.jsp")
    })
    public String validarCodigoAdmin(/*String codigo, String dni*/) {
        try {
            if (codigo.isEmpty()) {
                addActionError("Debe ingresar el código");
                return estado = "incorrecto";
            } else {
                admSer = new AdministradorServicio();
                String dni = (String) sesion.get("dni");
                admin = new Administrador();
                admin.setDni(dni);
                admin.setCodigoGenerado(codigo);
                estado = admSer.comparar(admin);
                if (estado.equals("incorrecto")) {
                    addActionError("El código es incorrecto");
                }
            }
        } catch (Exception e) {
            resultado = "Error en: validarCodigoAdmin :: " + e.getMessage();
            return estado;
        }
        return estado;
    }

    @Action(value = "cambiarPasswordOutAdmin", results = {
        @Result(name = "ok", location = "/admin/seguridad/login.jsp")
        ,
			@Result(name = "error", location = "/admin/error.jsp")
        ,
                        @Result(name = "incorrecto", location = "/admin/seguridad/cambiar-password-out.jsp")
    })
    public String cambiarPasswordOutAdmin() {
        try {
            if (admin.getPassword().isEmpty()) {
                addActionError("¡Debe completar el campo password!");
                estado="incorrecto";
            }else{
                Administrador adminSession = recibirSession();
                adminSession.setPassword(Encriptar(admin.getPassword()));//enviar el password nuevo
                estado = admSer.actualizar(adminSession);
                addActionMessage("¡Constraseña restablecida!");
                
            }
        } catch (Exception e) {
            resultado = "Error en: cambiarPasswordOutAdmin :: " + e.getMessage();
        }
        return estado;
    }

    @Action(value = "cerrarSesionAdmin", results = {
        @Result(name = "ok", location = "/admin/seguridad/login.jsp")
        ,
	@Result(name = "error", location = "/admin/error.jsp")
    })
    public String cerrarSesionAdmin() {
        try {
            sesion.clear();
            estado = "ok";
        } catch (Exception e) {
            resultado = "Error en: cerrarSesionAdmin :: " + e.getMessage();
        }
        return estado;
    }
}
