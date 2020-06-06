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
import wyv.servicios.MarcaServicio;
import wyv.persistencia.Marca;
/**
 *
 * @author Data
 */
@SuppressWarnings("serial")
public class MarcaAction extends ActionSupport{
    
    
    
     MarcaServicio marSer;
    private String resultado;
    private Marca marca;
    private List<Marca> lstMarca;
    private int edit;

   
    
    public String getResultado() {
        return resultado;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Marca> getLstMarca() {
        return lstMarca;
    }




    public int getEdit() {
        return edit;
    }

    public void setMarSer(MarcaServicio marSer) {
        this.marSer = marSer;
    }

    


   @Action(value = "listarMarca", results = {
        @Result(name = "ok", location = "/admin/principal/marca.jsp"),
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String listarMarca() {
        try {
            marSer=new MarcaServicio();
            lstMarca = marSer.listar();
          
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarMarca :: " + e.getMessage();
            return "error";
        }
    }
    
    @Action(value="registrarMarca",results= {
			@Result(name="ok",location="/admin/principal/marca.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String registrarMarca() {
		try {
			new MarcaServicio().registrar(marca);
			lstMarca=new MarcaServicio().listar();
			marca=new Marca();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: registrarCate :: "+e.getMessage();
			return "error";
		}
	}
        
        
        @Action(value="editarMarca",results= {
			@Result(name="ok",location="/admin/principal/marca.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String editarCate() {
		
		try {
			marca =new MarcaServicio().buscar(String.valueOf(marca.getIdMarca()));
			lstMarca=new MarcaServicio().listar();
                        edit=1;
			return "ok";
		} catch (Exception e) {
			resultado="Error en: editarAdmin :: "+e.getMessage();
			return "error";
		}
	}
        
        
        @Action(value="actualizarMarca",results= {
			@Result(name="ok",location="/admin/principal/marca.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String actualizarMarca() {
		
		try {
			new MarcaServicio().actualizar(marca);
			lstMarca=new MarcaServicio().listar();
                        marca=new Marca();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: eliminarMarca :: "+e.getMessage();
			return "error";
		}
	}

   @Action(value="eliminarMarca",results= {
			@Result(name="ok",location="/admin/principal/marca.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String eliminarMarca() {
		
		try {
			new MarcaServicio().eliminar(String.valueOf(marca.getIdMarca()));
			lstMarca=new MarcaServicio().listar();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: eliminarMarca :: "+e.getMessage();
			return "error";
		}
	}
    
}
