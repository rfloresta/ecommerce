/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.action;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionSupport;
import java.io.PrintWriter;
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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

import wyv.negocio.Linea;
import wyv.negocio.PedidoObj;
import wyv.servicios.PedidoServicio;
import wyv.persistencia.Pedido;
import wyv.persistencia.DetallePedido;
import wyv.persistencia.Cliente;
import wyv.persistencia.Empresa;
import wyv.negocio.ProductoObj;
import wyv.negocio.ClienteObj;

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
    private ProductoObj proObj;
    private ClienteObj clieObj;
    private double total;
    private double igv;
    private double descuento;
    private double subtotal;
    private Map<String, Object> sesion;
    private boolean aumentarCar;
    private boolean disminuirCar;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
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

    public boolean isAumentarCar() {
        return aumentarCar;
    }

    public void setAumentarCar(boolean aumentarCar) {
        this.aumentarCar = aumentarCar;
    }

    public boolean isDisminuirCar() {
        return disminuirCar;
    }

    public void setDisminuirCar(boolean disminuirCar) {
        this.disminuirCar = disminuirCar;
    }

    public ClienteObj getClieObj() {
        return clieObj;
    }

    public void setClieObj(ClienteObj clieObj) {
        this.clieObj = clieObj;
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
    
      @Action(value = "registrarPedido", results = {
        @Result(name = "ok", location = "/carro.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String registrarPedido() {
        try {
            
            
             pedSer = new PedidoServicio();
<<<<<<< HEAD
            VentaObj ven = new VentaObj();
            HttpServletResponse response = ServletActionContext.getResponse();
            HttpServletRequest request = ServletActionContext.getRequest();

            String idCliente = request.getParameter("idcliente");
            ClienteObj clie = new ClienteObj();
            clie.setIdCli(idCliente);
            ven.setCli(clie);
            ven.getFec();
            ven.getNum();
            pedSer.registrar(ven);
            lstLinea=(List<Linea>) sesion.get("lstLinea");
            lstLinea.clear();
            
                lstLinea = ven.getCesta();
                subtotal = ven.getSubTot();
                igv = Math.round(ven.getValorIgv() * 100) / 100;
                descuento = ven.getDescTotales();
                total = ven.getTot();

                sesion.put("lstLinea", lstLinea);
                sesion.put("subtotal", subtotal);
                sesion.put("descuento", descuento);
                sesion.put("igv", igv);
                sesion.put("total", total);
                sesion.put("cantidadCart", lstLinea.size());
=======
             PedidoObj ven = new PedidoObj();
             clieObj.getIdCli();
             ven.setCli(clieObj);
             ven.getFec();
             ven.getNum();
             pedSer.registrar(ven);
>>>>>>> 65345ee6f52115baac334b64693a6f6b4473bdff
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            e.printStackTrace();
            return "error";
        }
    }

    @Action(value = "listarPedidoPorCliente", results = {})
    public void listarPedidoPorCliente() {
        try {
            HttpServletResponse response = ServletActionContext.getResponse();
            HttpServletRequest request = ServletActionContext.getRequest();
            PrintWriter out = response.getWriter();
            int idCliente = Integer.parseInt(request.getParameter("idClie"));
            lstDetalle = new PedidoServicio().listarDPedidoPorCliente(idCliente);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lstDetalle);
            out.print(json);
            
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
        }
    }
    
    @Action(value = "AgregarCarrito", results = {
        @Result(name = "ok", location = "/index.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String AgregarCarrito() {
        try {
            PedidoObj ven = new PedidoObj();
            if (sesion.get("lstLinea") == null) {

                ven.agregar(proObj, 1);

                lstLinea = ven.getCesta();
                subtotal = ven.getSubTot();
                igv = Math.round(ven.getValorIgv() *100) / 100;
                descuento = ven.getDescTotales();
                total = ven.getTot();

                sesion.put("lstLinea", lstLinea);
                sesion.put("subtotal", subtotal);
                sesion.put("descuento", descuento);
                sesion.put("igv", igv);
                sesion.put("total", total);
                sesion.put("cantidadCart", lstLinea.size());
            } else {

                lstLinea = (List<Linea>) sesion.get("lstLinea");
                int existe = ven.existeProducto(proObj.idProducto, lstLinea);
                if (existe == -1) {
                    lstLinea.add(new Linea(proObj, 1));
                    
                    lstLinea = ven.getCesta();
                    subtotal = ven.getSubTot();
                    igv = Math.round(ven.getValorIgv() * 100) / 100;
                    descuento = ven.getDescTotales();
                    total = ven.getTot();

                    sesion.put("lstLinea", lstLinea);
                    sesion.put("subtotal", subtotal);
                    sesion.put("descuento", descuento);
                    sesion.put("igv", igv);
                    sesion.put("total", total);
                    sesion.put("cantidadCart", lstLinea.size());
                    
                } else {
                    int producto = lstLinea.get(existe).getCan();
                    int cantidad = producto + 1;
                    lstLinea.get(existe).setCan(cantidad);
                }
                sesion.put("lstLinea", lstLinea);
                sesion.put("subtotal", subtotal);
                sesion.put("descuento", descuento);
                sesion.put("igv", igv);
                sesion.put("total", total);
                sesion.put("cantidadCart", lstLinea.size());
            }

            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            System.out.println("Error: " + e.getMessage());
            return "error";
        }
    }
    
    @Action(value = "obtenerLista", results = {
   
    })
    public void obtenerLista() {
        try {
            lstLinea = (List<Linea>) sesion.get("lstLinea");
            HttpServletResponse response = ServletActionContext.getResponse();
            HttpServletRequest request = ServletActionContext.getRequest();
            PrintWriter out = response.getWriter();     
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lstLinea);
            out.print(json);
        
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            System.out.println("Error: " + e.getMessage());
    
        }
    }
    

    @Action(value = "QuitarDelCarro", results = {
        @Result(name = "ok", location = "/carro.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String QuitarDelCarro() {
        try {

            PedidoObj ven = new PedidoObj();
            ven.quitar(proObj.idProducto);
            lstLinea = ven.getCesta();
            subtotal = ven.getSubTot();
            igv = Math.round(ven.getValorIgv() *100) / 100;
            descuento = ven.getDescTotales();
            total = ven.getTot();
            sesion.put("lstLinea", lstLinea);
            sesion.put("subtotal", subtotal);
            sesion.put("descuento", descuento);
            sesion.put("igv", igv);
            sesion.put("total", total);
            sesion.put("cantidadCart", lstLinea.size());
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            System.out.println("Error: " + e.getMessage());
            return "error";
        }
    }

    @Action(value = "actualizarCantidadCar", results = {
        @Result(name = "ok", location = "/carro.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String actualizarCantidadCar() {
        try {

            if (aumentarCar) {
                lstLinea = (List<Linea>) sesion.get("lstLinea");
                for (int i = 0; i < lstLinea.size(); i++) {
                    if (lstLinea.get(i).getProObj().getIdProducto().equals(proObj.getIdProducto())) {
                        int cantidad = lstLinea.get(i).getCan();
                        lstLinea.get(i).setCan(cantidad + 1);
                    }
                }

            } else if (disminuirCar) {
                lstLinea = (List<Linea>) sesion.get("lstLinea");
                for (int i = 0; i < lstLinea.size(); i++) {
                    if (lstLinea.get(i).getProObj().getIdProducto().equals(proObj.getIdProducto())) {
                        int cantidad = lstLinea.get(i).getCan();
                        lstLinea.get(i).setCan(cantidad - 1);
                    }
                }
            }
            PedidoObj ven = new PedidoObj();
            lstLinea = ven.getCesta();
            subtotal = ven.getSubTot();
            igv = Math.round(ven.getValorIgv() *100) / 100;
            descuento = ven.getDescTotales();
            total = ven.getTot();
            sesion.put("lstLinea", lstLinea);
            sesion.put("subtotal", subtotal);
            sesion.put("descuento", descuento);
            sesion.put("igv", igv);
            sesion.put("total", total);
            sesion.put("cantidadCart", lstLinea.size());

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
