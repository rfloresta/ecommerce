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
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import wyv.persistencia.Cliente;
import wyv.servicios.ClienteServicio;

/**
 *
 * @author Data
 */
@SuppressWarnings("serial")
public class ClienteAction extends ActionSupport implements SessionAware {

    ClienteServicio clieSer;
    private String resultado;
    private Cliente cliente;
    private Cliente clienteLog;
    private List<Cliente> lstClie;
    private int edit;
    private int inicio;
    private String jsonPerfil;
    private int op;
    private Map<String, Object> sesion;

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

    public Cliente getClienteLog() {
        return clienteLog;
    }

    public void setClienteLog(Cliente clienteLog) {
        this.clienteLog = clienteLog;
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

    @Override
    public void setSession(Map<String, Object> map) {
        this.sesion = map;
    }

    @Action(value = "ingresoCliente", results = {
        @Result(name = "ok", location = "/principal.jsp")
        ,
        @Result(name = "incorrecto", location = "/principal.jsp")
        ,
	@Result(name = "error", location = "/error.jsp"),})
    public String ingresoCliente() {
        try {
            String nombreClie = "";
            String apellidoClie = "";
            int idCliente = 0;
            clieSer = new ClienteServicio();
            lstClie = clieSer.listar();
            for (Cliente c : lstClie) {
                if (c.getEmail().equals(clienteLog.getEmail()) && c.getPassword().equals(clienteLog.getPassword())) {
                    nombreClie = c.getNombres();
                    apellidoClie = c.getApellidos();
                    idCliente = c.getIdCliente();

                    inicio = 1;
                } else {
                    addActionError("Email o password incorectos");
                    inicio = 0;
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

    @Action(value = "buscarClie", results = {
        @Result(name = "ok", location = "/clientePerfil.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String buscarClie() {

        try {
            switch (op) {
                case 1: {
                    cliente = new ClienteServicio().buscar(String.valueOf(cliente.getIdCliente()));
                    break;
                }
                case 2: {
                    cliente = new ClienteServicio().buscar(String.valueOf(cliente.getIdCliente()));
                    op = 2;
                    break;
                }
            }

            return "ok";
        } catch (Exception e) {
            resultado = "Error en: editarAdmin :: " + e.getMessage();
            return "error";
        }
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
        @Result(name = "ok", location = "/clientePerfil.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String actualizarClie() {

        try {
            new ClienteServicio().actualizar(cliente);
            cliente = new ClienteServicio().buscar(String.valueOf(cliente.getIdCliente()));
            op = 2;
            sesion.put("NombreClienteCompleto", cliente.getNombres() + " " + cliente.getApellidos());
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: eliminarMarca :: " + e.getMessage();
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

}
