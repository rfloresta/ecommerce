package wyv.action;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionSupport;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import wyv.negocio.Linea;
import wyv.negocio.PedidoObj;
import wyv.servicios.PedidoServicio;
import wyv.persistencia.Pedido;
import wyv.persistencia.DetallePedido;
import wyv.persistencia.Cliente;
import wyv.persistencia.Empresa;
import wyv.negocio.ProductoObj;
import wyv.negocio.ClienteObj;

@Component("PedidoAction")
@Scope(value = "prototype")
public class PedidoAction extends ActionSupport implements SessionAware {
    
    @Autowired
    PedidoServicio pedSer;
    private String resultado;
    private Pedido pedido;
    private Cliente cliente;
    private Empresa empresa;
    private List<Pedido> lstPedido;
    private List<DetallePedido> lstDetalle;
    private List<Linea> lstLinea;
    private int cantidad;
    private int edit;
    private String estado = "error";
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
            lstPedido = pedSer.listar();
            return "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
        }
        
        return estado;
    }

    @Action(value = "registrarPedido", results = {
        @Result(name = "ok", location = "/carro.jsp")
        ,
	@Result(name = "error", location = "/error.jsp")

    })
    public String registrarPedido(/*String idCliente*/) {
        try {
            PedidoObj ven = new PedidoObj();
            String idCliente = sesion.get("id").toString();
            ClienteObj clie = new ClienteObj();
            clie.setIdCli(idCliente);
            ven.setCli(clie);
            ven.getFec();
            ven.getNum();
            pedSer.registrar(ven);
            lstLinea = (List<Linea>) sesion.get("lstLinea");
            lstLinea.clear();

           enviarSession();

            estado= "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
        }
        
        return estado;
    }

    @Action(value = "listarPedidoPorCliente", results = {})
    public void listarPedidoPorCliente(/*int idCliente*/) {
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
    public String AgregarCarrito(/*List<Linea> lstLinea, ProductoObj proObj, int cantidad*/) {
        try {
            PedidoObj ven = new PedidoObj();
            
            if (sesion.get("lstLinea") == null) {

                ven.agregar(proObj, cantidad = 1);
                
            } else {

                lstLinea = (List<Linea>) sesion.get("lstLinea");
                int existe = ven.existeProducto(proObj.idProducto, lstLinea);
                if (existe == -1) {
                    lstLinea.add(new Linea(proObj, 1));
                    System.out.println("El producto no existe");
                } else {
                    int producto = lstLinea.get(existe).getCan();
                    int cantidadEdit = producto + 1;
                    lstLinea.get(existe).setCan(cantidadEdit);
                }
                
            }
            enviarSession();

            estado = "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            System.out.println("Error: " + e.getMessage());
        }
        return estado;
    }

    public void enviarSession() {
        PedidoObj ven=new PedidoObj();
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
    }

//    @Action(value = "obtenerLista", results = {})
//    public void obtenerLista() {
//        try {
//            lstLinea = (List<Linea>) sesion.get("lstLinea");
//            HttpServletResponse response = ServletActionContext.getResponse();
//            HttpServletRequest request = ServletActionContext.getRequest();
//            PrintWriter out = response.getWriter();
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
//            String json = gson.toJson(lstLinea);
//            out.print(json);
//
//        } catch (Exception e) {
//            resultado = "Error en: listarCate :: " + e.getMessage();
//            System.out.println("Error: " + e.getMessage());
//
//        }
//    }

    @Action(value = "QuitarDelCarro", results = {
        @Result(name = "ok", location = "/carro.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String QuitarDelCarro(/*String idProducto*/) {
        try {

            PedidoObj ven = new PedidoObj();
            ven.quitar(proObj.idProducto);/*idProducto*/
            enviarSession();
            estado = "ok";
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            
        }
        return estado;
    }

    @Action(value = "actualizarCantidadCar", results = {
        @Result(name = "ok", location = "/carro.jsp")
        ,
	@Result(name = "error", location = "admin/error.jsp")

    })
    public String actualizarCantidadCar(/*boolean aumentarCar, boolean disminuirCar, List<Linea> lstLinea, ProductoObj proObj*/) {
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
            enviarSession();

            estado = "ok";
        } catch (Exception e) {
            resultado = "Error en: listarCate :: " + e.getMessage();
            System.out.println("Error: " + e.getMessage());
           
        }
        return estado;
    }

    @Action(value = "actualizarPedido", results = {
        @Result(name = "ok", location = "/admin/principal/pedido.jsp")
        ,
			@Result(name = "error", location = "/admin/error.jsp")
    })
    public String actualizarPedido(/*Pedido pedido*/) {

        try {
            Pedido ped = new Pedido();
            String pedidoString = String.valueOf(pedido.getIdPedido());

            ped.setIdPedido(Integer.parseInt(pedidoString));
            ped.setNumero(pedido.getNumero());
            ped.setSubtotal(pedido.getSubtotal());
            ped.setTotal(pedido.getTotal());
            ped.setFecha(pedido.getFecha());
            ped.setPago(pedido.getPago());
            ped.setIgv(pedido.getIgv());
            ped.setEstado(pedido.getEstado());
            cliente.getIdCliente();
            ped.setIdCliente(cliente);
            pedSer.actualizar(ped);
            lstPedido = pedSer.listar();
            estado= "ok";
        } catch (Exception e) {
            resultado = "Error en: actualizarPedido :: " + e.getMessage();
        }
        
        return estado;
    }

}
