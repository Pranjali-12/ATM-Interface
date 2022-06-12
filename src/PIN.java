
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Pranjali
 */
public class PIN extends javax.swing.JFrame {

    /**
     * Creates new form PIN
     */
    public PIN() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pintxt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(null);

        pintxt.setBackground(new java.awt.Color(153, 153, 153));
        pintxt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pintxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pintxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pintxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pintxtActionPerformed(evt);
            }
        });
        getContentPane().add(pintxt);
        pintxt.setBounds(650, 250, 120, 50);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel1.setText("Enter your 4 digit ATM PIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 150, 580, 160);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Enter");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(283, 331, 110, 40);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 51, 102)));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 700));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pinimage.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 500);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1000, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pintxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pintxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pintxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             pinclass p=new pinclass();
        try{
            String pinStr= pintxt.getText();
           
             
             if(pinclass.ispin(pinStr, this)){
                 new workChoice().setVisible(true);
                 this.dispose();
             }else{
                 JOptionPane.showMessageDialog(this,"Please enter correct pin");
             }
        }catch(Exception exception){
             JOptionPane.showMessageDialog(this,"Please enter correct pin"+exception);
            
        } 
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pintxt;
    // End of variables declaration//GEN-END:variables
}