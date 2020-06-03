package wyv.persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import wyv.persistencia.Util;

public class AdministradorDao implements IOperacionesBD<Administrador> {
    
    Connection cn=null;
    PreparedStatement pt=null;
    ResultSet rs=null;
    private static List<Administrador> lstAdmin=null;
    Administrador admin=null;

    @Override
    public int registrar(Administrador a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Administrador a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrador buscar(int id) {

        try {
             cn=Util.getConexionBD();
	            pt=cn.prepareStatement("SELECT * FROM cliente  WHERE id_cliente = '"+id+"';");
	            rs= pt.executeQuery();
	            lstAdmin=new ArrayList<Administrador>();
	            while(rs.next()) {
	            admin=new Administrador();
	            admin.setNombres(rs.getString("id_cliente"));
	            }
	           
	            pt.close();
	            rs.close();
	            cn.close();
              
        } catch (Exception e) {
        }
        
        return admin;
    }
        

    @Override
    public List<Administrador> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrador ingresar(Administrador entrada) {
        try {
             cn=Util.getConexionBD();
	            pt=cn.prepareStatement("SELECT * FROM administrador  WHERE dni = ? and password = ? ;");
                    pt.setString(1, entrada.getDni());
                    pt.setString(2, entrada.getPassword());
	            rs= pt.executeQuery();
	            lstAdmin=new ArrayList<Administrador>();
	            while(rs.next()) {
	            admin=new Administrador();
	            admin.setNombres(rs.getString("nombres"));
	            }
                    
	            pt.close();
	            rs.close();
	            cn.close();
              
        } catch (Exception e) {
        }
        
        return admin;
    }

    
    
}
