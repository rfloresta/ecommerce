package wyv.persistencia;


import java.sql.*;

public class Util {

    public static Connection getConexionBD() {

		Connection cn=null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaw_v","root","");
            System.out.println("se conecto!!!!!!");
        } catch (Exception e) 
        {
            System.out.println("no se conecto!!!!!!");
        }
        
        return cn;
    }
	
	
	public static void main(String[] args) {
		
	      Util.getConexionBD();

	}

}
