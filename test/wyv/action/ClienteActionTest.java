package wyv.action;

import org.junit.Test;
import static org.junit.Assert.*;
import wyv.persistencia.Cliente;

public class ClienteActionTest {
    
    Cliente cliente;
    
    public ClienteActionTest() {
    }

//    @Test
//    public void testIngresoClienteCP1() {
//        System.out.println("ingresoCliente");
//        cliente=new Cliente();
//        ClienteAction instance = new ClienteAction();
//        cliente.setEmail("paola@gmail.com");
//        cliente.setPassword("12345");
//        String expResult = "incorrecto";
//        String result = instance.ingresoCliente(cliente);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testIngresoClienteCP2() {
//        System.out.println("ingresoCliente");
//        cliente =new Cliente();
//        ClienteAction instance = new ClienteAction();
//        cliente.setEmail("paola@gmail.com");
//        cliente.setPassword("Hola12345");
//        String expResult = "ok";
//        String result = instance.ingresoCliente(cliente);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testIngresoClienteCP3() {
//        System.out.println("ingresoCliente");
//        cliente =new Cliente();
//        ClienteAction instance = new ClienteAction();
//        cliente.setEmail("pao@gmail.com");
//        cliente.setPassword("Hola12345");
//        String expResult = "incorrecto";
//        String result = instance.ingresoCliente(cliente);
//        assertEquals(expResult, result);
//    }

//    @Test
//    public void testListarClie() {
//        System.out.println("listarClie");
//        ClienteAction instance = new ClienteAction();
//        String expResult = "ok";
//        String result = instance.listarClie();
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testRegistrarseCP1() {
//        System.out.println("registrarse");
//        cliente =new Cliente();
//        ClienteAction instance = new ClienteAction();
//        cliente.setNombres("Mariana");
//        cliente.setApellidos("Bellido");
//        cliente.setEmail("mariana@gmail.com");
//        
//        cliente.setPassword("123456");
//        String expResult = "ok";
//        String result = instance.registrarse(cliente);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testRegistrarseCP2() {
//        System.out.println("registrarse");
//        cliente =new Cliente();
//        ClienteAction instance = new ClienteAction();
//        cliente.setNombres("Paola");
//        cliente.setApellidos("Bellido");
//        cliente.setEmail("paola@gmail.com");
//        cliente.setPassword("123456");
//        String expResult = "incorrecto";
//        String result = instance.registrarse(cliente);
//        assertEquals(expResult, result);
//    }

//    @Test
//    public void testCambiarPasswordClieInCP1() {
//        System.out.println("cambiarPasswordClieIn");
//        cliente=new Cliente();
//        String passwordSession = "123456";
//        String passwordActual = "123456";
//        cliente.setIdCliente(9);
//        cliente.setPassword(passwordActual);
//        ClienteAction instance = new ClienteAction();
//        String expResult = "ok";
//        String result = instance.cambiarPasswordClieIn(passwordSession, passwordActual, cliente);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testCambiarPasswordClieInCP2() {
//        System.out.println("cambiarPasswordClieIn");
//        cliente=new Cliente();
//        String passwordSession = "123456";
//        String passwordActual = "AQWERR";
//        cliente.setIdCliente(9);
//        cliente.setPassword(passwordActual);
//        ClienteAction instance = new ClienteAction();
//        String expResult = "incorrecto";
//        String result = instance.cambiarPasswordClieIn(passwordSession, passwordActual, cliente);
//        assertEquals(expResult, result);
//    }

    
//    @Test
//    public void testRestablecerPasswordClieCP1() throws Exception {
//        System.out.println("restablecerPasswordClie");
//        cliente=new Cliente();
//        cliente.setEmail("rfloresta@autonoma.edu.pe");
//        ClienteAction instance = new ClienteAction();
//        String expResult = "ok";
//        String result = instance.restablecerPasswordClie(cliente);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testRestablecerPasswordClieCP2() throws Exception {
//        System.out.println("restablecerPasswordClie");
//        cliente=new Cliente();
//        cliente.setEmail("pedro@gmail.com");
//        ClienteAction instance = new ClienteAction();
//        String expResult = "incorrecto";
//        String result = instance.restablecerPasswordClie(cliente);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testRestablecerPasswordClieCP3() throws Exception {
//        System.out.println("restablecerPasswordClie");
//        cliente=new Cliente();
//        cliente.setEmail("");
//        ClienteAction instance = new ClienteAction();
//        String expResult = "incorrecto";
//        String result = instance.restablecerPasswordClie(cliente);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testValidarCodigoClieCP1() {
//        System.out.println("validarCodigoClie");
//        String codigo = "12345";
//        int id = 5;
//        ClienteAction instance = new ClienteAction();
//        String expResult = "incorrecto";
//        String result = instance.validarCodigoClie(codigo, id);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testValidarCodigoClieCP2() {
//        System.out.println("validarCodigoClie");
//        String codigo = "57757";
//        int id = 5;
//        ClienteAction instance = new ClienteAction();
//        String expResult = "ok";
//        String result = instance.validarCodigoClie(codigo, id);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testValidarCodigoClieCP3() {
//        System.out.println("validarCodigoClie");
//        String codigo = "";
//        int id = 5;
//        ClienteAction instance = new ClienteAction();
//        String expResult = "incorrecto";
//        String result = instance.validarCodigoClie(codigo, id);
//        assertEquals(expResult, result);
//    }


//    @Test
//    public void testCambiarPasswordOutClieCP1() {
//        System.out.println("cambiarPasswordOutClie");
//        cliente =new Cliente();
//        cliente.setIdCliente(9);
//        cliente.setPassword("Contra12345");
//        ClienteAction instance = new ClienteAction();
//        String expResult = "ok";
//        String result = instance.cambiarPasswordOutClie(cliente);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testCambiarPasswordOutClieCP2() {
//        System.out.println("cambiarPasswordOutClie");
//        cliente =new Cliente();
//        cliente.setIdCliente(9);
//        cliente.setPassword("");
//        ClienteAction instance = new ClienteAction();
//        String expResult = "incorrecto";
//        String result = instance.cambiarPasswordOutClie(cliente);
//        assertEquals(expResult, result);
//    }
//    
}
