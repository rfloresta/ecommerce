package wyv.servicios;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import wyv.persistencia.Cliente;

public class ClienteServicioTest {
    
    public ClienteServicioTest() {
    }

//    @Test
//    public void testValidarEmailCP1() {
//        System.out.println("validarEmail");
//        Cliente cliente=new Cliente();
//        String email = "mariana@gmail.com";
//        ClienteServicio instance = new ClienteServicio();
//        Cliente expResult = cliente;
//        cliente.setIdCliente(9);
//        Cliente result = instance.validarEmail(email);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testValidarEmailCP2() {
//        System.out.println("validarEmail");
//        String email = "lukas@gmail.com";
//        ClienteServicio instance = new ClienteServicio();
//        Cliente expResult = null;
//        Cliente result = instance.validarEmail(email);
//        assertEquals(expResult, result);
//    }

    @Test
    public void testCompararCP1() {
        System.out.println("comparar");
        Cliente entrada =new Cliente();
        ClienteServicio instance = new ClienteServicio();
        entrada.setIdCliente(5);
        entrada.setCodigoGenerado("57757");
        String expResult = "ok";
        String result = instance.comparar(entrada);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompararCP2() {
        System.out.println("comparar");
        Cliente entrada =new Cliente();
        ClienteServicio instance = new ClienteServicio();
        entrada.setIdCliente(5);
        entrada.setCodigoGenerado("12345");
        String expResult = "incorrecto";
        String result = instance.comparar(entrada);
        assertEquals(expResult, result);
    }

}
