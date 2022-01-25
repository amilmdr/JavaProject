/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
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
public class SalesReport extends javax.swing.JInternalFrame {

    /**
     * Creates new form SalesReport
     */
    public SalesReport() {
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
        if (jDateChooser1_fromd.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "From  Date can  not be empty");
        } else {
            if (jDateChooser2_tod.getDate() == null) {
                SimpleDateFormat date_format1 = new SimpleDateFormat("yyy/MM/dd");
                String fdate = date_format1.format(jDateChooser1_fromd.getDate());
                Date currentDate = new Date();
                SimpleDateFormat date_format2 = new SimpleDateFormat("yyy/MM/dd");
                String todate = date_format2.format(currentDate);
                if (todate.compareTo(fdate) < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Form date should not be occure after To date");
                } else {
                    HashMap a = new HashMap();
                    a.put("fromd", fdate);
                    a.put("tod", todate);

                    jPanel1.removeAll();
                    jPanel1.repaint();
                    jPanel1.revalidate();

                    try {
                        JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\Soni\\OneDrive\\Documents\\NetBeansProjects\\Pharmacy  stock  management system\\src\\org\\view\\report1.jrxml");
                        JasperReport jreport = JasperCompileManager.compileReport(jdesign);
                        DBConnection Dbcon = new DBConnection();
                        JasperPrint jprint = JasperFillManager.fillReport(jreport, a, con);
                        JRViewer v = new JRViewer(jprint);
                        jPanel1.setLayout(new BorderLayout());
                        jPanel1.add(v);

                    } catch (JRException ex) {
                        Logger.getLogger(SalesReport.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else{
            
                SimpleDateFormat date_format1 = new SimpleDateFormat("yyy/MM/dd");
                String fdate = date_format1.format(jDateChooser1_fromd.getDate());

                SimpleDateFormat date_format2 = new SimpleDateFormat("yyy/MM/dd");
                String todate = date_format2.format(jDateChooser2_tod.getDate());
                if (todate.compareTo(fdate) < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Form date should not be occure after To date");
                } else {
                    HashMap a = new HashMap();
                    a.put("fromd", fdate);
                    a.put("tod", todate);

                    jPanel1.removeAll();
                    jPanel1.repaint();
                    jPanel1.revalidate();

                    try {
                        JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\Soni\\OneDrive\\Documents\\NetBeansProjects\\Pharmacy  stock  management system\\src\\org\\view\\report1.jrxml");
                        JasperReport jreport = JasperCompileManager.compileReport(jdesign);
                        DBConnection Dbcon = new DBConnection();
                        JasperPrint jprint = JasperFillManager.fillReport(jreport, a, con);
                        JRViewer v = new JRViewer(jprint);
                        jPanel1.setLayout(new BorderLayout());
                        jPanel1.add(v);

                    } catch (JRException ex) {
                        Logger.getLogger(SalesReport.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1_fromd = new com.toedter.calendar.JDateChooser();
        jDateChooser2_tod = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("From Date");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("To Date ");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Filter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1_fromd, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser2_tod, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(93, 93, 93))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addComponent(jDateChooser1_fromd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jDateChooser2_tod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1427, 694);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadreport();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1_fromd;
    private com.toedter.calendar.JDateChooser jDateChooser2_tod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
