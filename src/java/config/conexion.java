
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/proyectopoo";
    String user="root";
    String pass="1234";
    public Connection getConnection(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection(url,user,pass);
        
        
        }
        catch(Exception e){
        
        }
        
        return con;
    }

}
