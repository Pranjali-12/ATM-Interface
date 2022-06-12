
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
public class toperation {
    public static boolean isLogin(String accname, String accno,JFrame frame) {
    try{
       Connection myConn = (Connection) MySQLConnection.getConnection();
       String mySqlQuery =
               "SELECT accname,accno,balance FROM account WHERE accname ='"+accname+"'AND accno ='"+accno+"'";
       PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
      // Statement statement = myConn.createStatement();
       //   statement.executeUpdate(mySqlQuery);
       ResultSet resultSet = preparedStatement.executeQuery();
       
       while (resultSet.next()){
           tsession.accno=resultSet.getString("accno");
           tsession.accname=resultSet.getString("accname");
           tsession.balance=resultSet.getInt("balance");
           return true;
       }
               
       
    }catch(Exception exception){
        JOptionPane.showMessageDialog(frame,"Database error: " + exception.getMessage());
    }
    return false;
    }
}
