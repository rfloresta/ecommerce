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
import wyv.servicios.PedidoServicio;
import wyv.persistencia.Pedido;

/**
 *
 * @author Data
 */
@SuppressWarnings("serial")
public class PedidoAction extends ActionSupport {
    
    PedidoServicio pedSer;
    private String resultado;
    private Pedido pedido;
    private List<Pedido> lstPedido;
    private int edit;

    public String getResultado() {
        return resultado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public List<Pedido> getLstPedido() {
        return lstPedido;
    }

    public int getEdit() {
        return edit;
    }

    public void setPedSer(PedidoServicio pedSer) {
        this.pedSer = pedSer;
    }
    
    
     @Action(value = "listarPedido", results = {
        @Result(name = "ok", location = "/admin/principal/pedido.jsp"),
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String listarPedido() {
        try {
            pedSer=new PedidoServicio();
            lstPedido = pedSer.listar();
            System.out.println("Error: " + lstPedido);
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            return "error";
        }
    }
    
    
    
}
