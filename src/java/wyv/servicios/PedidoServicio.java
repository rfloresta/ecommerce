/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.servicios;

import java.util.List;
import wyv.persistencia.DetallePedido;
import wyv.persistencia.IOperacionesBD;
import wyv.persistencia.Pedido;
import wyv.persistencia.PedidoDao;
import wyv.persistencia.Pedido;

/**
 *
 * @author Data
 */
public class PedidoServicio implements IOperacionesBD<Pedido>{
     PedidoDao pedidoDao;
    
  
     
    @Override
    public String registrar(Pedido a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String actualizar(Pedido a) {
        pedidoDao=new PedidoDao();
        return pedidoDao.actualizar(a); 
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
        pedidoDao=new PedidoDao();
        return pedidoDao.listar();
    }
    
    public List<DetallePedido> listarDPedidoPorCliente(int id)
    {
        pedidoDao=new PedidoDao();
        return pedidoDao.listarDPedidoPorCliente(id);
    }

    @Override
    public Pedido ingresar(Pedido entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
}
