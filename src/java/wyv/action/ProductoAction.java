package wyv.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import wyv.servicios.ProductoServicio;
import wyv.persistencia.Producto;
import wyv.persistencia.Categoria;
import wyv.persistencia.Marca;
import wyv.servicios.CategoriaServicio;
import wyv.servicios.MarcaServicio;

/**
 *
 * @author Data
 */
@SuppressWarnings("serial")
public class ProductoAction extends ActionSupport {
    
    ProductoServicio proSer;
    private String resultado;
    private Producto producto;
    private List<Producto> lstProducto;
    private List<Categoria> lstCategoria;
    private List<Marca> lstMarca;
    private int edit;

   
    
    public String getResultado() {
        return resultado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getLstProducto() {
        return lstProducto;
    }

    public List<Categoria> getLstCategoria() {
        return lstCategoria;
    }

    public List<Marca> getLstMarca() {
        return lstMarca;
    }

    public int getEdit() {
        return edit;
    }

    public void setProSer(ProductoServicio proSer) {
        this.proSer = proSer;
    }



   @Action(value = "listarProducto", results = {
        @Result(name = "ok", location = "/admin/principal/producto.jsp"),
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String listarProducto() {
        try {
            
            lstProducto=new ProductoServicio().listar();
            lstCategoria=new CategoriaServicio().listar();
            lstMarca=new MarcaServicio().listar();
          
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarProducto :: " + e.getMessage();
            return "error";
        }
    }
    
    @Action(value="registrarProducto",results= {
			@Result(name="ok",location="/admin/principal/producto.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String registrarProducto() {
            System.out.println("el producto es " + producto.getNombre());
		try {
                        
			new ProductoServicio().registrar(producto);
                        
                        System.out.println("el producto es " + producto.getNombre());
                        lstCategoria=new CategoriaServicio().listar();
                        lstMarca=new MarcaServicio().listar();
			lstProducto=new ProductoServicio().listar();
			producto=new Producto();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: registrarProducto :: "+e.getMessage();
			return "error";
		}
	}
        
        
        @Action(value="editarProducto",results= {
			@Result(name="ok",location="/admin/principal/producto.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String editarProducto() {
		
		try {
			producto =new ProductoServicio().buscar(String.valueOf(producto.getIdProducto()));
			lstProducto=new ProductoServicio().listar();
                        lstCategoria=new CategoriaServicio().listar();
                        lstMarca=new MarcaServicio().listar();
                        edit=1;
			return "ok";
		} catch (Exception e) {
			resultado="Error en: editarProducto :: "+e.getMessage();
			return "error";
		}
	}
        
        
        @Action(value="actualizarProducto",results= {
			@Result(name="ok",location="/admin/principal/producto.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String actualizarProducto() {
		
		try {
			new ProductoServicio().actualizar(producto);
			lstProducto=new ProductoServicio().listar();
                        lstCategoria=new CategoriaServicio().listar();
                        lstMarca=new MarcaServicio().listar();
                        producto=new Producto();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: eliminarProducto :: "+e.getMessage();
			return "error";
		}
	}

   @Action(value="eliminarProducto",results= {
			@Result(name="ok",location="/admin/principal/producto.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String eliminarProducto() {
		
		try {
			new ProductoServicio().eliminar(String.valueOf(producto.getIdProducto()));
			lstProducto=new ProductoServicio().listar();
                        lstCategoria=new CategoriaServicio().listar();
                        lstMarca=new MarcaServicio().listar();
			return "ok";
		} catch (Exception e) {
			resultado="Error en: eliminarProducto :: "+e.getMessage();
			return "error";
		}
	}
    
}
