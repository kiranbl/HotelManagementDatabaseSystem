/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.hotelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          

   
public class CustomerTable extends javax.swing.JFrame {
 Connection con = null;
    ResultSet rs = null;
    PreparedStatement p = null;
    public CustomerTable() throws ClassNotFoundException {
        initComponents();
         setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
         table1();
         table2();
         table3();
         table4();
         table5();
         table6();
         table7();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(1315, 55, 5, 5);

        jTabbedPane2.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jTable1.setBackground(new java.awt.Color(102, 204, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.green, null));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "c_id", "c_name", "c_age", "ph_no", "address", "check_in", "check_out", "no_of_days", "room_no"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(102, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(102, 255, 204));
        jScrollPane2.setViewportView(jTable1);

        jTabbedPane2.addTab("CUSTOMER", jScrollPane2);

        jTable3.setBackground(new java.awt.Color(102, 204, 255));
        jTable3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.green, null));
        jTable3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "order_id", "food_name", "food_type", "food_price", "quantity", "bill"
            }
        ));
        jTable3.setGridColor(new java.awt.Color(102, 255, 255));
        jTable3.setSelectionForeground(new java.awt.Color(102, 255, 204));
        jScrollPane4.setViewportView(jTable3);

        jTabbedPane2.addTab("FOOD", jScrollPane4);

        jTable4.setBackground(new java.awt.Color(102, 204, 255));
        jTable4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.green, null));
        jTable4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "s_id", "s_name", "s_age", "ph_no", "salary"
            }
        ));
        jTable4.setGridColor(new java.awt.Color(102, 255, 255));
        jTable4.setSelectionForeground(new java.awt.Color(102, 255, 204));
        jScrollPane5.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(2).setHeaderValue("s_age");
            jTable4.getColumnModel().getColumn(3).setHeaderValue("ph_no");
            jTable4.getColumnModel().getColumn(4).setHeaderValue("salary");
        }

        jTabbedPane2.addTab("STAFF", jScrollPane5);

        jTable5.setBackground(new java.awt.Color(102, 204, 255));
        jTable5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.green, null));
        jTable5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "c_id", "order_id"
            }
        ));
        jTable5.setGridColor(new java.awt.Color(102, 255, 255));
        jTable5.setSelectionForeground(new java.awt.Color(102, 255, 204));
        jScrollPane6.setViewportView(jTable5);

        jTabbedPane2.addTab("FOOD ORDERS", jScrollPane6);

        jTable6.setBackground(new java.awt.Color(102, 204, 255));
        jTable6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.green, null));
        jTable6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "room_no", "type_of_room", "room_price", "no_of_ppl", "s_id"
            }
        ));
        jTable6.setGridColor(new java.awt.Color(102, 255, 255));
        jTable6.setSelectionForeground(new java.awt.Color(102, 255, 204));
        jScrollPane7.setViewportView(jTable6);

        jTabbedPane2.addTab("ROOMS", jScrollPane7);

        jTable7.setBackground(new java.awt.Color(102, 204, 255));
        jTable7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.green, null));
        jTable7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "review_id", "rating", "c_id"
            }
        ));
        jTable7.setGridColor(new java.awt.Color(102, 255, 255));
        jTable7.setSelectionForeground(new java.awt.Color(102, 255, 204));
        jScrollPane8.setViewportView(jTable7);

        jTabbedPane2.addTab("REVIEW", jScrollPane8);

        jTable8.setBackground(new java.awt.Color(102, 204, 255));
        jTable8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.green, null));
        jTable8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "bill_id", "bill_amt", "payment_type", "c_id"
            }
        ));
        jTable8.setGridColor(new java.awt.Color(102, 255, 255));
        jTable8.setSelectionForeground(new java.awt.Color(102, 255, 204));
        jScrollPane9.setViewportView(jTable8);

        jTabbedPane2.addTab("BILL", jScrollPane9);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(250, 290, 1034, 416);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 125)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 255));
        jLabel9.setText("DATABASE-VIEW");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 80, 1080, 109);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 125)); // NOI18N
        jLabel10.setText("DATABASE-VIEW");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(280, 80, 1080, 109);

        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hotelmanagement/Untitled-6.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void table1() throws ClassNotFoundException
    {
           String sql = "select * from customer";
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supreeth","root","Kiran13");
                PreparedStatement pstm=con.prepareStatement(sql);
            rs = pstm.executeQuery();
             
           DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[] = { rs.getString("c_id"),rs.getString("c_name"),rs.getString("c_age"),rs.getString("ph_no"),rs.getString("address"),rs.getString("check_in"),rs.getString("check_out"),rs.getString("NO_OF_DAYS"),rs.getString("room_no")};
                tm.addRow(o);
            }
            
            }
            catch (SQLException ex)
            {
                Logger.getLogger(CUSTOMER.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
  private void table2() throws ClassNotFoundException
  {
           String sql = "select * from food";
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supreeth","root","Kiran13");
                PreparedStatement pstm=con.prepareStatement(sql);
            rs = pstm.executeQuery();
             
           DefaultTableModel tm = (DefaultTableModel)jTable3.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[] = { rs.getString("order_id"),rs.getString("food_name"),rs.getString("food_type"),rs.getString("food_price"),rs.getString("quantity"),rs.getString("bill")};
                tm.addRow(o);
            }
            
            }
            catch (SQLException ex)
            {
                Logger.getLogger(FOOD.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
     private void table3() throws ClassNotFoundException
  {
           String sql = "select * from staff";
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supreeth","root","Kiran13");
                PreparedStatement pstm=con.prepareStatement(sql);
            rs = pstm.executeQuery();
             
           DefaultTableModel tm = (DefaultTableModel)jTable4.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[] = { rs.getString("s_id"),rs.getString("s_name"),rs.getString("s_age"),rs.getString("ph_no"),rs.getString("salary")};
                tm.addRow(o);
            }
            
            }
            catch (SQLException ex)
            {
                Logger.getLogger(STAFF.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
       private void table4() throws ClassNotFoundException
  {
           String sql = "select * from FOOD_ORDERS";
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supreeth","root","Kiran13");
                PreparedStatement pstm=con.prepareStatement(sql);
            rs = pstm.executeQuery();
             
           DefaultTableModel tm = (DefaultTableModel)jTable5.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[] = { rs.getString("c_id"),rs.getString("order_id")};
                tm.addRow(o);
            }
            
            }
            catch (SQLException ex)
            {
                Logger.getLogger(FOODCUSINSERT.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
         private void table5() throws ClassNotFoundException
  {
           String sql = "select * from room";
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supreeth","root","Kiran13");
                PreparedStatement pstm=con.prepareStatement(sql);
            rs = pstm.executeQuery();
             
           DefaultTableModel tm = (DefaultTableModel)jTable6.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[] = { rs.getString("room_no"),rs.getString("type_of_room"),rs.getString("room_price"),rs.getString("no_of_ppl"),rs.getString("s_id")};
                tm.addRow(o);
            }
            
            }
        catch (SQLException ex)
            {
                Logger.getLogger(ROOMS.class.getName()).log(Level.SEVERE,null, ex);
        }
  }
        private void table6() throws ClassNotFoundException
  {
           String sql = "select * from review";
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supreeth","root","Kiran13");
                PreparedStatement pstm=con.prepareStatement(sql);
            rs = pstm.executeQuery();
             
           DefaultTableModel tm = (DefaultTableModel)jTable7.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[] = { rs.getString("review_id"),rs.getString("rating"),rs.getString("c_id")};
                tm.addRow(o);
            }
            
            }
            catch (SQLException ex)
            {
                Logger.getLogger(REVIEW.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
         private void table7() throws ClassNotFoundException
  {
           String sql = "select * from BILL";
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supreeth","root","Kiran13");
                PreparedStatement pstm=con.prepareStatement(sql);
            rs = pstm.executeQuery();
             
           DefaultTableModel tm = (DefaultTableModel)jTable8.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[] = { rs.getString("bill_id"),rs.getString("bill_amt"),rs.getString("payment_type"),rs.getString("c_id")};
                tm.addRow(o);
            }
            
            }
            catch (SQLException ex)
            {
                Logger.getLogger(BILL.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(CustomerTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CustomerTable().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CustomerTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    // End of variables declaration//GEN-END:variables

}
