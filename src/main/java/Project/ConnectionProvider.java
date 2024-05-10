/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author shivaramakrishnan
 */
public class ConnectionProvider {
    
    public static Connection getConn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/supermarket?serverTimezone=" + java.time.ZoneId.systemDefault();
            //Enter the password to your mysql root user here
            //Connection conn = DriverManager.getConnection(url,"root","Enter_Your_Password");
            return conn;
        }
        catch(Exception e){
            e.printStackTrace();

            return null;
        
    }
    }
    
    
}
