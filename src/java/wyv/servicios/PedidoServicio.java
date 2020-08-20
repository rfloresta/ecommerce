package wyv.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wyv.negocio.PedidoObj;
import wyv.persistencia.DetallePedido;
import wyv.persistencia.PedidoDao;
import wyv.persistencia.Pedido;

@Service
public class PedidoServicio {

    @Autowired
    PedidoDao pedidoDao;

    public String registrar(PedidoObj ven) {
        return pedidoDao.registrar(ven);
    }

    public String actualizar(Pedido a) {
        return pedidoDao.actualizar(a);
    }

    public List<Pedido> listar() {
        return pedidoDao.listar();
    }

    public List<DetallePedido> listarDPedidoPorCliente(int id) {
        return pedidoDao.listarDPedidoPorCliente(id);
    }

    public int contar() {
        return pedidoDao.contar();
    }

}
