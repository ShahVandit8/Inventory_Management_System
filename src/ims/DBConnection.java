package ims;
import java.sql.*;
import javax.sql.*;

public class DBConnection {
    
    Connection con = null;
    
    public static Connection connectdb() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "saymyname");
        System.out.println("Connect");
        return con;
    } 
}
