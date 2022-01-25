/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import com.ibm.icu.text.SimpleDateFormat;
import com.sun.glass.events.KeyEvent;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javafx.scene.chart.PieChart;
import javax.swing.JOptionPane;
import org.controller.UserDAO;
import org.model.User;
import static org.util.Util.*;

/**
 *
 * @author Amil
 */
public class UserInfo extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserInfo1
     */
    public UserInfo() {
        initComponents();
        loadData();
    }
    public void loadData(){
         UserDAO uDAO =new UserDAO();
         User ob=uDAO.fetchData(userID);
         jTextField2_FullName.setText(ob.getFullname());
         jTextField3_Email.setText(ob.getEmail());
         jTextField4_PhoneNumber.setText(ob.getPhoneNumber());
         
         jTextField6_Address.setText(ob.getAddress());
          try {
            Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(ob.getDob());
            jDateChooser1.setDate(date1);
        } catch (ParseException ex) {
            Logger.getLogger(AddMedicine.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         jTextField9_userName.setText(ob.getUserName());
         
         
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2_FullName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField3_Email = new javax.swing.JTextField();
        jTextField4_PhoneNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField9_userName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField6_Address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2_fullName = new javax.swing.JLabel();
        jLabel8_userName = new javax.swing.JLabel();
        jLabel11_password = new javax.swing.JLabel();
        jLabel12_email = new javax.swing.JLabel();
        jLabel13_phoneNumber = new javax.swing.JLabel();
        jLabel14_address = new javax.swing.JLabel();
        jLabel15_Dob = new javax.swing.JLabel();

        setClosable(true);

        jTextField2_FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_FullNameActionPerformed(evt);
            }
        });
        jTextField2_FullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2_FullNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2_FullNameKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField4_PhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_PhoneNumberActionPerformed(evt);
            }
        });
        jTextField4_PhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4_PhoneNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4_PhoneNumberKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("User Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Full Name");

        jTextField9_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9_userNameActionPerformed(evt);
            }
        });
        jTextField9_userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9_userNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9_userNameKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jTextField6_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6_AddressActionPerformed(evt);
            }
        });
        jTextField6_Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6_AddressKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6_AddressKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Phone Number");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Password");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("User Information");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Dob");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Address");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
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
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3_Email)
                            .addComponent(jButton1)
                            .addComponent(jTextField6_Address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4_PhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField9_userName)
                            .addComponent(jTextField2_FullName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2_fullName)
                    .addComponent(jLabel8_userName)
                    .addComponent(jLabel11_password)
                    .addComponent(jLabel12_email)
                    .addComponent(jLabel13_phoneNumber)
                    .addComponent(jLabel14_address)
                    .addComponent(jLabel15_Dob))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_fullName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8_userName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11_password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13_phoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14_address))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15_Dob))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2_FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_FullNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
boolean error=false,error1=false;
   
         if(jTextField2_FullName.getText().trim().isEmpty()){
             jLabel2_fullName.setText("Name can not be empty");
             error =  true;
         }
         if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jTextField3_Email.getText())))
  {
        jLabel12_email.setText("email pattern  doesnot match ");
      error=true;
  }
   if(!(Pattern.matches("^[9]{1}+[8]{1}+[0-9]+$", jTextField4_PhoneNumber.getText()))){
    jLabel13_phoneNumber.setText("Number must start  with  98");
    error=true;
    
}

if(jPasswordField1.getText().trim().isEmpty()){  
    jLabel11_password.setText("Pasword should not be empty");
    error=true;
}
if(jDateChooser1.getDate()==null){
    jLabel15_Dob.setText("Date should not be empty");
   error=true; 
}

if(jTextField6_Address.getText().trim().isEmpty()){
    jLabel14_address.setText("Address Should not be empty");
    error=true;
}
if(jTextField9_userName.getText().trim().isEmpty()){
    jLabel8_userName.setText("User Name can not be empty");
}

if(error==false){
    String  fullname=jTextField2_FullName.getText();
        String email=jTextField3_Email.getText();
        String phoneNumber=jTextField4_PhoneNumber.getText();
            int length =phoneNumber.length();
        String  password=jPasswordField1.getText();
        
        String address=jTextField6_Address.getText();
         String userName=jTextField9_userName.getText();
         Date currentDate= new Date();
         SimpleDateFormat cd= new SimpleDateFormat("yyyy-MM-dd");
         String date=cd.format(currentDate);
         String dob =cd.format(jDateChooser1.getDate());
         if(length<10){
    jLabel13_phoneNumber.setText("number must of 10 digit");
    error1=true;
}
         if(dob.compareTo(date)> 0){
      jLabel15_Dob.setText("Date of birth should not came after current date");
      error1=true;
  }
     if(error1==false){
         
        User ob=new User();
        ob.setUserID(userID);
       ob.setFullname(fullname);
       ob.setUserName(userName);
       ob.setPassword(password);
       ob.setDob(dob);
        ob.setAddress(address);
        ob.setEmail(email);
        ob.setPhoneNumber(phoneNumber);
        UserDAO uDAO=new UserDAO();
        uDAO.updateRecord1(ob);
        loadData();
int result = uDAO.updateRecord(ob);
if(result==1){
    JOptionPane.showMessageDialog(rootPane,"update sucess");
}
else{
JOptionPane.showMessageDialog(rootPane,"update fail");
}
     }
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4_PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_PhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_PhoneNumberActionPerformed

    private void jTextField9_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9_userNameActionPerformed

    private void jTextField6_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6_AddressActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        jLabel15_Dob.setText("");
        
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jTextField4_PhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_PhoneNumberKeyReleased
        // TODO add your handling code here:
        jLabel13_phoneNumber.setText("");
    }//GEN-LAST:event_jTextField4_PhoneNumberKeyReleased

    private void jTextField4_PhoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_PhoneNumberKeyPressed
        // TODO add your handling code here:
         String contact =jTextField4_PhoneNumber.getText();
    int length =contact.length();
        char c = evt.getKeyChar();
   if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9'){
                if(length<10){
                    jTextField4_PhoneNumber.setEditable(true);
                }
                else{
                  jTextField4_PhoneNumber.setEditable(false);  
                }
                
            }
            else{
                if(evt.getExtendedKeyCode()== KeyEvent.VK_BACKSPACE|| evt.getExtendedKeyCode() == KeyEvent.VK_DELETE)
                {
                    jTextField4_PhoneNumber.setEditable(true);
                }
                        else{
                                jTextField4_PhoneNumber.setEditable(false);
                                }
            }
    }//GEN-LAST:event_jTextField4_PhoneNumberKeyPressed

    private void jTextField2_FullNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_FullNameKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACKSPACE)||  c==KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE))
        evt.consume();
    }//GEN-LAST:event_jTextField2_FullNameKeyPressed

    private void jTextField2_FullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_FullNameKeyReleased
        // TODO add your handling code here:
        jLabel2_fullName.setText("");
    }//GEN-LAST:event_jTextField2_FullNameKeyReleased

    private void jTextField9_userNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_userNameKeyReleased
        // TODO add your handling code here:
        jLabel8_userName.setText("");
    }//GEN-LAST:event_jTextField9_userNameKeyReleased

    private void jTextField9_userNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_userNameKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACKSPACE)||  c==KeyEvent.VK_DELETE ||Character.isDigit(c)))
        evt.consume();
    }//GEN-LAST:event_jTextField9_userNameKeyPressed

    private void jTextField6_AddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_AddressKeyReleased
        // TODO add your handling code here:
        jLabel14_address.setText("");
    }//GEN-LAST:event_jTextField6_AddressKeyReleased

    private void jTextField6_AddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_AddressKeyPressed
        // TODO add your handling code here:
         char c=evt.getKeyChar();
         if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACKSPACE)||  c==KeyEvent.VK_DELETE ||Character.isDigit(c) || c== KeyEvent.VK_SPACE))
        evt.consume();
    
    }//GEN-LAST:event_jTextField6_AddressKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11_password;
    private javax.swing.JLabel jLabel12_email;
    private javax.swing.JLabel jLabel13_phoneNumber;
    private javax.swing.JLabel jLabel14_address;
    private javax.swing.JLabel jLabel15_Dob;
    private javax.swing.JLabel jLabel2_fullName;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8_userName;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2_FullName;
    private javax.swing.JTextField jTextField3_Email;
    private javax.swing.JTextField jTextField4_PhoneNumber;
    private javax.swing.JTextField jTextField6_Address;
    private javax.swing.JTextField jTextField9_userName;
    // End of variables declaration//GEN-END:variables
}