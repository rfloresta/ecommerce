/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import wyv.negocio.ClienteObj;
import wyv.negocio.Linea;
import wyv.negocio.ProductoObj;
import wyv.persistencia.Cliente;
import wyv.persistencia.DetallePedido;
import wyv.persistencia.Empresa;
import wyv.persistencia.Pedido;
import wyv.servicios.PedidoServicio;

/**
 *
 * @author bdeg_
 */
public class PedidoActionTest {
    
    public PedidoActionTest() {
    }


//    @Test
//    public void testListarPedido() {
//        System.out.println("listarPedido");
//        PedidoAction instance = new PedidoAction();
//        String expResult = "ok";
//        String result = instance.listarPedido();
//        assertEquals(expResult, result);
//    }

//    @Test
//    public void testRegistrarPedido() {
//        System.out.println("registrarPedido");
//        PedidoAction instance = new PedidoAction();
//        String idCliente= "20";
//        String expResult = "ok";
//        String result = instance.registrarPedido(idCliente);
//        assertEquals(expResult, result);
//    }

//    @Test
//    public void testListarPedidoPorCliente() {
//        System.out.println("listarPedidoPorCliente");
//        PedidoAction instance = new PedidoAction();
//        int idCliente= 20;
//        instance.listarPedidoPorCliente(idCliente);
//    }
//
//    @Test
//    public void testAgregarCarritoCP1() {
//        System.out.println("AgregarCarrito");
//        PedidoAction instance = new PedidoAction();
//        List<Linea> lstLinea= null;
//            ProductoObj proObj = new ProductoObj();
//        proObj.setIdProducto("8");
//        proObj.setNombre("Maquillaje");
//        proObj.setDescripcion("prueba des");
//        proObj.setStock(5);
//        proObj.setPrecioCompra(12);
//        proObj.setPrecioVenta(15);
//        proObj.setDescuento(0);
//        proObj.setImagen("Magnat.jpg");
//        proObj.setIdCategoria("35");
//        proObj.setIdMarca("1");
//        int cantidad = 1;
//
// 
//          
//        String expResult = "ok"; 
//        String result = instance.AgregarCarrito(lstLinea,  proObj, cantidad);
//        assertEquals(expResult, result);         
//    }
//    
//        @Test
//    public void testAgregarCarritoCP2() {
//        System.out.println("AgregarCarrito");
//        PedidoAction instance = new PedidoAction();
//       List<Linea> lstLinea= new ArrayList<>();
//            ProductoObj proObj = new ProductoObj();
//        proObj.setIdProducto("8");
//        proObj.setNombre("Maquillaje");
//        proObj.setDescripcion("prueba des");
//        proObj.setStock(5);
//        proObj.setPrecioCompra(12);
//        proObj.setPrecioVenta(15);
//        proObj.setDescuento(0);
//        proObj.setImagen("Magnat.jpg");
//        proObj.setIdCategoria("35");
//        proObj.setIdMarca("1");
//        int cantidad = 1;
//        Linea lin = new Linea();
//        lin.setProObj(proObj);
// 
//          
//        String expResult = "ok"; 
//        String result = instance.AgregarCarrito(lstLinea,  proObj, cantidad);
//        assertEquals(expResult, result);         
//    }
//    
//        @Test
//    public void testAgregarCarritoCP3() {
//        System.out.println("AgregarCarrito");
//        PedidoAction instance = new PedidoAction();
//        List<Linea> lstLinea= new ArrayList<>();
//            ProductoObj proObj = new ProductoObj();
//        proObj.setIdProducto("7");
//        proObj.setNombre("Prueba");
//        proObj.setDescripcion("prueba des");
//        proObj.setStock(5);
//        proObj.setPrecioCompra(12);
//        proObj.setPrecioVenta(15);
//        proObj.setDescuento(0);
//        proObj.setImagen("Magnat.jpg");
//        proObj.setIdCategoria("35");
//        proObj.setIdMarca("1");
//        int cantidad = 1;
//        Linea lin = new Linea();
//        lin.setProObj(proObj);
//        lin.setCan(cantidad);
//        lstLinea.add(lin);
// 
//          
//        String expResult = "ok"; 
//        String result = instance.AgregarCarrito(lstLinea,  proObj, cantidad);
//        assertEquals(expResult, result);      
//    }

////
//    @Test
//    public void testQuitarDelCarro() {
//        System.out.println("QuitarDelCarro");
//        PedidoAction instance = new PedidoAction();
//        String idProducto = "7";
//        String expResult = "ok";
//        String result = instance.QuitarDelCarro(idProducto);
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testActualizarCantidadCarCP1() {
//        System.out.println("actualizarCantidadCar");
//        PedidoAction instance = new PedidoAction();
//        boolean aumentarCar = true;
//        boolean disminuirCar = false;
//        List<Linea> lstLinea= new ArrayList<>();
//        ProductoObj proObj = new ProductoObj();
//        proObj.setIdProducto("7");
//        proObj.setNombre("Prueba");
//        proObj.setDescripcion("prueba des");
//        proObj.setStock(5);
//        proObj.setPrecioCompra(12);
//        proObj.setPrecioVenta(15);
//        proObj.setDescuento(0);
//        proObj.setImagen("Magnat.jpg");
//        proObj.setIdCategoria("35");
//        proObj.setIdMarca("1");
//        int cantidad = 1;
//        Linea lin = new Linea();
//        lin.setProObj(proObj);
//        lin.setCan(cantidad);
//        lstLinea.add(lin);
//        String expResult = "ok";
//        String result = instance.actualizarCantidadCar(aumentarCar,disminuirCar, lstLinea, proObj );
//        assertEquals(expResult, result);
//    }
//     @Test
//    public void testActualizarCantidadCarCP2() {
//        System.out.println("actualizarCantidadCar");
//        PedidoAction instance = new PedidoAction();
//        boolean aumentarCar = false;
//        boolean disminuirCar = true;
//        List<Linea> lstLinea= new ArrayList<>();
//        ProductoObj proObj = new ProductoObj();
//        proObj.setIdProducto("7");
//        proObj.setNombre("Prueba");
//        proObj.setDescripcion("prueba des");
//        proObj.setStock(5);
//        proObj.setPrecioCompra(12);
//        proObj.setPrecioVenta(15);
//        proObj.setDescuento(0);
//        proObj.setImagen("Magnat.jpg");
//        proObj.setIdCategoria("35");
//        proObj.setIdMarca("1");
//        int cantidad = 1;
//        Linea lin = new Linea();
//        lin.setProObj(proObj);
//        lin.setCan(cantidad);
//        lstLinea.add(lin);
//        String expResult = "ok";
//        String result = instance.actualizarCantidadCar(aumentarCar,disminuirCar, lstLinea, proObj );
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testActualizarPedido() {
//        System.out.println("actualizarPedido");
//        Pedido pedido=new Pedido();
//        PedidoAction instance = new PedidoAction();
//        String pedidoString = String.valueOf(pedido.getIdPedido());
//
//            pedido.setIdPedido(14);
//            pedido.setNumero("V00001");
//            pedido.setSubtotal(30.00);
//            pedido.setTotal(5.40);
//            pedido.setFecha("04/08/2020");
//            pedido.setPago("Tarjeta");
//            pedido.setIgv(5.40);
//            pedido.setEstado('0');
//            Cliente cli=new Cliente();
//            cli.setIdCliente(20);
//            pedido.setIdCliente(cli);
//        String expResult = "ok";
//        String result = instance.actualizarPedido(pedido);
//        assertEquals(expResult, result);
//    }
    
}
