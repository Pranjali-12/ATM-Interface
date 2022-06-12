
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class pinclass {
    public static boolean ispin(String pin,JFrame frame) {
    try{
       Connection myConn = (Connection) MySQLConnection.getConnection();
       String mySqlQuery =
               "SELECT accname,accno,pin FROM account WHERE accname ='"+LoginSession.accname+"'AND accno ='"+LoginSession.accno+"'And pin ='"+pin+"'";
       PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
       
       ResultSet resultSet = preparedStatement.executeQuery();
       
       while (resultSet.next()){
           LoginSession.accno=resultSet.getString("accno");
           LoginSession.accname=resultSet.getString("accname");
           LoginSession.pin=resultSet.getString("pin");
            return true;     
           
       }
              
       
    }catch(Exception exception){
        JOptionPane.showMessageDialog(frame,"Database error: " + exception.getMessage());
        
    }return false;
    }
}
