package wyv.presentacion;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import wyv.servicios.AdministradorServicio;
import wyv.persistencia.Administrador;

@SuppressWarnings("serial")
public class AdministradorAction extends ActionSupport {

    AdministradorServicio adminSer;
    private String resultado;
    private Administrador admin;
    private List<Administrador> lstAdmin;
    private int edit;

    public String getResultado() {
        return resultado;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public List<Administrador> getLstAdmin() {
        return lstAdmin;
    }

    public int getEdit() {
        return edit;
    }

    public void setSerAdmin(AdministradorServicio serAdmin) {
        this.adminSer = serAdmin;
    }

    @Action(value = "ingresoAdmin", results = {
        @Result(name = "ok", location = "/principal.jsp"),
        @Result(name = "invalido", location = "/login.jsp"),
	@Result(name = "error", location = "/error.jsp")

    })
    public String ingresoAdmin() {
        try {

            admin = adminSer.ingresar(admin);
            lstAdmin=adminSer.listar();
            if(admin==null){
                return "invalido";
            }
            return "ok";

        } catch (Exception e) {
            resultado = "Error en: ingresoAdmin ::" + e.getMessage();
            return "error";
        }
    }

}
