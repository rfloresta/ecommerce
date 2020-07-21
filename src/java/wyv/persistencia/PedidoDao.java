package wyv.persistencia;

import java.util.List;

public class PedidoDao implements IOperacionesBD<Pedido> {

    PedidoJpa pedidoJpa = new PedidoJpa();
    DetallePedidoJpa detaJpa=new DetallePedidoJpa();

    @Override
    public String registrar(Pedido a) {
        try {

        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public String actualizar(Pedido a) {
        try {
            pedidoJpa.actualizar(a);

            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @Override
    public String eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pedido buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
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

    @Override
    public Pedido validar(Pedido entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
