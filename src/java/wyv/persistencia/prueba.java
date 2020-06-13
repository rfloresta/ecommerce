/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.persistencia;

import com.google.gson.Gson;
import java.sql.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 *
 * @author Data
 */
public class prueba {
    
    AdministradorJpa admJpa=new AdministradorJpa();
    AdministradorDao admDao=new AdministradorDao();
    
    public List<Map<String, String>> ventaMes()
    {
        
        return   admDao.ventaMes();
    }
    
    public int contarCliente()
    {
        return admJpa.ContarClientes();
    }
    
    public int ContarAdministrador()
    {
        
    
        return admJpa.ContarAdministrador();
    }
    
    
    public static void main(String[] args) throws ParseException
    {
        
        
        prueba p=new prueba();

        System.out.println("Resultado es : "+ p.ContarAdministrador());
      
        
        
        /*Metodo para grafica Chart
        //System.out.println("verifica " + ss);
        List listaMes= new ArrayList();
        List listaTotal = new ArrayList();
        for(int i=0; i<p.ventaMes().size();i++)
        {
            
            listaMes.add(p.ventaMes().get(i).get("Fecha"));
            listaTotal.add(p.ventaMes().get(i).get("Total"));
                  
        }
        System.out.println("Fecha: " + listaMes);
      */

        
       
       
      
          
      
     
           
      
       
        
        
    }
    
}
