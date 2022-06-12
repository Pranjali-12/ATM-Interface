
//import com.mysql.cj.xdevapi.Statement;
//import com.sun.jdi.connect.spi.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pranjali
 */
public class Operations {
    public static boolean isLogin(String accname, String accno, String cvv,JFrame frame) {
    try{
       Connection myConn = (Connection) MySQLConnection.getConnection();
       String mySqlQuery =
               "SELECT accname,accno,cvv,pin,balance,mobileno,transfer FROM account WHERE accname ='"+accname+"'AND accno ='"+accno+"'AND cvv='"+cvv+"'";
       PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
       ResultSet resultSet = preparedStatement.executeQuery();
       
       while (resultSet.next()){
           LoginSession.accno=resultSet.getString("accno");
           LoginSession.accname=resultSet.getString("accname");
           LoginSession.cvv=resultSet.getString("cvv");
           LoginSession.pin=resultSet.getString("pin");
           LoginSession.balance=resultSet.getInt("balance");
           LoginSession.mob=resultSet.getString("mobileno");
           LoginSession.transfer=resultSet.getInt("transfer");
           
           return true;
       }
               
       
    }catch(Exception exception){
        JOptionPane.showMessageDialog(frame,"Database error: " + exception.getMessage());
    }
    return false;
    }
}
