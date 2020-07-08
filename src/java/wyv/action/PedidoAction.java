/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.action;

import com.opensymphony.xwork2.ActionSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import wyv.negocio.Linea;
import wyv.negocio.VentaObj;
import wyv.servicios.PedidoServicio;
import wyv.persistencia.Pedido;
import wyv.persistencia.DetallePedido;
import wyv.persistencia.Cliente;
import wyv.persistencia.Empresa;
import wyv.negocio.ProductoObj;

/**
 *
 * @author Data
 */
@SuppressWarnings("serial")
public class PedidoAction extends ActionSupport implements SessionAware {

    PedidoServicio pedSer;
    private String resultado;
    private Pedido pedido;
    private Cliente cliente;
    private Empresa empresa;
    private List<Pedido> lstPedido;
    private List<DetallePedido> lstDetalle;
    private List<Linea> lstLinea;
    private int edit;
    private int op;
    private  ProductoObj proObj;
    private Double total;
    private Map<String, Object> sesion;


    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public ProductoObj getProObj() {
        return proObj;
    }

    public void setProObj(ProductoObj proObj) {
        this.proObj = proObj;
    }

    public List<Linea> getLstLinea() {
        return lstLinea;
    }

    public Map<String, Object> getSesion() {
        return sesion;
    }

    public void setSesion(Map<String, Object> sesion) {
        this.sesion = sesion;
    }

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setPedSer(PedidoServicio pedSer) {
        this.pedSer = pedSer;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public List<DetallePedido> getLstDetalle() {
        return lstDetalle;
    }

    public void setLstDetalle(List<DetallePedido> lstDetalle) {
        this.lstDetalle = lstDetalle;
    }
     @Override
    public void setSession(Map<String, Object> map) {
        this.sesion = map;
    }

    

    @Action(value = "listarPedido", results = {
        @Result(name = "ok", location = "/admin/principal/pedido.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String listarPedido() {
        try {
           
            lstPedido = new PedidoServicio().listar();
            
            System.out.println("Error: " + lstPedido);
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            return "error";
        }
    }
    
    @Action(value = "listarPedidoPorCliente", results = {
        @Result(name = "ok", location = "/perfil.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String listarPedidoPorCliente() {
        try {

            lstDetalle = new PedidoServicio().listarDPedidoPorCliente(cliente.getIdCliente());
            op=3;
            System.out.println("Error: " + lstPedido);
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            return "error";
        }
    }
    
    @Action(value = "AgregarCarrito", results = {
        @Result(name = "ok", location = "/index.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String AgregarCarrito() {
        try {
            
            VentaObj ven=new VentaObj();
            ven.agregar(proObj, 1);
            
            lstLinea=ven.getCesta();
            total =ven.getSubTot();
            sesion.put("lstLinea", lstLinea);
            sesion.put("total",total);
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            System.out.println("Error: " + e.getMessage());
            return "error";
        }
    }
    
      @Action(value = "QuitarDelCarro", results = {
        @Result(name = "ok", location = "/carro.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String QuitarDelCarro() {
        try {
            
            VentaObj ven=new VentaObj();
            ven.quitar(proObj.idProducto);
            lstLinea=ven.getCesta();
            total =ven.getSubTot();
            sesion.put("lstLinea", lstLinea);
            sesion.put("total",total);
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            System.out.println("Error: " + e.getMessage());
            return "error";
        }
    }
    
    

    @Action(value = "actualizarPedido", results = {
        @Result(name = "ok", location = "/admin/principal/pedido.jsp")
        ,
			@Result(name = "error", location = "/error.jsp")
    })
    public String actualizarPedido() {

        try {
            
            Pedido ped = new Pedido();
            String pedidoString = String.valueOf(pedido.getIdPedido());

            ped.setIdPedido(Integer.parseInt(pedidoString));
            ped.setNumero(pedido.getNumero());
            ped.setSubtotal(pedido.getSubtotal());
            ped.setTotal(pedido.getTotal());
            ped.setFecha(pedido.getFecha());
            System.out.println(pedido.getFecha());
            ped.setPago(pedido.getPago());   
            ped.setIgv(pedido.getIgv());
            ped.setEstado(pedido.getEstado());
            cliente.getIdCliente();
            ped.setIdCliente(cliente);
            new PedidoServicio().actualizar(ped);
            lstPedido = new PedidoServicio().listar();
            
            System.out.println(ped.getIdPedido());
            System.out.println(ped.getNumero());
            System.out.println(ped.getSubtotal());
            System.out.println(ped.getTotal());
            System.out.println(ped.getFecha());
            System.out.println(ped.getPago());
            System.out.println(ped.getIgv());
            System.out.println(ped.getEstado());
            System.out.println(ped.getIdCliente());
            
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: eliminarMarca :: " + e.getMessage();
            return "error";
        }
    }

   
  
}
