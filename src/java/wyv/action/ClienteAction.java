/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.action;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.opensymphony.xwork2.ActionSupport;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.json.simple.JSONObject;
import wyv.persistencia.Cliente;
import wyv.servicios.CategoriaServicio;
import wyv.servicios.ClienteServicio;
import wyv.servicios.MarcaServicio;
import wyv.servicios.ProductoServicio;
import wyv.persistencia.Producto;
import wyv.persistencia.Categoria;
import wyv.persistencia.Marca;

/**
 *
 * @author Data
 */

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
    private String estado = "error";
    private String mensajeError;
    private List<Producto> lstProducto;
    private List<Categoria> lstCategoria;
    private List<Marca> lstMarca;

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
            lstProducto = new ProductoServicio().listar();
            lstCategoria = new CategoriaServicio().listar();
            //lstSubCategoria = new CategoriaServicio().listarsubCategoria(idCate);
            lstMarca = new MarcaServicio().listar();
            String nombreClie = "";
            String apellidoClie = "";
            int idCliente = 0;

            for (Cliente c : lstClie) {
                if (c.getEmail().equals(cliente.getEmail()) && c.getPassword().equals(cliente.getPassword())) {
                    nombreClie = c.getNombres();
                    apellidoClie = c.getApellidos();
                    idCliente = c.getIdCliente();
                    sesion.put("seccion", 1);
                    mensajeError = "";

                } else {
                    mensajeError = "Usuario o contraseña incorrecta";
                    sesion.put("seccion", 0);
                }
            }
            sesion.put("NombreClienteCompleto", nombreClie + " " + apellidoClie);
            sesion.put("idClie", idCliente);
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

    @Action(value = "buscarClie", results = {
        @Result(name = "ok", location = "/perfil.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String buscarClie() {

        try {

            cliente = new ClienteServicio().buscar(String.valueOf(cliente.getIdCliente()));

            return "ok";
        } catch (Exception e) {
            resultado = "Error en: buscarClie :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "buscarCliePerfil", results = {})
    public void buscarCliePerfil() {

        try {

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

        } catch (Exception e) {
            resultado = "Error en: editarAdmin :: " + e.getMessage();

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
            clieSer = new ClienteServicio();
            estado = clieSer.registrar(cliente);
            lstClie = clieSer.listar();
            String nombreClie = "";
            String apellidoClie = "";
            int idCliente = 0;
            for (Cliente c : lstClie) {
                if (c.getEmail().equals(cliente.getEmail())) {
                    nombreClie = c.getNombres();
                    apellidoClie = c.getApellidos();
                    idCliente = c.getIdCliente();
                    sesion.put("seccion", 1);
                    mensajeError = "";
                } else {
                    mensajeError = "Fallo al registrarse";
                    sesion.put("seccion", 0);
                }
            }

            sesion.put("NombreClienteCompleto", nombreClie + " " + apellidoClie);
            sesion.put("idClie", idCliente);
            resultado = "¡Gracias por registrarte!";
            return estado;
        } catch (Exception e) {
            resultado = "Error en: registrarCate :: " + e.getMessage();
            return estado;
        }
    }

}
