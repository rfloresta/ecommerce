package wyv.servicios;

import java.util.List;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import wyv.persistencia.Administrador;
import wyv.persistencia.AdministradorDao;

public class AdministradorServicioTest {
    
    public AdministradorServicioTest() {
    }

//    @Test
//    public void testValidar() {
//        System.out.println("validar");
//        Administrador admin=new Administrador();
//        admin.setDni("48887174");
//        admin.setPassword("1234");
//        Administrador entrada = admin;
//        AdministradorServicio instance = new AdministradorServicio();
//        Administrador expResult = null;
//        Administrador result = instance.validar(entrada);
//        assertEquals(expResult, result);
//    }

//    @Test
//    public void testValidarEmailCP1() {
//        System.out.println("validarEmail");
//         Administrador admin=new Administrador();
//        String email = "romariojulerft@gmail.com";
//        AdministradorServicio instance = new AdministradorServicio();
//        admin.setDni("48887174");
//        Administrador expResult = admin ;
//        Administrador result = instance.validarEmail(email);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testValidarEmailCP2() {
//        System.out.println("validarEmail");
//        String email = "unknow@gmail.com";
//        AdministradorServicio instance = new AdministradorServicio();
//        Administrador expResult = null;
//        Administrador result = instance.validarEmail(email);
//        assertEquals(expResult, result);
//    }

//    @Test
//    public void testCompararCP1() {
//        System.out.println("comparar");
//        Administrador entrada=new Administrador();
//        AdministradorServicio instance = new AdministradorServicio();
//        entrada.setDni("48887174");
//        entrada.setCodigoGenerado("24726");
//        String expResult = "ok";
//        String result = instance.comparar(entrada);
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testCompararCP2() {
//        System.out.println("comparar");
//        Administrador entrada=new Administrador();
//        AdministradorServicio instance = new AdministradorServicio();
//        entrada.setDni("48887174");
//        entrada.setCodigoGenerado("78451");
//        String expResult = "incorrecto";
//        String result = instance.comparar(entrada);
//        assertEquals(expResult, result);
//    }
    
}
