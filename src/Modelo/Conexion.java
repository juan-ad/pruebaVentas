
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    Connection con;
    
    String url = "jdbc:mysql://localhost:3306/db_ventas";//?useTimezone=true&serverTimezone=UTC
    String user = "root";
    String pass = "juanjo";
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
}
