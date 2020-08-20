package wyv.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import wyv.servicios.MarcaServicio;
import wyv.persistencia.Marca;

@Component("MarcaAction")
@Scope(value="prototype")
public class MarcaAction extends ActionSupport {

    @Autowired
    MarcaServicio marSer;
    private String resultado;
    private String estado="error";
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

    @Action(value = "listarMarca", results = {
        @Result(name = "ok", location = "/admin/principal/marca.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String listarMarca() {
        try {
            lstMarca = marSer.listar();
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarMarca :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "registrarMarca", results = {
        @Result(name = "ok", location = "/admin/principal/marca.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String registrarMarca() {
        try {
            estado=marSer.registrar(marca);
            lstMarca = marSer.listar();
            marca = new Marca();
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: registrarCate :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "editarMarca", results = {
        @Result(name = "ok", location = "/admin/principal/marca.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String editarMarca() {
        try {
            marca = marSer.buscar(String.valueOf(marca.getIdMarca()));
            lstMarca = marSer.listar();
            edit = 1;
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: editarAdmin :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "actualizarMarca", results = {
        @Result(name = "ok", location = "/admin/principal/marca.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String actualizarMarca() {

        try {
            estado=marSer.actualizar(marca);
            lstMarca = marSer.listar();
            marca = new Marca();
        } catch (Exception e) {
            resultado = "Error en: eliminarMarca :: " + e.getMessage();
        }
        return estado;
    }

    @Action(value = "eliminarMarca", results = {
        @Result(name = "ok", location = "/admin/principal/marca.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String eliminarMarca() {

        try {
            estado=marSer.eliminar(String.valueOf(marca.getIdMarca()));
            lstMarca = marSer.listar();
        } catch (Exception e) {
            resultado = "Error en: eliminarMarca :: " + e.getMessage();
        }
        return estado;
    }

}
