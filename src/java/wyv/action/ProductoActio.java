//package wyv.action;
//
//import com.opensymphony.xwork2.ActionSupport;
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.io.UnsupportedEncodingException;
//import java.nio.file.Files;
//import java.util.List;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.MultipartConfig;
//    import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.Part;
//import org.apache.commons.fileupload.FileItem;
//import org.apache.commons.fileupload.FileItemFactory;
//import org.apache.commons.fileupload.FileItemHeaders;
//import org.apache.commons.fileupload.disk.DiskFileItemFactory;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;
//import org.apache.commons.io.FileUtils;
//import org.apache.struts2.ServletActionContext;
//import org.apache.struts2.convention.annotation.Action;
//import org.apache.struts2.convention.annotation.InterceptorRef;
//import org.apache.struts2.convention.annotation.InterceptorRefs;
//import org.apache.struts2.convention.annotation.Result;
//import org.apache.struts2.interceptor.ServletRequestAware;
//import wyv.servicios.ProductoServicio;
//import wyv.persistencia.Producto;
//import wyv.persistencia.Categoria;
//import wyv.persistencia.Marca;
//import wyv.servicios.CategoriaServicio;
//import wyv.servicios.MarcaServicio;
//
///**
// *
// * @author Data
// */
//@InterceptorRefs({
//    @InterceptorRef("fileUpload"),
//    @InterceptorRef("basicStack")
//})
//@MultipartConfig(fileSizeThreshold=1024*1024, 
//maxFileSize=1024*1024*5, maxRequestSize=1024*1024*5*5)
//@SuppressWarnings("serial")
//public class ProductoActio extends ActionSupport implements ServletRequestAware{
//    
//    ProductoServicio proSer;
//    private String resultado;
//    private String estado="error";
//    private Producto producto;
//    private List<Producto> lstProducto;
//    private List<Categoria> lstCategoria;
//    private List<Marca> lstMarca;
//    private int edit;
//    private File imagen;
//    private String imagenContentType;
//    private String imagenFileName;
//
//    public File getImagen() {
//        return imagen;
//    }
//
//    public void setImagen(File imagen) {
//        this.imagen = imagen;
//    }
//
//    public String getImagenContentType() {
//        return imagenContentType;
//    }
//
//    public void setImagenContentType(String imagenContentType) {
//        this.imagenContentType = imagenContentType;
//    }
//
//    public String getImagenFileName() {
//        return imagenFileName;
//    }
//
//    public void setImagenFileName(String imagenFileName) {
//        this.imagenFileName = imagenFileName;
//    }
//    
//    
//HttpServletRequest request;
//
//   @Override
//    public void setServletRequest(HttpServletRequest hsr) {
//        this.request=hsr;
//        
//    }
//    public HttpServletRequest getServletRequest() {
//		return this.request;
//	}
//    
//    public String getResultado() {
//        return resultado;
//    }
//
//    public Producto getProducto() {
//        return producto;
//    }
//
//    public void setProducto(Producto producto) {
//        this.producto = producto;
//    }
//
//    public List<Producto> getLstProducto() {
//        return lstProducto;
//    }
//
//    public List<Categoria> getLstCategoria() {
//        return lstCategoria;
//    }
//
//    public List<Marca> getLstMarca() {
//        return lstMarca;
//    }
//
//    public int getEdit() {
//        return edit;
//    }
//
//    public void setProSer(ProductoServicio proSer) {
//        this.proSer = proSer;
//    }
//
//   @Action(value = "listarProducto", results = {
//        @Result(name = "ok", location = "/admin/principal/producto.jsp"),
//	@Result(name = "error", location = "admin/error.jsp")
//
//    })
//    public String listarProducto() {
//        try {
//            
//            lstProducto=new ProductoServicio().listar();
//            lstCategoria=new CategoriaServicio().listar();
//            lstMarca=new MarcaServicio().listar();
//          
//            return "ok";
//        } catch (Exception e) {
//            resultado = "Error en: listarProducto :: " + e.getMessage();
//            return "error";
//        }
//    }
//    
//
//    @Action(value="registrarProducto",results= {
//			@Result(name="ok",location="/admin/principal/producto.jsp"),
//			@Result(name="error",location="/admin/error.jsp")
//	}, interceptorRefs={@InterceptorRef("fileUpload"),@InterceptorRef("basicStack")})
//	public String registrarProducto() {
//		try {
//                        proSer=new ProductoServicio();
//       
//                        String filePath= ServletActionContext.getServletContext().getRealPath("/").concat("admin/imagenes");
//                        System.out.println(filePath); 
//                        File fileToCreate= new File(filePath,imagenFileName);
//			FileUtils.copyFile(imagen, fileToCreate);
//                        producto.setImagen(imagenFileName);
//			estado=proSer.registrar(producto);
//                        lstCategoria=new CategoriaServicio().listar();
//                        lstMarca=new MarcaServicio().listar();
//			lstProducto=new ProductoServicio().listar();
//			producto=new Producto();
//			return estado;
//		} catch (Exception e) {
//			resultado="Error en: registrarProducto :: "+e.getMessage();
//			return estado;
//		}
//	}
//        
//        
//        @Action(value="editarProducto",results= {
//			@Result(name="ok",location="/admin/principal/producto.jsp"),
//			@Result(name="error",location="/error.jsp")
//	})
//	public String editarProducto() {
//		
//		try {
//			producto =new ProductoServicio().buscar(String.valueOf(producto.getIdProducto()));
//			lstProducto=new ProductoServicio().listar();
//                        lstCategoria=new CategoriaServicio().listar();
//                        lstMarca=new MarcaServicio().listar();
//                        edit=1;
//			return "ok";
//		} catch (Exception e) {
//			resultado="Error en: editarProducto :: "+e.getMessage();
//			return "error";
//		}
//	}
//        
//        
//        @Action(value="actualizarProducto",results= {
//			@Result(name="ok",location="/admin/principal/producto.jsp"),
//			@Result(name="error",location="/error.jsp")
//	})
//	public String actualizarProducto() {
//		
//		try {
//			new ProductoServicio().actualizar(producto);
//			lstProducto=new ProductoServicio().listar();
//                        lstCategoria=new CategoriaServicio().listar();
//                        lstMarca=new MarcaServicio().listar();
//                        producto=new Producto();
//			return "ok";
//		} catch (Exception e) {
//			resultado="Error en: eliminarProducto :: "+e.getMessage();
//			return "error";
//		}
//	}
//
//   @Action(value="eliminarProducto",results= {
//			@Result(name="ok",location="/admin/principal/producto.jsp"),
//			@Result(name="error",location="/error.jsp")
//	})
//	public String eliminarProducto() {
//		
//		try {
//			new ProductoServicio().eliminar(String.valueOf(producto.getIdProducto()));
//			lstProducto=new ProductoServicio().listar();
//                        lstCategoria=new CategoriaServicio().listar();
//                        lstMarca=new MarcaServicio().listar();
//			return "ok";
//		} catch (Exception e) {
//			resultado="Error en: eliminarProducto :: "+e.getMessage();
//			return "error";
//		}
//	}
//
//    
//    
//}
