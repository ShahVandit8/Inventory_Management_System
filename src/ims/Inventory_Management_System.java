package ims;
import java.sql.*;

public class Inventory_Management_System {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "saymyname");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select Usertype FROM emp_ims");
        rs.next();
        try{
        if(rs.getString(1).isEmpty()) {
            Registration reg = new Registration();
            reg.show();
            
        }
        else {
            Login lg = new Login();
            lg.show();
        }
        }
        catch(Exception e){
            Registration reg = new Registration();
            reg.show();
        }
    }
    
}
