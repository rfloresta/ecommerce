package wyv.persistencia;

import java.util.List;
import wyv.negocio.Linea;
import wyv.negocio.PedidoObj;

public class PedidoDao {

    PedidoJpa pedidoJpa = new PedidoJpa();
    DetallePedidoJpa detaJpa=new DetallePedidoJpa();


    public String registrar(PedidoObj ven) {
        String msg=null;
        Pedido pedido=new Pedido();
        Cliente clie=new Cliente();
        clie.setIdCliente(Integer.parseInt(ven.getCli().getIdCli()));
        
        pedido.setFecha(ven.getFec());
        pedido.setPago("Tarjeta");
        pedido.setIdCliente(clie);
        pedido.setNumero(ven.getNum());
        pedido.setSubtotal(ven.getSubTot());
        pedido.setIgv(ven.getValorIgv());
        pedido.setTotal(ven.getTot());
        pedido.setEstado('1');
        
        try {
            pedidoJpa.create(pedido);
            List cesta=(List)ven.getCesta();
            for(int i=0;i<cesta.size();i++)
            {
                Linea lin = (Linea)ven.getCesta().get(i);
                DetallePedido det=new DetallePedido();
  
                det.setCantidad(lin.getCan());
                //det.setImporte(lin.getImporte());
                det.setPrecio(lin.getProObj().getPrecioVenta());
                Producto pro=new Producto();
                pro.setIdProducto(Integer.parseInt(lin.getProObj().getIdProducto()));
                pro.setNombre(lin.getProObj().getNombre());
                pro.setStock(lin.getProObj().getStock());
                pro.setPrecioCompra(lin.getProObj().getPrecioCompra());
                pro.setPrecioVenta(lin.getProObj().getPrecioVenta());
         
                det.setProducto(pro);
                det.setPedido(pedido);
                DetallePedidoPK detP=new DetallePedidoPK();
                detP.setIdProducto(Integer.parseInt(lin.getProObj().getIdProducto()));
                detP.setIdPedido(pedido.getIdPedido());
                det.setDetallePedidoPK(detP);
                detaJpa.create(det);
            }
             msg=pedido.getNumero();
        } catch (Exception e) {
            msg=e.getMessage();
        }
        
        return msg;
    }


    public String actualizar(Pedido a) {
        try {
            pedidoJpa.actualizar(a);

            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }


    public String eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public Pedido buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public List<Pedido> listar() {
        try {
            return pedidoJpa.listarPedido();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public List<DetallePedido> listarDPedidoPorCliente(int  id) {
        try {
            return detaJpa.listarDPedidoPorCliente(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }


    public Pedido ingresar(Pedido entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String generaNumero() {
        
        String numObt=null;
        String numGen=null;
        List lis=pedidoJpa.findPedidoEntities();
        if(lis.size()>0){
        for(int i=0;i<lis.size();i++){
            Pedido pedido=(Pedido)lis.get(i);
            numObt= String.valueOf(pedido.getNumero());
        }
        int parInt=Integer.parseInt(numObt.substring(2));//obtenemos la parte entera
        String parStr=numObt.substring(0,1);//obtenermos la parte cadena
        String incParInt=String.valueOf(parInt+1);//incrementamos +1 la parte entera y lo convertimos a cadena
        while(incParInt.length()<5){
            incParInt="0"+incParInt;
        }
        numGen=parStr+incParInt;
        }else{
            numGen="V00001";
        }
        return numGen;
    }
}