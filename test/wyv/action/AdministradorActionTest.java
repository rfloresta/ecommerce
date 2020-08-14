/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.action;

import java.util.List;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import wyv.persistencia.Administrador;
import wyv.servicios.AdministradorServicio;

/**
 *
 * @author Romario
 */
public class AdministradorActionTest {
    
    public AdministradorActionTest() {
    }

//    @Test
//    public void testGetCodigo() {
//        System.out.println("getCodigo");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.getCodigo();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testListarAdmin() {
//        System.out.println("listarAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.listarAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testRegistrarAdmin() {
//        System.out.println("registrarAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.registrarAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testEditarAdmin() {
//        System.out.println("editarAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.editarAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testActualizarAdmin() {
//        System.out.println("actualizarAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.actualizarAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testEliminarAdmin() {
//        System.out.println("eliminarAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.eliminarAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testCargarDatosAdmin() {
//        System.out.println("cargarDatosAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.cargarDatosAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testActualizarDatosAdmin() {
//        System.out.println("actualizarDatosAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.actualizarDatosAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testCambiarPasswordInAdmin() {
//        System.out.println("cambiarPasswordInAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.cambiarPasswordInAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testRestablecerPasswordAdmin() {
//        System.out.println("restablecerPasswordAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.restablecerPasswordAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    
//
//    @Test
//    public void testCambiarPasswordOutAdmin() {
//        System.out.println("cambiarPasswordOutAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.cambiarPasswordOutAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testCerrarSesionAdmin() {
//        System.out.println("cerrarSesionAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.cerrarSesionAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testIngresoAdmin() {
//        System.out.println("ingresoAdmin");
//        Administrador admin =new Administrador();
//        AdministradorAction instance = new AdministradorAction();
//        admin.setDni("48887174");
//        admin.setPassword("Hola12345");
//        String expResult = "ok";
//        String result = instance.ingresoAdmin(/*admin*/);
//        assertEquals(expResult, result);
//    }

//    @Test
//    public void testSetCodigo() {
//        System.out.println("setCodigo");
//        String codigo = "";
//        AdministradorAction instance = new AdministradorAction();
//        instance.setCodigo(codigo);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetSession() {
//        System.out.println("setSession");
//        Map<String, Object> map = null;
//        AdministradorAction instance = new AdministradorAction();
//        instance.setSession(map);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetSession() {
//        System.out.println("getSession");
//        AdministradorAction instance = new AdministradorAction();
//        Map expResult = null;
//        Map result = instance.getSession();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetContarAdministrador() {
//        System.out.println("getContarAdministrador");
//        AdministradorAction instance = new AdministradorAction();
//        int expResult = 0;
//        int result = instance.getContarAdministrador();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetContarAdministrador() {
//        System.out.println("setContarAdministrador");
//        int contarAdministrador = 0;
//        AdministradorAction instance = new AdministradorAction();
//        instance.setContarAdministrador(contarAdministrador);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetContarPedidos() {
//        System.out.println("getContarPedidos");
//        AdministradorAction instance = new AdministradorAction();
//        int expResult = 0;
//        int result = instance.getContarPedidos();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetContarPedidos() {
//        System.out.println("setContarPedidos");
//        int contarPedidos = 0;
//        AdministradorAction instance = new AdministradorAction();
//        instance.setContarPedidos(contarPedidos);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetContarCliente() {
//        System.out.println("getContarCliente");
//        AdministradorAction instance = new AdministradorAction();
//        int expResult = 0;
//        int result = instance.getContarCliente();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetContarCliente() {
//        System.out.println("setContarCliente");
//        int contarCliente = 0;
//        AdministradorAction instance = new AdministradorAction();
//        instance.setContarCliente(contarCliente);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetJsonMes() {
//        System.out.println("getJsonMes");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.getJsonMes();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetJsonMes() {
//        System.out.println("setJsonMes");
//        String jsonMes = "";
//        AdministradorAction instance = new AdministradorAction();
//        instance.setJsonMes(jsonMes);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetJsonTotal() {
//        System.out.println("getJsonTotal");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.getJsonTotal();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetJsonTotal() {
//        System.out.println("setJsonTotal");
//        String jsonTotal = "";
//        AdministradorAction instance = new AdministradorAction();
//        instance.setJsonTotal(jsonTotal);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetResultado() {
//        System.out.println("getResultado");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.getResultado();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetAdmin() {
//        System.out.println("setAdmin");
//        Administrador admin = null;
//        AdministradorAction instance = new AdministradorAction();
//        instance.setAdmin(admin);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetAdmin() {
//        System.out.println("getAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        Administrador expResult = null;
//        Administrador result = instance.getAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetLstAdmin() {
//        System.out.println("getLstAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        List<Administrador> expResult = null;
//        List<Administrador> result = instance.getLstAdmin();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetEdit() {
//        System.out.println("getEdit");
//        AdministradorAction instance = new AdministradorAction();
//        int expResult = 0;
//        int result = instance.getEdit();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetAdmSer() {
//        System.out.println("setAdmSer");
//        AdministradorServicio admSer = null;
//        AdministradorAction instance = new AdministradorAction();
//        instance.setAdmSer(admSer);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetPasswordActual() {
//        System.out.println("getPasswordActual");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "";
//        String result = instance.getPasswordActual();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetPasswordActual() {
//        System.out.println("setPasswordActual");
//        String passwordActual = "";
//        AdministradorAction instance = new AdministradorAction();
//        instance.setPasswordActual(passwordActual);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testEnviarSession() {
//        System.out.println("enviarSession");
//        Administrador admin = null;
//        AdministradorAction instance = new AdministradorAction();
//        instance.enviarSession(admin);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testRecibirSession() {
//        System.out.println("recibirSession");
//        AdministradorAction instance = new AdministradorAction();
//        Administrador expResult = null;
//        Administrador result = instance.recibirSession();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }



//    @Test
//    public void testValidarCodigoAdmin() {
//        System.out.println("validarCodigoAdmin");
//        String codigo = "24726";
//        String dni = "48887174";
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "ok";
//        String result = instance.validarCodigoAdmin(/*codigo, dni*/);
//        assertEquals(expResult, result);
//    }

   

    

}
