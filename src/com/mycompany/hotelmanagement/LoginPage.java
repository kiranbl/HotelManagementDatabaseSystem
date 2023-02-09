package com.mycompany.hotelmanagement;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
public class LoginPage extends javax.swing.JFrame {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement p = null;
  
    

    public LoginPage() throws IOException 
    {
  
        
        initComponents();
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);        
        
    }

       private void makeFrameFullSize(JFrame aFrame) {

       }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Password");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 420));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 87));
        jLabel1.setText("User ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 360, 170, 60);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 87));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 440, 170, 60);

        jTextField2.setBackground(new java.awt.Color(51, 51, 0));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 204, 51));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(650, 370, 340, 50);

        jPasswordField1.setBackground(new java.awt.Color(51, 51, 0));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 204, 51));
        jPasswordField1.setToolTipText("");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(650, 450, 340, 50);

        jButton3.setBackground(new java.awt.Color(51, 51, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 204, 87));
        jButton3.setText("LOGIN");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setPreferredSize(new java.awt.Dimension(86, 20));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(570, 600, 140, 70);

        jButton2.setBackground(new java.awt.Color(51, 51, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 204, 87));
        jButton2.setText("CLEAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(82, 20));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(790, 600, 140, 70);

        jLabel4.setBackground(new java.awt.Color(51, 51, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 130)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 87));
        jLabel4.setText("Hotel Management DB");
        jLabel4.setMaximumSize(new java.awt.Dimension(1000, 100));
        jLabel4.setPreferredSize(new java.awt.Dimension(1000, 100));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 50, 1650, 185);
        jLabel4.getAccessibleContext().setAccessibleName("Hotel Management ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 130)); // NOI18N
        jLabel6.setText("Hotel Management DB");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, -70, 1440, 430);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hotelmanagement/Untitled-4.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -10, 2090, 1100);

        setSize(new java.awt.Dimension(1934, 1117));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sql;
        sql = "select * from loginform where user =? and password =?";
        try
        { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supreeth","root","Kiran13");
                PreparedStatement pstm=con.prepareStatement(sql);
                pstm.setString(1, jTextField2.getText());
                pstm.setString(2, new String(jPasswordField1.getPassword()));
                ResultSet rs=pstm.executeQuery();
                if(rs.next())
                {

                    JOptionPane.showMessageDialog(null, "Welcome " + jTextField1.getText(),"Successful Login", JOptionPane.PLAIN_MESSAGE);
                    new MENU().setVisible(true);
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password" + jTextField1.getText(), "Unsuccessful Login", JOptionPane.ERROR_MESSAGE);

                }
        con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField2.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    }

