package wyv.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import wyv.persistencia.Categoria;
import wyv.servicios.SubCategoriaServicio;
import wyv.persistencia.Subcategoria;
import wyv.servicios.CategoriaServicio;

@Component("SubcategoriaAction")
@Scope(value = "prototype")
public class SubcategoriaAction extends ActionSupport {
    @Autowired
    SubCategoriaServicio subCatSer;
    @Autowired
    CategoriaServicio catSer;
    private String resultado;
    private Subcategoria subCategoria;
    private List<Subcategoria> lstSubCate;
    private List<Categoria> lstCategoria;
    private int edit;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Subcategoria getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(Subcategoria subCategoria) {
        this.subCategoria = subCategoria;
    }

    public List<Subcategoria> getLstSubCate() {
        return lstSubCate;
    }

    public void setLstSubCate(List<Subcategoria> lstSubCate) {
        this.lstSubCate = lstSubCate;
    }

    public List<Categoria> getLstCategoria() {
        return lstCategoria;
    }

    public void setLstCategoria(List<Categoria> lstCategoria) {
        this.lstCategoria = lstCategoria;
    }

    public int getEdit() {
        return edit;
    }

    public void setEdit(int edit) {
        this.edit = edit;
    }

      @Action(value = "listarSubCate", results = {
        @Result(name = "ok", location = "/admin/principal/subCategoria.jsp"),
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String listarSubCate() {
        try {
            lstSubCate=subCatSer.listar();
            lstCategoria =catSer.listar();
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            e.printStackTrace();
            return "error";
        }
    }
    

    @Action(value="registrarSubCate",results= {
			@Result(name="ok",location="/admin/principal/subCategoria.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String registrarSubCate() {
		try {
			subCatSer.registrar(subCategoria);
			lstSubCate=subCatSer.listar();
                        lstCategoria =catSer.listar();
			subCategoria=new Subcategoria();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: registrarCate :: "+e.getMessage();
			return "error";
		}
	}
        
        
        @Action(value="editarSubCate",results= {
			@Result(name="ok",location="/admin/principal/subCategoria.jsp"),
			@Result(name="error",location="/admin/error.jsp")
	})
	public String editarSubCate() {
		
		try {
			subCategoria =subCatSer.buscar(String.valueOf(subCategoria.getIdSubcategoria()));
			lstSubCate=subCatSer.listar();
                        lstCategoria =catSer.listar();
                        edit=1;
			return "ok";
		} catch (Exception e) {
			resultado="Error en: editarAdmin :: "+e.getMessage();
			return "error";
		}
	}
        
        
        @Action(value="actualizarSubCate",results= {
			@Result(name="ok",location="/admin/principal/subCategoria.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String actualizarSubCate() {
		
		try {
                        
			subCatSer.actualizar(subCategoria);
			lstSubCate=subCatSer.listar();
                        lstCategoria =catSer.listar();
                        subCategoria=new Subcategoria();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: eliminarMarca :: "+e.getMessage();
			return "error";
		}
	}

   @Action(value="eliminarSubCate",results= {
			@Result(name="ok",location="/admin/principal/subCategoria.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String eliminarSubCate() {
		
		try {
			subCatSer.eliminar(String.valueOf(subCategoria.getIdSubcategoria()));
			lstSubCate=subCatSer.listar();
                        lstCategoria =catSer.listar();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: eliminarMarca :: "+e.getMessage();
			return "error";
		}
	}

   
}
