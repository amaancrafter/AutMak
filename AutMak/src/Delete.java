
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Delete extends javax.swing.JFrame {

    /**
     * Creates new form Delete
     */
    public Delete() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel1.setText("Enter Bill No.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 132, 23);

        tf1.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        getContentPane().add(tf1);
        tf1.setBounds(190, 20, 150, 50);

        jButton1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jButton1.setText("Delete");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 150, 130, 39);

        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 260, 77, 25);

        buttonGroup1.add(rb1);
        rb1.setText("Buyer Bill");
        getContentPane().add(rb1);
        rb1.setBounds(20, 100, 107, 25);

        buttonGroup1.add(rb2);
        rb2.setText("Seller Bill");
        getContentPane().add(rb2);
        rb2.setBounds(240, 100, 81, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a=tf1.getText();
        if(rb1.isSelected())
        {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            String query = "delete from billcust where Billno = '"+a+"';";
            Statement s=(Statement) con.createStatement();
            int success;
            success = s.executeUpdate(query);
            if(success==1)
            {
                JOptionPane.showMessageDialog(this,"Successful");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Problem in Saving, Retry");
            }
        }
        catch(ClassNotFoundException | SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
        else
        {
           try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            String query = "delete from billsell where Billno = '"+a+"';";
            Statement s=(Statement) con.createStatement();
            int success;
            success = s.executeUpdate(query);
            if(success==1)
            {
                JOptionPane.showMessageDialog(this,"Successful");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Problem in Saving, Retry");
            }
        }
        catch(ClassNotFoundException | SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Main m=new Main();
        m.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
