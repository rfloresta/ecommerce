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

    @Test
    public void testIngresoAdmin() {
        System.out.println("ingresoAdmin");
        AdministradorAction instance = new AdministradorAction();
        String expResult = "ok";
        String result = instance.ingresoAdmin();
        assertEquals(expResult, result);
    }


}
