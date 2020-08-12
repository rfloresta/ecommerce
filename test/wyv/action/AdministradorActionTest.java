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
 * @author bdeg_
 */
public class AdministradorActionTest {
    
    public AdministradorActionTest() {
    }

//    @Test
//    public void testIngresoAdminCP1() {
//        System.out.println("ingresoAdmin");
//        Administrador admin = new Administrador();
//        AdministradorAction instance = new AdministradorAction();
//        admin.setDni("73184116");
//        admin.setPassword("Bryan321");
//        String expResult = "ok";
//        String result = instance.ingresoAdmin(admin);
//        assertEquals(expResult, result);
//        
//    }
//    
//    @Test
//    public void testIngresoAdminCP2() {
//        System.out.println("ingresoAdmin");
//        Administrador admin = new Administrador();
//        AdministradorAction instance = new AdministradorAction();
//        admin.setDni("64897567");
//        admin.setPassword("25464");
//        String expResult = "incorrecto";
//        String result = instance.ingresoAdmin(admin);
//        assertEquals(expResult, result);
//        
//    }
//
//
//    @Test
//    public void testListarAdmin() {
//        System.out.println("listarAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String expResult = "ok";
//        String result = instance.listarAdmin();
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testRegistrarAdmin() {
//        System.out.println("registrarAdmin");
//        Administrador admin = new Administrador();
//        AdministradorAction instance = new AdministradorAction();
//        admin.setDni("84567925");
//        admin.setNombres("Bryan");
//        admin.setApellidos("Estrada");
//        admin.setPassword("bryan123");
//        admin.setEmail("bestradag05@gmail.com");
//        admin.setCodigoGenerado("28562");
//        admin.setPrivilegio('A');
//        String expResult = "ok";
//        String result = instance.registrarAdmin(admin);
//        assertEquals(expResult, result);
//    }
//
//
//    @Test
//    public void testEliminarAdmin() {
//        System.out.println("eliminarAdmin");
//        Administrador admin = new Administrador();
//        AdministradorAction instance = new AdministradorAction();
//        admin.setDni("84567925");
//        String expResult = "ok";
//        String result = instance.eliminarAdmin(admin);
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testCargarDatosAdmin() {
//        System.out.println("cargarDatosAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String dni = "73184116";
//        String expResult = "ok";
//        String result = instance.cargarDatosAdmin(dni);
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testActualizarDatosAdmin() {
//        System.out.println("actualizarDatosAdmin");
//        Administrador admin = new Administrador();
//        AdministradorAction instance = new AdministradorAction();
//        admin.setDni("73184116");
//        admin.setNombres("Bryan");
//        admin.setApellidos("Estrada");
//        admin.setPassword("Bryan123");
//        admin.setEmail("bestradag05@gmail.com");
//        admin.setCodigoGenerado("28562");
//        admin.setPrivilegio('A');
//        String expResult = "ok";
//        String result = instance.actualizarDatosAdmin(admin);
//        assertEquals(expResult, result);
//       
//    }
//
//    @Test
//    public void testCambiarPasswordInAdminCP1() {
//        System.out.println("cambiarPasswordInAdmin");
//        Administrador admin = new Administrador();
//        AdministradorAction instance = new AdministradorAction();
//        String passSesion="Bryan123";
//        String passwordActual = "Bryan123";
//        admin.setDni("73184116");
//        admin.setNombres("Bryan");
//        admin.setApellidos("Estrada");
//        admin.setPassword("Bryan4321");
//        admin.setEmail("bestradag05@gmail.com");
//        admin.setCodigoGenerado("28562");
//        admin.setPrivilegio('A');
//        String expResult = "ok";
//        String result = instance.cambiarPasswordInAdmin(passSesion,passwordActual,admin);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testCambiarPasswordInAdminCP2() {
//        System.out.println("cambiarPasswordInAdmin");
//        Administrador admin = new Administrador();
//        AdministradorAction instance = new AdministradorAction();
//        String passSesion="Bryan123";
//        String passwordActual = "1111";
//        admin.setDni("73184116");
//        admin.setNombres("Bryan");
//        admin.setApellidos("Estrada");
//        admin.setPassword("Bryan4321");
//        admin.setEmail("bestradag05@gmail.com");
//        admin.setCodigoGenerado("28562");
//        admin.setPrivilegio('A');
//        String expResult = "incorrecto";
//        String result = instance.cambiarPasswordInAdmin(passSesion,passwordActual,admin);
//        assertEquals(expResult, result);
//    }
//
//   
//
//    @Test
//    public void testRestablecerPasswordAdminCP1() {
//        System.out.println("restablecerPasswordAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String emailadmin = "";
//        String expResult = "incorrecto";
//        String result = instance.restablecerPasswordAdmin(emailadmin);
//        assertEquals(expResult, result);
//      
//    }
//    
//    @Test
//    public void testRestablecerPasswordAdminCP2() {
//        System.out.println("restablecerPasswordAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String emailadmin = "bestradag05@gmail.com";
//        String expResult = "ok";
//        String result = instance.restablecerPasswordAdmin(emailadmin);
//        assertEquals(expResult, result);
//      
//    }
//    
//    @Test
//    public void testRestablecerPasswordAdminCP3() {
//        System.out.println("restablecerPasswordAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String emailadmin = " noexiste@gmail.com";
//        String expResult = "incorrecto";
//        String result = instance.restablecerPasswordAdmin(emailadmin);
//        assertEquals(expResult, result);
//      
//    }
//////
//    @Test
//    public void testValidarCodigoAdminCP1() {
//        System.out.println("validarCodigoAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String codigo = "";
//        String dni = "73184116";
//        String expResult = "incorrecto";
//        String result = instance.validarCodigoAdmin(codigo, dni );
//        assertEquals(expResult, result);
//    }
//    
//        @Test
//    public void testValidarCodigoAdminCP2() {
//        System.out.println("validarCodigoAdmin");
//        AdministradorAction instance = new AdministradorAction();
//        String codigo = "71338";
//        String dni = "73184116";
//        String expResult = "ok";
//        String result = instance.validarCodigoAdmin(codigo, dni );
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testCambiarPasswordOutAdmin() {
//        System.out.println("cambiarPasswordOutAdmin");
//        Administrador admin = new Administrador();
//        AdministradorAction instance = new AdministradorAction();
//        admin.setDni("73184116");
//        admin.setNombres("Bryan");
//        admin.setApellidos("Estrada");
//        admin.setPassword("Bryan321");
//        admin.setEmail("bestradag05@gmail.com");
//        admin.setCodigoGenerado("71338");
//        admin.setPrivilegio('A');
//        String expResult = "ok";
//        String result = instance.cambiarPasswordOutAdmin(admin);
//        assertEquals(expResult, result);
//    }
//
//   
}
