package wyv.action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import wyv.persistencia.Empresa;
import wyv.servicios.EmpresaServicio;
import java.io.IOException;


/**
 *
 * @author Romario
 */
@SuppressWarnings("serial")
public class EmpresaAction extends ActionSupport {
    
    EmpresaServicio empSer;
    private String resultado;
    private Empresa empresa;
    private String estado="error";
    private File logo;
    private String logoContentType;
    private String logoFileName;

    public String getResultado() {
        return resultado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setEmpSer(EmpresaServicio empSer) {
        this.empSer = empSer;
    }

    public File getLogo() {
        return logo;
    }

    public void setLogo(File logo) {
        this.logo = logo;
    }

    public String getLogoFileName() {
        return logoFileName;
    }

    public void setLogoFileName(String logoFileName) {
        this.logoFileName = logoFileName;
    }

    public String getLogoContentType() {
        return logoContentType;
    }

    public void setLogoContentType(String logoContentType) {
        this.logoContentType = logoContentType;
    }
    
    
     @Action(value="cargarEmpresa",results= {
			@Result(name="ok",location="/admin/principal/empresa.jsp"),
			@Result(name="error",location="/admin/error.jsp")
	})
	public String cargarEmpresa() {
		
		try {
                        empSer=new EmpresaServicio();
			empresa=empSer.buscar("1");
			return "ok";
		} catch (Exception e) {
			resultado="Error en: cargarEmpresa :: "+e.getMessage();
			return "error";
		}
	}
    
    @Action(value="actualizarEmpresa",results= {
			@Result(name="ok",location="/admin/principal/empresa.jsp"),
			@Result(name="error",location="/admin/error.jsp"),
                        @Result(name="input",location="/admin/error.jsp")
	})
	public String actualizarEmpresa() {
		
		try {
                    
                        
                    
                    String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("admin/imagenes");
                    File fileToCreate = new File(filePath, logoFileName);
                    FileUtils.copyFile(logo, fileToCreate);
                        
                        empSer=new EmpresaServicio();
                        empresa.setLogo(logoFileName);
                    
			estado=empSer.actualizar(empresa);
			empresa=empSer.buscar(String.valueOf(empresa.getIdEmpresa()));
                        System.out.println(estado);
			return estado;
		} catch (Exception e) {
			resultado="Error en: actualizarEmpresa :: "+e.getMessage();
			return estado;
		}
	}
    
}
