
package com.mycompany.hotelmanagement;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CUSTOMER extends javax.swing.JFrame {
Connection con = null;
    ResultSet rs = null;
    PreparedStatement p = null;

    public CUSTOMER() {
        initComponents();
         setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(690, 420));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 255));
        jLabel1.setText("ROOM NO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(820, 550, 149, 33);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 255));
        jLabel2.setText("AGE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 440, 47, 32);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 255));
        jLabel3.setText("PHONE NO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(820, 440, 127, 33);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 255));
        jLabel4.setText("ADDRESS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 500, 108, 32);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 255));
        jLabel5.setText("CHECK IN");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(820, 500, 130, 33);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 255));
        jLabel6.setText("CHECKOUT");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 550, 140, 32);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 255));
        jLabel7.setText("NAME");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(820, 380, 99, 33);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 255));
        jLabel8.setText("CUSTOMER_ID");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(300, 380, 180, 32);

        jTextField1.setBackground(new java.awt.Color(255, 204, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(530, 380, 184, 33);

        jTextField2.setBackground(new java.awt.Color(255, 204, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(1080, 380, 184, 33);

        jTextField4.setBackground(new java.awt.Color(255, 204, 255));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(530, 500, 184, 33);

        jTextField5.setBackground(new java.awt.Color(255, 204, 255));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(530, 440, 184, 33);

        jTextField6.setBackground(new java.awt.Color(255, 204, 255));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(1080, 440, 184, 33);

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\icons8-reception-50 (2).png")); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(710, 680, 160, 58);

        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hotelmanagement/icons8-reception-50 (1).png"))); // NOI18N
        jButton2.setText("INSERT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 680, 150, 58);

        jButton3.setBackground(new java.awt.Color(255, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hotelmanagement/icons8-reception-50 (3).png"))); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.setPreferredSize(new java.awt.Dimension(95, 33));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(970, 680, 150, 58);

        jDateChooser1.setBackground(new java.awt.Color(255, 204, 255));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jDateChooser1.setMaxSelectableDate(new java.util.Date(253370748717000L));
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(530, 560, 190, 30);

        jDateChooser2.setBackground(new java.awt.Color(255, 204, 255));
        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(1080, 500, 190, 30);

        jButton4.setBackground(new java.awt.Color(255, 204, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("VIEW");
        jButton4.setPreferredSize(new java.awt.Dimension(95, 33));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(460, 780, 130, 58);

        jButton5.setBackground(new java.awt.Color(255, 204, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hotelmanagement/icons8-menu-rounded-32 (4).png"))); // NOI18N
        jButton5.setText("MENU");
        jButton5.setPreferredSize(new java.awt.Dimension(95, 33));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(720, 780, 130, 58);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 115)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 204));
        jLabel11.setText("CUSTOMER INFORMATION");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 40, 1710, 200);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 115)); // NOI18N
        jLabel9.setText("CUSTOMER INFORMATION");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 50, 1710, 200);

        jComboBox1.setBackground(new java.awt.Color(255, 204, 255));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(1080, 550, 187, 40);

        jButton6.setBackground(new java.awt.Color(255, 204, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("CHECK AVAIL");
        jButton6.setPreferredSize(new java.awt.Dimension(95, 33));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(970, 780, 150, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hotelmanagement/Untitled-5.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try {
        new CustomerTable().setVisible(true);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(CUSTOMER.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new MENU().setVisible(true);
                    dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String sql;
        sql = "insert into customer(c_id,c_name,c_age,ph_no,address,check_in,check_out,room_no) values(?,?,?,?,?,?,?,?)";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supreeth","root","Kiran13");
                PreparedStatement pstm=con.prepareStatement(sql);
                pstm.setString(1, jTextField1.getText());
                pstm.setString(2, jTextField2.getText());
                pstm.setString(3, jTextField5.getText());
                pstm.setString(4, jTextField6.getText());
                pstm.setString(5, jTextField4.getText());
               SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date = sd.format(jDateChooser2.getDate());
                pstm.setString(6, date);
                String date1 = sd.format(jDateChooser1.getDate());
                pstm.setString(7, date1);
                 pstm.setString(8, (String) jComboBox1.getSelectedItem());
                  pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insertion successful");
                   
    }                                        
  catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   jTextField1.setText("");
      jTextField2.setText("");
      jTextField5.setText("");
      jTextField6.setText("");
      jTextField4.setText("");
      
     jComboBox1.setSelectedItem("");
 
                   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                new CUSTOMERDELETE().setVisible(true);
        
        
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                   new CUSTOMERUPDATE().setVisible(true);
      
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusGained
       jComboBox1.removeAllItems();
        try 
        {
        String sql="select r.room_no from room r where not exists (select c.room_no from customer c where r.room_no = c.room_no )";
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supreeth","root","Kiran13");
      PreparedStatement  pstm = con.prepareStatement(sql);

        rs=pstm.executeQuery();

        while(rs.next())

        {    System.out.println("added");

            jComboBox1.addItem(rs.getString(1));

        }

    } catch (SQLException ex) {

        Logger.getLogger(ROOMS.class.getName()).log(Level.SEVERE, null, ex);

    }

    


    }//GEN-LAST:event_jComboBox1FocusGained

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    try {
        new ROOMAVAIL().setVisible(true);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(CUSTOMER.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton6ActionPerformed
 
   public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}