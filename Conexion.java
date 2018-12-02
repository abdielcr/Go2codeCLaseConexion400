import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Conexion { 
    private static String     url      = "jdbc:as400://";
    private static String     server   = "ip/server";
    private static String     lib400   = "libreria";
    private static String     user     = "tuusuario";
    private static String     pass     = "tupass";
    private static String     driver   = "com.ibm.as400.access.AS400JDBCDriver";
    private static Connection conexion;
 
//Generando Conexion    
    public Conexion() {
        try {
            Class.forName(driver);
            conexion=DriverManager.getConnection(url+server+ "/"+lib400 +"/;prompt=false",user,pass);
            System.out.println("Conexion establecida con exito");
        }catch(ClassNotFoundException | SQLException e ){
            System.out.println("Conexion Fallida Revisa tu codigo"+e);
        }
    }
//Retorna Conexion    
    public Connection getConnection() {
        return conexion;
    }
}