package wyv.action;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import wyv.servicios.SubCategoriaServicio;

@Component("ProductoAction")
@Scope(value = "prototype")
public class ProductoAction extends ActionSupport implements SessionAware {

    @Autowired
    ProductoServicio proSer;
    @Autowired
    CategoriaServicio catSer;
    @Autowired
    MarcaServicio marSer;
    @Autowired
    SubCategoriaServicio subCateSer;
    private String resultado;
    private String estado = "error";
    private Producto producto;
    private Categoria categoria;
    private Subcategoria subcategoria;
    private Marca marca;
    private List<Producto> lstProducto;
    private List<Categoria> lstCategoria;
    private List<Subcategoria> lstSubCate;
    private List<Marca> lstMarca;
    private int edit;
    private File imagen;
    private String imagenContentType;
    private String imagenFileName;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Subcategoria getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(Subcategoria subcategoria) {
        this.subcategoria = subcategoria;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
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


    

    @Action(value = "listarProducto", results = {
        @Result(name = "ok", location = "/admin/principal/producto.jsp")
        ,
	@Result(name = "error", location = "/admin/error.jsp")

    })
    public String listarProducto() {
        try {
            lstProducto = proSer.listar();
            lstCategoria = catSer.listar();
            lstMarca = marSer.listar();
            lstSubCate = subCateSer.listar();
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarProducto :: " + e.getMessage();
            return "error";
        }
    }
    
    
    @Action(value = "listarProductoCliente", results = {
        @Result(name = "ok", location = "/productos.jsp")
        ,
	@Result(name = "error", location = "/error.jsp")

    })
    public String listarProductoCliente() {
        try {
            lstProducto = proSer.listar();
            lstSubCate = subCateSer.listar();
            lstCategoria = catSer.listar();
            lstMarca = marSer.listar();
            sesion.put("marca",lstMarca);

            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarProducto :: " + e.getMessage();
            return "error";
        }
    }
    

    @Action(value = "registrarProducto", results = {
        @Result(name = "ok", location = "/admin/principal/producto.jsp")
        ,
        @Result(name = "error", location = "/admin/error.jsp")},
            interceptorRefs = {
                @InterceptorRef("fileUpload")
                ,@InterceptorRef("basicStack")})
    public String registrarProducto() {
        try {
            //subir imagen
            String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("admin/imagenes");
            File fileToCreate = new File(filePath, imagenFileName);
            FileUtils.copyFile(imagen, fileToCreate);
            //subir imagen

            producto.setImagen(imagenFileName);
            estado = proSer.registrar(producto);
            lstProducto = proSer.listar();
            lstCategoria = catSer.listar();
            lstMarca = marSer.listar();
            lstSubCate = subCateSer.listar();
            producto = new Producto();
            return estado;
        } catch (IOException e) {
            resultado = "Error en: registrarProducto :: " + e.getMessage();
            return estado;
        }
    }

    @Action(value = "editarProducto", results = {
        @Result(name = "ok", location = "/admin/principal/producto.jsp")
        ,
			@Result(name = "error", location = "/admin/error.jsp")
    })
    public String editarProducto() {

        try {
            producto = proSer.buscar(String.valueOf(producto.getIdProducto()));
            lstProducto = proSer.listar();
            lstCategoria = catSer.listar();
            lstMarca = marSer.listar();
            lstSubCate = subCateSer.listar();
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
            producto = proSer.buscar(String.valueOf(producto.getIdProducto()));
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: editarProducto :: " + e.getMessage();
            return "error";
        }
    }

    @Action(value = "actualizarProducto", results = {
        @Result(name = "ok", location = "/admin/principal/producto.jsp")
        ,
	@Result(name = "error", location = "/error.jsp")
    })
    public String actualizarProducto() {

        try {
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
            lstCategoria = catSer.listar();
            lstMarca = marSer.listar();
            lstSubCate = subCateSer.listar();
            producto = new Producto();
            return estado;
        } catch (IOException e) {
            resultado = "Error en: eliminarProducto :: " + e.getMessage();
            return estado;
        }
    }

    @Action(value = "eliminarProducto", results = {
        @Result(name = "ok", location = "/admin/principal/producto.jsp")
        ,
        @Result(name = "error", location = "/error.jsp")
    })
    public String eliminarProducto() {
        try {
            estado = proSer.eliminar(String.valueOf(producto.getIdProducto()));
            lstProducto = proSer.listar();
            lstCategoria = catSer.listar();
            lstMarca = marSer.listar();
            lstSubCate = subCateSer.listar();
            return estado;
        } catch (Exception e) {
            resultado = "Error en: eliminarProducto :: " + e.getMessage();
            return estado;
        }
    }

    @Action(value = "verCatalogo", results = {
        @Result(name = "ok", location = "/catalogo.jsp")
        ,
	@Result(name = "error", location = "/error.jsp")
    })

    public String verCatalogo() {
        try {
            lstProducto = proSer.listar();
            sesion.put("lstProducto", lstProducto);
            lstCategoria = catSer.listar();
            sesion.put("lstCategoria", lstCategoria);
            lstMarca = marSer.listar();
            sesion.put("lstMarca", lstMarca);
            lstSubCate = subCateSer.listar();       
            sesion.put("lstSubCate", lstSubCate);
            estado = "ok";
        } catch (Exception e) {
            resultado = "Error en: verCatalogo :: " + e.getMessage();
        }
        return estado;
    }

    @Action(value = "listarSubCateFiltro", results = {
    })

    public void listarSubCateFiltro() {
        try {

            HttpServletResponse response = ServletActionContext.getResponse();
            HttpServletRequest request = ServletActionContext.getRequest();
            PrintWriter out = response.getWriter();
            int id = Integer.parseInt(request.getParameter("idCate"));
            lstSubCate = proSer.listarSubPorCate(id);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lstSubCate);
            out.print(json);

        } catch (IOException | NumberFormatException e) {
            resultado = "Error en: verCatalogo :: " + e.getMessage();
        }
    }
    
    @Action(value = "listarFiltroPrecioProducto", results = {
        @Result(name = "ok", location = "/productos_filtrados.jsp")
        ,
	@Result(name = "error", location = "/error.jsp")
    })

    public String listarFiltroPrecioProducto() {
        try {

            HttpServletResponse response = ServletActionContext.getResponse();
            HttpServletRequest request = ServletActionContext.getRequest();
            PrintWriter out = response.getWriter();

            double minVal = Double.parseDouble(request.getParameter("min_val"));
            double maxVal = Double.parseDouble(request.getParameter("max_val"));
            System.out.println("min val : " + minVal);
            lstProducto = proSer.listar();

            List<Producto> Productos = new ArrayList<>();
            Producto pro = new Producto();

            for (int i = 0; i < lstProducto.size(); i++) {
                if (minVal <= lstProducto.get(i).getPrecioVenta() && lstProducto.get(i).getPrecioVenta() <= maxVal) {
                    pro = lstProducto.get(i);
                    Productos.add(pro);
                } 
            }
            sesion.put("lstProductoFiltro", Productos);

            estado= "ok";
        } catch (IOException | NumberFormatException e) {
            resultado = "Error en: listarFiltroPrecioProducto :: " + e.getMessage();
        }
        return estado;
    }
    
    @Action(value = "buscarProducto", results = {
        @Result(name = "ok", location = "/productos_filtrados.jsp")
        ,
	@Result(name = "error", location = "/error.jsp")
    })

    public String buscarProducto() {
        try {

            HttpServletResponse response = ServletActionContext.getResponse();
            HttpServletRequest request = ServletActionContext.getRequest();
            PrintWriter out = response.getWriter();

            String valor = request.getParameter("valorBusqueda");
        
            lstProducto = proSer.buscarProducto(valor);
          
            sesion.put("lstProductoFiltro", lstProducto);

            estado= "ok";
        } catch (IOException | NumberFormatException e) {
            resultado = "Error en: listarFiltroPrecioProducto :: " + e.getMessage();
        }
        return estado;
    }
    
    @Action(value = "obtCategoria", results = {@Result(name="ok", location="/productos.jsp"),
    @Result(name="error", location="/error.jsp")
    })

    public String obtCategoria() {
        try {
            categoria = catSer.buscar(categoria.getIdCategoria().toString());
            lstMarca = marSer.listar();
            sesion.put("categoria", categoria);
            sesion.put("lstMarcas", lstMarca);
            estado="ok";
        } catch (Exception e) {
            resultado = "Error en: obtSubsPorCategoria :: " + e.getMessage();
        }
        return estado;
    }
    
    @Action(value = "obtSubcategoria", results = {@Result(name="ok", location="/productos.jsp"),
    @Result(name="error", location="/error.jsp")})

    public String obtSubcategoria() {
        try {
            subcategoria = subCateSer.buscar(subcategoria.getIdSubcategoria().toString());
            sesion.put("subcategoria", subcategoria);
            lstMarca = marSer.listar();
            sesion.put("lstMarcas", lstMarca);
            sesion.remove("categoria");
            estado="ok";
        } catch (Exception e) {
            resultado = "Error en: obtSubsPorProductos :: " + e.getMessage();
        }
        return estado;
    }
    
    @Action(value = "obtMarca", results = {@Result(name="ok", location="/productos.jsp"),
    @Result(name="error", location="/error.jsp")})
    public String obtMarca() {
        try {
            marca = marSer.buscar(marca.getIdMarca().toString());
            lstCategoria = catSer.listar();
            lstSubCate = subCateSer.listar();
            sesion.remove("lstMarcas");
            sesion.put("marca", marca);
            sesion.put("categoria", lstCategoria);
            sesion.put("subcategoria", lstSubCate);
            estado="ok";
        } catch (Exception e) {
            resultado = "Error en: obtSubsPorProductos :: " + e.getMessage();
        }
        return estado;
    }
}
