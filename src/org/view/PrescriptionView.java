/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import com.sun.glass.events.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import org.model.Prescription;

/**
 *
 * @author Amil
 */
public class PrescriptionView extends javax.swing.JFrame {

    /**
     * Creates new form Prescription
     */
    public PrescriptionView() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1_DrName = new javax.swing.JTextField();
        jTextField2_PhoneNumber = new javax.swing.JTextField();
        jTextField3_NmcNumber = new javax.swing.JTextField();
        jTextField4_Email = new javax.swing.JTextField();
        jTextField5_Address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        validateDrName = new javax.swing.JLabel();
        validatePhoneNumber = new javax.swing.JLabel();
        validateNmcNumber = new javax.swing.JLabel();
        validateEmail = new javax.swing.JLabel();
        validateAddress = new javax.swing.JLabel();
        validateDate = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Dr Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Phone Number ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NMC Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Date");

        jTextField1_DrName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1_DrNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_DrNameKeyTyped(evt);
            }
        });

        jTextField2_PhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_PhoneNumberActionPerformed(evt);
            }
        });
        jTextField2_PhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2_PhoneNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2_PhoneNumberKeyReleased(evt);
            }
        });

        jTextField3_NmcNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3_NmcNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_NmcNumberKeyTyped(evt);
            }
        });

        jTextField4_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_EmailActionPerformed(evt);
            }
        });
        jTextField4_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4_EmailKeyReleased(evt);
            }
        });

        jTextField5_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5_AddressActionPerformed(evt);
            }
        });
        jTextField5_Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5_AddressKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Prescription  Info");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1_DrName)
                            .addComponent(jTextField3_NmcNumber)
                            .addComponent(jTextField2_PhoneNumber)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(validateNmcNumber)
                                    .addComponent(validateDrName)
                                    .addComponent(validatePhoneNumber)
                                    .addComponent(jTextField5_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(validateEmail)
                                    .addComponent(validateAddress))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validateDate)
                            .addComponent(jButton1)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1_DrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(validateDrName)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validatePhoneNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3_NmcNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(validateNmcNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateEmail)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField5_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(validateAddress))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateDate)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2_PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_PhoneNumberActionPerformed

    }//GEN-LAST:event_jTextField2_PhoneNumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean error = false, error1 = false;
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jTextField4_Email.getText()))) {
            validateEmail.setText("email pattern  doesnot match ");
            error = true;

        }
        if (jTextField1_DrName.getText().trim().isEmpty()) {
            validateDrName.setText("Name can not be empty");
            error = true;
        }
        if (jTextField2_PhoneNumber.getText().trim().isEmpty()) {
            validatePhoneNumber.setText("Address can  not be empty ");
            error = true;
        }
        if (jTextField3_NmcNumber.getText().trim().isEmpty()) {
            validateNmcNumber.setText("number can not be empty");
            error = true;
        }
        if (jTextField5_Address.getText().trim().isEmpty()) {
            validateAddress.setText("Address can  not be empty ");
            error = true;
        }
        if (jDateChooser1.getDate() == null) {
            validateDate.setText("Date can not be empty");
            error = true;
        }
        if (error == false) {
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateFormat.format(currentDate);
            SimpleDateFormat date_format1 = new SimpleDateFormat("yyy-MM-dd");
            String prescriptionDate = date_format1.format(jDateChooser1.getDate());
            String contact = jTextField2_PhoneNumber.getText();
            int length = contact.length();
            if (length < 10) {
                validatePhoneNumber.setText("Phone Number Should not of 10 digits");
                error1 = true;
            }

            if (prescriptionDate.compareTo(date) > 0) {
                validateDate.setText("Prescription  date should not be occure affter current date");
                error1 = true;
            }

            if (error1 == false) {

                Prescription ob = new Prescription();
                ob.setDrName(jTextField1_DrName.getText());
                ob.setPhoneNumber(jTextField2_PhoneNumber.getText());
                ob.setNmcNumber(jTextField3_NmcNumber.getText());
                ob.setEmail(jTextField4_Email.getText());
                ob.setAddress(jTextField5_Address.getText());
                ob.setDate(prescriptionDate);

                Transaction.getPrescription(ob);
                dispose();
            }

        }


// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3_NmcNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_NmcNumberKeyTyped
char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_NmcNumberKeyTyped

    private void jTextField1_DrNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_DrNameKeyReleased
      validateDrName.setText("");
    }//GEN-LAST:event_jTextField1_DrNameKeyReleased

    private void jTextField2_PhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_PhoneNumberKeyReleased
validatePhoneNumber.setText("");
    }//GEN-LAST:event_jTextField2_PhoneNumberKeyReleased

    private void jTextField3_NmcNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_NmcNumberKeyReleased
validateNmcNumber.setText("");       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_NmcNumberKeyReleased

    private void jTextField4_EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_EmailKeyReleased
validateEmail.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_EmailKeyReleased

    private void jTextField5_AddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_AddressKeyReleased
validateAddress.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_AddressKeyReleased

    private void jTextField4_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_EmailActionPerformed

    private void jTextField1_DrNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_DrNameKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACKSPACE)||  c==KeyEvent.VK_DELETE ||c==KeyEvent.VK_SPACE))
        evt.consume();      
    }//GEN-LAST:event_jTextField1_DrNameKeyTyped

    private void jTextField2_PhoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_PhoneNumberKeyPressed
        // TODO add your handling code here:
         String contact =jTextField2_PhoneNumber.getText();
    int length =contact.length();
        char c = evt.getKeyChar();
   if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9'){
                if(length<10){
                    jTextField2_PhoneNumber.setEditable(true);
                }
                else{
                  jTextField2_PhoneNumber.setEditable(false);  
                }
                
            }
            else{
                if(evt.getExtendedKeyCode()== KeyEvent.VK_BACKSPACE|| evt.getExtendedKeyCode() == KeyEvent.VK_DELETE)
                {
                    jTextField2_PhoneNumber.setEditable(true);
                }
                        else{
                                jTextField2_PhoneNumber.setEditable(false);
                                }
            }
    }//GEN-LAST:event_jTextField2_PhoneNumberKeyPressed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        validateDate.setText("");
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jTextField5_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_AddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1_DrName;
    private javax.swing.JTextField jTextField2_PhoneNumber;
    private javax.swing.JTextField jTextField3_NmcNumber;
    private javax.swing.JTextField jTextField4_Email;
    private javax.swing.JTextField jTextField5_Address;
    private javax.swing.JLabel validateAddress;
    private javax.swing.JLabel validateDate;
    private javax.swing.JLabel validateDrName;
    private javax.swing.JLabel validateEmail;
    private javax.swing.JLabel validateNmcNumber;
    private javax.swing.JLabel validatePhoneNumber;
    // End of variables declaration//GEN-END:variables
}
