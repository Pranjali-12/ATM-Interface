
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pranjali
 */
public class tdeposit {
    public static boolean istdepo(int balance,JFrame frame) {
    try{
       Connection myConn = (Connection) MySQLConnection.getConnection();
       tsession.balance=tsession.balance+balance;
       String mySqlQuery =
               "Update account set balance='"+tsession.balance+"'where accno='"+tsession.accno+"'";
       
       Statement statement = myConn.createStatement();
         statement.executeUpdate(mySqlQuery);
            return true;   
       
    }catch(Exception exception){
        JOptionPane.showMessageDialog(frame,"Database error: " + exception.getMessage());
        return false;
    }
    
    }
}
