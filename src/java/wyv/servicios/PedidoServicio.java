package wyv.servicios;

import java.util.List;
import wyv.negocio.PedidoObj;
import wyv.persistencia.DetallePedido;
import wyv.persistencia.PedidoDao;
import wyv.persistencia.Pedido;

public class PedidoServicio {
     PedidoDao pedidoDao;
   
    public String registrar(PedidoObj ven) {
       pedidoDao=new PedidoDao();
       return pedidoDao.registrar(ven);
    }

   
    public String actualizar(Pedido a) {
        pedidoDao=new PedidoDao();
        return pedidoDao.actualizar(a); 
    }

    public List<Pedido> listar() {
        pedidoDao=new PedidoDao();
        return pedidoDao.listar();
    }
    
    public List<DetallePedido> listarDPedidoPorCliente(int id)
    {
        pedidoDao=new PedidoDao();
        return pedidoDao.listarDPedidoPorCliente(id);
    }

 
}
