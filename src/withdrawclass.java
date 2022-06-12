
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pranjali
 */
public class withdrawclass {
    public static boolean iswith(int balance,JFrame frame) {
    try{
       Connection myConn = (Connection) MySQLConnection.getConnection();
       LoginSession.balance=LoginSession.balance-balance;
       String mySqlQuery =
               "Update account set balance='"+LoginSession.balance+"'where accno='"+LoginSession.accno+"'";
       
     
       Statement statement = myConn.createStatement();
         statement.executeUpdate(mySqlQuery);
            return true;   
       
    }catch(Exception exception){
        JOptionPane.showMessageDialog(frame,"Database error: " + exception.getMessage());
        return false;
    }
    
    }
}
