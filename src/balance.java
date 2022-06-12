
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
public class balance {
    public static boolean istransfer(int bal,JFrame frame){
        try{
       Connection myConn = (Connection) MySQLConnection.getConnection();
       LoginSession.transfer=bal;
       String mySqlQuery =
               "Update account set balance='"+LoginSession.transfer+"'where accno='"+LoginSession.accno+"'";
       
      // PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
       Statement statement = myConn.createStatement();
         statement.executeUpdate(mySqlQuery);
       
            return true;   
       
    }catch(Exception exception){
        JOptionPane.showMessageDialog(frame,"Database error: " + exception.getMessage());
        return false;
    }
    }
}
