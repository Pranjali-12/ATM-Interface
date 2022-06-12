/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pranjali
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pranjali
 */
public class MySQLConnection {
    public static Connection getConnection() throws Exception{
        String dbRoot = "jdbc:mysql://";
        String hostName = "localhost:3306/";
        String dbName = "atm";
        
        String dbUrl = dbRoot+hostName+dbName;
        
        String hostUsername = "root";
        String hostPassword = "Pranjali@12";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection myConn = (Connection)DriverManager.getConnection(dbUrl,hostUsername,hostPassword);
        
        return myConn;
    }
}