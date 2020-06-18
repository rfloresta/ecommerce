/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.persistencia;

import java.util.List;

/**
 *
 * @author Data
 */
public class PedidoDao implements IOperacionesBD<Pedido> {

    PedidoJpa pedidoJpa=new PedidoJpa();
    
    @Override
    public String registrar(Pedido a) {
        try {
            
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public String actualizar(Pedido a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            return pedidoJpa.findPedidoEntities();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public Pedido ingresar(Pedido entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
