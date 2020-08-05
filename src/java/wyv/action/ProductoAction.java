package wyv.action;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.json.simple.JSONObject;
import wyv.servicios.ProductoServicio;
import wyv.persistencia.Producto;
import wyv.persistencia.Categoria;
import wyv.persistencia.Marca;
import wyv.persistencia.Subcategoria;
import wyv.servicios.CategoriaServicio;
import wyv.servicios.MarcaServicio;
import wyv.servicios.SubCategoriaServicio;


@SuppressWarnings("serial")
public class ProductoAction extends ActionSupport implements SessionAware{

    ProductoServicio proSer;
    private String resultado;
    private String estado = "error";
    private Producto producto;
    private List<Producto> lstProducto;
    private List<Categoria> lstCategoria;
    private List<Subcategoria> lstSubCate;
    private List<Marca> lstMarca;
    private int edit;
    private File imagen;
    private String imagenContentType;
    private String imagenFileName;
    private int idCate;
    private Map<String, Object> sesion;

     @Override
    public void setSession(Map<String, Object> map) {
        this.sesion = map;
    }    

    public File getImagen() {
        return imagen;
    }

    public void setImagen(File imagen) {
        this.imagen = imagen;
    }

    public String getImagenContentType() {
        return imagenContentType;
    }

    public void setImagenContentType(String imagenContentType) {
        this.imagenContentType = imagenContentType;
    }

    public String getImagenFileName() {
        return imagenFileName;
    }

    public void setImagenFileName(String imagenFileName) {
        this.imagenFileName = imagenFileName;
    }


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

    public List<Subcategoria> getLstSubCate() {
        return lstSubCate;
    }

    
    public List<Marca> getLstMarca() {
        return lstMarca;
    }

    public int getEdit() {
        return edit;
    }


    public int getIdCate() {
        return idCate;
    }

    public void setIdCate(int idCate) {
        this.idCate = idCate;
    }
    

    public void setProSer(ProductoServicio proSer) {
        this.proSer = proSer;
    }

    
    @Action(value = "listarProducto", results = {
        @Result(name = "ok", location = "/admin/principal/producto.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String listarProducto() {
        try {

            lstProducto = new ProductoServicio().listar();
            lstCategoria = new CategoriaServicio().listar();
            lstMarca = new MarcaServicio().listar();
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarProducto :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "registrarProducto", results = {
        @Result(name = "ok", location = "/admin/principal/producto.jsp"),
        @Result(name = "error", location = "/admin/error.jsp")}, 
        interceptorRefs = {@InterceptorRef("fileUpload"),@InterceptorRef("basicStack")})
    public String registrarProducto() {
        try {
            //subir imagen
            String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("admin/imagenes");
            File fileToCreate = new File(filePath, imagenFileName);
            FileUtils.copyFile(imagen, fileToCreate);
            //subir imagen

            proSer = new ProductoServicio();
            producto.setImagen(imagenFileName);
            estado = proSer.registrar(producto);
            lstCategoria = new CategoriaServicio().listar();
            lstMarca = new MarcaServicio().listar();
            lstProducto = proSer.listar();
            producto = new Producto();
            return estado;
        } catch (Exception e) {
            resultado = "Error en: registrarProducto :: " + e.getMessage();
            return estado;
        }
    }

    @Action(value = "editarProducto", results = {
        @Result(name = "ok", location = "/admin/principal/producto.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String editarProducto() {

        try {
            proSer = new ProductoServicio();
            producto = proSer.buscar(String.valueOf(producto.getIdProducto()));
            lstProducto = proSer.listar();
            lstCategoria = new CategoriaServicio().listar();
            lstMarca = new MarcaServicio().listar();
            edit = 1;
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: editarProducto :: " + e.getMessage();
            return "error";
        }
    }
    
    @Action(value = "detalleProducto", results = {
        @Result(name = "ok", location = "/detalle_producto.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String detalleProducto() {

        try {
            proSer = new ProductoServicio();
            producto = proSer.buscar(String.valueOf(producto.getIdProducto()));
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: editarProducto :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "actualizarProducto", results = {
        @Result(name = "ok", location = "/admin/principal/producto.jsp"),
	@Result(name = "error", location = "/error.jsp")
    })
    public String actualizarProducto() {

        try {
            proSer = new ProductoServicio();
            if (imagen == null) {
                Producto producto_encontrado = proSer.buscar(String.valueOf(producto.getIdProducto()));
                producto.setImagen(producto_encontrado.getImagen());
            } else {
                String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("admin/imagenes");
                System.out.println(filePath);
                File fileToCreate = new File(filePath, imagenFileName);
                FileUtils.copyFile(imagen, fileToCreate);
                producto.setImagen(imagenFileName);
            }

            System.out.println("precio venta:" + producto.getPrecioVenta());
            estado = proSer.actualizar(producto);
            lstProducto = proSer.listar();
            lstCategoria = new CategoriaServicio().listar();
            lstMarca = new MarcaServicio().listar();
            producto = new Producto();
            return estado;
        } catch (IOException e) {
            resultado = "Error en: eliminarProducto :: " + e.getMessage();
            return estado;
        }
    }
    

    @Action(value = "eliminarProducto", results = {
        @Result(name = "ok", location = "/admin/principal/producto.jsp"),
        @Result(name = "error", location = "/error.jsp")
    })
    public String eliminarProducto() {
        try {
            proSer = new ProductoServicio();
            estado = proSer.eliminar(String.valueOf(producto.getIdProducto()));
            lstProducto = proSer.listar();
            lstCategoria = new CategoriaServicio().listar();
            lstMarca = new MarcaServicio().listar();
            return estado;
        } catch (Exception e) {
            resultado = "Error en: eliminarProducto :: " + e.getMessage();
            return estado;
        }
    }
    
    @Action(value = "verCatalogo", results = {
        @Result(name = "ok", location = "/catalogo.jsp"),
	@Result(name = "error", location = "/error.jsp")
    })
    
    public String verCatalogo() {
        try {
            lstProducto = new ProductoServicio().listar();
            sesion.put("lstProducto", lstProducto);
            lstCategoria = new CategoriaServicio().listar();
            sesion.put("lstCategoria", lstCategoria);
            lstSubCate = new SubCategoriaServicio().listar();
            sesion.put("lstSubCate", lstSubCate);
            lstMarca = new MarcaServicio().listar();
            sesion.put("lstMarca", lstMarca);
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: verCatalogo :: " + e.getMessage();
            return "error";
        }
    }
    
    @Action(value = "listarSubCateFiltro", results = {
       
    })
    
    public void listarSubCateFiltro() {
        try {
            
            HttpServletResponse response = ServletActionContext.getResponse();
            HttpServletRequest request = ServletActionContext.getRequest();
            PrintWriter out = response.getWriter();
            int idCate = Integer.parseInt(request.getParameter("idCate"));
            lstSubCate=new ProductoServicio().listarSubPorCate(idCate);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lstSubCate);
            
            out.print(json);
           
        } catch (Exception e) {
            resultado = "Error en: verCatalogo :: " + e.getMessage();
            
        }
    }
}
