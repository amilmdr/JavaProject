/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import org.util.DBConnection;

/**
 *
 * @author Amil
 */
public class SalesItemReport extends javax.swing.JInternalFrame {

    /**
     * Creates new form SalesItemReport
     */
    public SalesItemReport() {
        initComponents(); 
        Connection();
    }
      Connection con;

    public void Connection() {
        String url = "jdbc:mysql://localhost:3306/pharmacymanagement";
        String uname = "root";
        String pwd = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, uname, pwd);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
 public void loadreport() {
        if (jDateChooser1_fromd.getDate() == null || jTextField1_Search.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "From Date or Search can  not be empty  ");
        } else {
            if (jDateChooser2_tod.getDate() == null) {
                SimpleDateFormat date_format1 = new SimpleDateFormat("yyy/MM/dd");
                String fdate = date_format1.format(jDateChooser1_fromd.getDate());
                Date currentDate = new Date();
                SimpleDateFormat date_format2 = new SimpleDateFormat("yyy/MM/dd");
                String todate = date_format2.format(currentDate);
                String search =jTextField1_Search.getText();
                if (todate.compareTo(fdate) < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Form date should not be occure after To date");
                } else {
                    HashMap a = new HashMap();
                    a.put("fromd", fdate);
                    a.put("tod", todate);
                    a.put("searchData",search);

                    jPanel1.removeAll();
                    jPanel1.repaint();
                    jPanel1.revalidate();

                    try {
                        JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\Soni\\OneDrive\\Documents\\NetBeansProjects\\Pharmacy  stock  management system\\src\\org\\view\\report2.jrxml");
                        JasperReport jreport = JasperCompileManager.compileReport(jdesign);
                        DBConnection Dbcon = new DBConnection();
                        JasperPrint jprint = JasperFillManager.fillReport(jreport, a, con);
                        JRViewer v = new JRViewer(jprint);
                        jPanel1.setLayout(new BorderLayout());
                        jPanel1.add(v);

                    } catch (JRException ex) {
                        Logger.getLogger(SalesItemReport.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else{
            
                SimpleDateFormat date_format1 = new SimpleDateFormat("yyy/MM/dd");
                String fdate = date_format1.format(jDateChooser1_fromd.getDate());

                SimpleDateFormat date_format2 = new SimpleDateFormat("yyy/MM/dd");
                String todate = date_format2.format(jDateChooser2_tod.getDate());
                 String search =jTextField1_Search.getText();
                if (todate.compareTo(fdate) < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Form date should not be occure after To date");
                } else {
                    HashMap a = new HashMap();
                    a.put("fromd", fdate);
                    a.put("tod", todate);
                    a.put("searchData",search);

                    jPanel1.removeAll();
                    jPanel1.repaint();
                    jPanel1.revalidate();

                    try {
                        JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\Soni\\OneDrive\\Documents\\NetBeansProjects\\Pharmacy  stock  management system\\src\\org\\view\\report2.jrxml");
                        JasperReport jreport = JasperCompileManager.compileReport(jdesign);
                        DBConnection Dbcon = new DBConnection();
                        JasperPrint jprint = JasperFillManager.fillReport(jreport, a, con);
                        JRViewer v = new JRViewer(jprint);
                        jPanel1.setLayout(new BorderLayout());
                        jPanel1.add(v);

                    } catch (JRException ex) {
                        Logger.getLogger(SalesItemReport.class.getName()).log(Level.SEVERE, null, ex);
                    }

            }

        }
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDateChooser1_fromd = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser2_tod = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1_Search = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("From Date");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("To Date");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Filter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("By Customer Name,BatchId or Medicne Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooser1_fromd, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooser2_tod, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(jButton1)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateChooser2_tod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(6, 6, 6))
                        .addComponent(jDateChooser1_fromd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jTextField1_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loadreport();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1_fromd;
    private com.toedter.calendar.JDateChooser jDateChooser2_tod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1_Search;
    // End of variables declaration//GEN-END:variables
}
