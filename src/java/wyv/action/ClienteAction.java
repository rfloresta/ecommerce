/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import wyv.persistencia.Cliente;
import wyv.servicios.ClienteServicio;


/**
 *
 * @author Data
 */
@SuppressWarnings("serial")
public class ClienteAction extends ActionSupport {
    
    ClienteServicio clieSer;
    private String resultado;
    private Cliente cliente;
    private List<Cliente> lstClie;
    private int edit;

    public String getResultado() {
        return resultado;
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

    public void setClieSer(ClienteServicio clieSer) {
        this.clieSer = clieSer;
    }
    
     @Action(value = "listarClie", results = {
        @Result(name = "ok", location = "/admin/principal/cliente.jsp"),
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String listarClie() {
        try {
            clieSer=new ClienteServicio();
            lstClie = clieSer.listar();
          
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            return "error";
        }
    }
    
    @Action(value="registrarClie",results= {
			@Result(name="ok",location="/admin/principal/cliente.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String registrarClie() {
		try {
			new ClienteServicio().registrar(cliente);
			lstClie=new ClienteServicio().listar();
			cliente=new Cliente();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: registrarCate :: "+e.getMessage();
			return "error";
		}
	}
        
        
        @Action(value="editarClie",results= {
			@Result(name="ok",location="/admin/principal/cliente.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String editarClie() {
		
		try {
			cliente =new ClienteServicio().buscar(String.valueOf(cliente.getIdCliente()));
			lstClie=new ClienteServicio().listar();
                        edit=1;
			return "ok";
		} catch (Exception e) {
			resultado="Error en: editarAdmin :: "+e.getMessage();
			return "error";
		}
	}
        
        
        @Action(value="actualizarClie",results= {
			@Result(name="ok",location="/admin/principal/cliente.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String actualizarClie() {
		
		try {
			new ClienteServicio().actualizar(cliente);
			lstClie=new ClienteServicio().listar();
                        cliente=new Cliente();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: eliminarMarca :: "+e.getMessage();
			return "error";
		}
	}

   @Action(value="eliminarClie",results= {
			@Result(name="ok",location="/admin/principal/cliente.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String eliminarClie() {
		
		try {
			new ClienteServicio().eliminar(String.valueOf(cliente.getIdCliente()));
			lstClie=new ClienteServicio().listar();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: eliminarMarca :: "+e.getMessage();
			return "error";
		}
	}
    
}
