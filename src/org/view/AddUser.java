/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import com.sun.glass.events.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.controller.UserDAO;
import org.model.User;

/**
 *
 * @author Amil
 */
public class AddUser extends javax.swing.JInternalFrame {
DefaultTableModel model;
    /**
     * Creates new form AddUsers
     */
    public AddUser() {
        initComponents();
        jTextField1_Id.setVisible(false);
        jLabel2.setVisible(false);
          model =new DefaultTableModel(null,new String[]{"Id","fullName","email","userName","phone","isAdmin","address","dob"});
        jTable1.setModel(model);
    }
    public void loadData(){
    clearModel();
    UserDAO uDAO =new UserDAO();
   ArrayList<User> cList=uDAO.fetchData();
   for(int i=0;i<cList.size();i++){
       
  
   model.addRow(new Object[] {cList.get(i).getUserID(),cList.get(i).getFullname(),cList.get(i).getEmail(),cList.get(i).getUserName(),cList.get(i).getPhoneNumber(),cList.get(i).getIsAdmin(),cList.get(i).getAddress(),cList.get(i).getDob()});
   }
           }
public void clearModel(){
    int count =model.getRowCount();
    for(int i=0;i<count;i++){
        model.removeRow(0);
    }
}
public void clearLabel(){
    jLabel12_validationName.setText(""); 
   jLabel13_validationEmail.setText("");
    jLabel14_validationPhoneNumber.setText("");
    jLabel15_validationAddress.setText("");
    jLabel16_validationUserName.setText("");
    jLabel18_validationDob.setText(""); 
}
public void clearText(){
    jTextField1_Id.setText("");
        jTextField2_FullName.setText("");
        jTextField9_userName.setText("");
        jTextField6_Address.setText("");
        jTextField3_Email.setText("");
        jTextField4_PhoneNumber.setText("");
        jCheckBox1_Admin.setSelected(false);
        jDateChooser1.setCalendar(null);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jButton1_Update = new javax.swing.JButton();
        jTextField1_Id = new javax.swing.JTextField();
        jButton2_Delete = new javax.swing.JButton();
        jTextField2_FullName = new javax.swing.JTextField();
        jCheckBox1_Admin = new javax.swing.JCheckBox();
        jTextField3_Email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField4_PhoneNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9_userName = new javax.swing.JTextField();
        jTextField6_Address = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1_Save = new javax.swing.JButton();
        jButton2_Clear = new javax.swing.JButton();
        jLabel12_validationName = new javax.swing.JLabel();
        jLabel13_validationEmail = new javax.swing.JLabel();
        jLabel14_validationPhoneNumber = new javax.swing.JLabel();
        jLabel15_validationAddress = new javax.swing.JLabel();
        jLabel16_validationUserName = new javax.swing.JLabel();
        jLabel18_validationDob = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Dob");

        jButton1_Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_Update.setText("Update");
        jButton1_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_UpdateActionPerformed(evt);
            }
        });

        jTextField1_Id.setEditable(false);
        jTextField1_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_IdActionPerformed(evt);
            }
        });

        jButton2_Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_Delete.setText("Delete");
        jButton2_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_DeleteActionPerformed(evt);
            }
        });

        jTextField2_FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_FullNameActionPerformed(evt);
            }
        });
        jTextField2_FullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2_FullNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_FullNameKeyTyped(evt);
            }
        });

        jCheckBox1_Admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1_Admin.setText("Admin");
        jCheckBox1_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1_AdminActionPerformed(evt);
            }
        });

        jTextField3_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_EmailActionPerformed(evt);
            }
        });
        jTextField3_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3_EmailKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Show");
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4_PhoneNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4_PhoneNumberKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("User Name");

        jTextField9_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9_userNameActionPerformed(evt);
            }
        });
        jTextField9_userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9_userNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9_userNameKeyTyped(evt);
            }
        });

        jTextField6_Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6_AddressKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6_AddressKeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("User Information");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Full Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Phone Number");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Address");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("UserType");

        jButton1_Save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_Save.setText("Save");
        jButton1_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SaveActionPerformed(evt);
            }
        });

        jButton2_Clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_Clear.setText("Clear");
        jButton2_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_ClearActionPerformed(evt);
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
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(39, 39, 39))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(85, 85, 85)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12_validationName)
                                    .addComponent(jTextField2_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13_validationEmail)))
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4_PhoneNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15_validationAddress)
                                    .addComponent(jLabel14_validationPhoneNumber)
                                    .addComponent(jTextField6_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1_Admin))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16_validationUserName)
                            .addComponent(jTextField9_userName, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18_validationDob)))
                    .addComponent(jLabel1))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton2_Clear)
                .addGap(129, 129, 129)
                .addComponent(jButton1)
                .addGap(341, 341, 341)
                .addComponent(jButton2_Delete)
                .addGap(88, 88, 88)
                .addComponent(jButton1_Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1_Save)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14_validationPhoneNumber)
                    .addComponent(jLabel16_validationUserName))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField2_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField6_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15_validationAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1_Admin))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12_validationName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18_validationDob)))
                .addGap(11, 11, 11)
                .addComponent(jLabel13_validationEmail)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_Clear)
                    .addComponent(jButton1)
                    .addComponent(jButton2_Delete)
                    .addComponent(jButton1_Update)
                    .addComponent(jButton1_Save))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_IdActionPerformed

    private void jTextField2_FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_FullNameActionPerformed

    private void jTextField4_PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_PhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_PhoneNumberActionPerformed

    private void jButton1_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_UpdateActionPerformed
     
        
boolean error = false;

if(jTextField2_FullName.getText().trim().isEmpty()){
     jLabel12_validationName.setText("Name can  not be empty"); 
        error = true;
}
if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$",
        jTextField3_Email.getText()))){
      jLabel13_validationEmail.setText("email pattern  does not match");
         error = true;
}
if( jTextField4_PhoneNumber.getText().trim().isEmpty()){
    jLabel14_validationPhoneNumber.setText("Phone Number can not be empty ");
       error = true;
}
 if(jTextField6_Address.getText().trim().isEmpty()){
   jLabel15_validationAddress.setText("Address can not be empty");  
      error = true;
}
if(jTextField9_userName.getText().trim().isEmpty()){
   jLabel16_validationUserName.setText("UserName can not be empty");  
      error = true;
} 

 if(jDateChooser1.getDate() == null){
   jLabel18_validationDob.setText("date of birth  can not be empty"); 
      error = true;
}
if(error==false){
 int id=Integer.parseInt(jTextField1_Id.getText());
        String  fullname=jTextField2_FullName.getText();
        String email=jTextField3_Email.getText();
        String phoneNumber=jTextField4_PhoneNumber.getText();
        String address=jTextField6_Address.getText();
        boolean isAdmin=jCheckBox1_Admin.isSelected();
         String userName=jTextField9_userName.getText();
         Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(currentDate);
        LocalDate date1=LocalDate.now().plusMonths(6);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String futureDate =date1.format(formatter);    
       SimpleDateFormat date_format1 = new SimpleDateFormat("yyy-MM-dd");
        String dob = date_format1.format(jDateChooser1.getDate()); 
        if(new UserDAO().checkUser(jTextField9_userName.getText())|| new UserDAO().checkUser1(jTextField3_Email.getText())){
            JOptionPane.showMessageDialog(rootPane,"Dupicate entry");
        }
        else{
            

        User ob=new User();
        ob.setUserID(id);
       ob.setFullname(fullname);
       ob.setUserName(userName);
       ob.setIsAdmin(isAdmin);
       ob.setDob(dob);
        ob.setAddress(address);
        ob.setEmail(email);
        ob.setPhoneNumber(phoneNumber);
        UserDAO uDAO=new UserDAO();
       int result= uDAO.updateRecord(ob);
       if(result==1){
           JOptionPane.showMessageDialog(rootPane,"Update completed");
       }
       else{
           JOptionPane.showMessageDialog(rootPane,"Update fail");
       }
               }
        loadData();
        clearLabel();
        clearText();
}   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_UpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
loadData();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SaveActionPerformed
   boolean error = false;
   boolean error1 = false;
        
        if(jTextField1_Id.getText().equals("")==false){
      JOptionPane.showMessageDialog(null,"Please Clear All Fields First");
      return;
  }
if(jTextField2_FullName.getText().trim().isEmpty()){
     jLabel12_validationName.setText("Name can  not be empty"); 
        error = true;
}
if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$",
        jTextField3_Email.getText()))){
      jLabel13_validationEmail.setText("email pattern  does not match");
         error = true;
}
if( jTextField4_PhoneNumber.getText().trim().isEmpty()){
    jLabel14_validationPhoneNumber.setText("Phone Number can not be empty ");
       error = true;
}
 if(jTextField6_Address.getText().trim().isEmpty()){
   jLabel15_validationAddress.setText("Address can not be empty");  
      error = true;
}
if(jTextField9_userName.getText().trim().isEmpty()){
   jLabel16_validationUserName.setText("UserName can not be empty");  
      error = true;
} 

 if(jDateChooser1.getDate() == null){
   jLabel18_validationDob.setText("date of birth  can not be empty"); 
      error = true;
}
 if(error==false){
        String fullname=jTextField2_FullName.getText();;
    String userName=jTextField9_userName.getText();
     String address=jTextField6_Address.getText();
    String email=jTextField3_Email.getText(); 
     String phoneNumber=jTextField4_PhoneNumber.getText();
     boolean isAdmin =jCheckBox1_Admin.isSelected();
      Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(currentDate);   
       SimpleDateFormat date_format1 = new SimpleDateFormat("yyy-MM-dd");
        String dob = date_format1.format(jDateChooser1.getDate()); 
        if(dob.compareTo(date)>0){
      jLabel18_validationDob.setText("dob should not be occure after current date");
      error1=true;
  }
 

    if(error==false){
        //set this value into  model class "Category" object
        if(new UserDAO().checkUser(jTextField9_userName.getText())|| new UserDAO().checkUser1(jTextField3_Email.getText())){
            JOptionPane.showMessageDialog(rootPane,"Dupicate entry");
        }
        else{
       User ob=new User();
       ob.setFullname(fullname);
       ob.setUserName(userName);
       ob.setIsAdmin(isAdmin);
       ob.setDob(dob);
        ob.setAddress(address);
        ob.setEmail(email);
        ob.setPhoneNumber(phoneNumber);
        
        //hand over this model class object to  controller class
        UserDAO uDAO=new UserDAO();
        int result=uDAO.saveData(ob);
        if(result==1){
            JOptionPane.showMessageDialog(rootPane, "Record Save");
            
        }
        else{
             JOptionPane.showMessageDialog(rootPane, "Record not  Save");
        }
        }
        loadData();
        clearLabel();
        //empty Textfield
       clearText();
    }
 }
              // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_SaveActionPerformed

    private void jTextField9_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9_userNameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
jTextField1_Id.setVisible(true);
        jLabel5.setVisible(true);
        int row =jTable1.getSelectedRow();
        jTextField1_Id.setText(jTable1.getValueAt(row,0).toString());
        jTextField2_FullName.setText(jTable1.getValueAt(row,1).toString());
         jTextField3_Email.setText(jTable1.getValueAt(row,2).toString());
        jTextField9_userName.setText(jTable1.getValueAt(row,3).toString());
         jTextField4_PhoneNumber.setText(jTable1.getValueAt(row,4).toString());
        jCheckBox1_Admin.setSelected(Boolean.parseBoolean(jTable1.getValueAt(row,5).toString()));
        jTextField6_Address.setText(jTable1.getValueAt(row,6).toString());
   try {
            Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(jTable1.getValueAt(row,7).toString());
            jDateChooser1.setDate(date1);
        } catch (ParseException ex)
        {
            Logger.getLogger(AddMedicine.class.getName()).log(Level.SEVERE, null, ex);
        }    
    
                // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jCheckBox1_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1_AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1_AdminActionPerformed

    private void jButton2_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_ClearActionPerformed
// TODO add your handling code here:
jTextField1_Id.setVisible(false);
        jLabel5.setVisible(false);
clearLabel();
clearText();
    }//GEN-LAST:event_jButton2_ClearActionPerformed

    private void jButton2_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2_DeleteActionPerformed

    private void jTextField2_FullNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_FullNameKeyTyped
     char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACKSPACE)||  c==KeyEvent.VK_DELETE ||c==KeyEvent.VK_SPACE ))
        evt.consume();    // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_FullNameKeyTyped

    private void jTextField2_FullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_FullNameKeyReleased
       jLabel12_validationName.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_FullNameKeyReleased

    private void jTextField3_EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_EmailKeyReleased
        jLabel13_validationEmail.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_EmailKeyReleased

    private void jTextField4_PhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_PhoneNumberKeyTyped
         char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        } 
    }//GEN-LAST:event_jTextField4_PhoneNumberKeyTyped

    private void jTextField4_PhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_PhoneNumberKeyReleased
      jLabel14_validationPhoneNumber.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_PhoneNumberKeyReleased

    private void jTextField6_AddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_AddressKeyReleased
      jLabel15_validationAddress.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6_AddressKeyReleased

    private void jTextField9_userNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_userNameKeyReleased
       jLabel16_validationUserName.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9_userNameKeyReleased

    private void jTextField3_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_EmailActionPerformed

    private void jTextField6_AddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_AddressKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6_AddressKeyTyped

    private void jTextField9_userNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_userNameKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACKSPACE)||  c==KeyEvent.VK_DELETE ||Character.isDigit(c) ))
        evt.consume();  
    }//GEN-LAST:event_jTextField9_userNameKeyTyped

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
         if(jDateChooser1.getDate()!=null){
            

        jLabel18_validationDob.setText("");  
                }
    }//GEN-LAST:event_jDateChooser1PropertyChange

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_Save;
    private javax.swing.JButton jButton1_Update;
    private javax.swing.JButton jButton2_Clear;
    private javax.swing.JButton jButton2_Delete;
    private javax.swing.JCheckBox jCheckBox1_Admin;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12_validationName;
    private javax.swing.JLabel jLabel13_validationEmail;
    private javax.swing.JLabel jLabel14_validationPhoneNumber;
    private javax.swing.JLabel jLabel15_validationAddress;
    private javax.swing.JLabel jLabel16_validationUserName;
    private javax.swing.JLabel jLabel18_validationDob;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1_Id;
    private javax.swing.JTextField jTextField2_FullName;
    private javax.swing.JTextField jTextField3_Email;
    private javax.swing.JTextField jTextField4_PhoneNumber;
    private javax.swing.JTextField jTextField6_Address;
    private javax.swing.JTextField jTextField9_userName;
    // End of variables declaration//GEN-END:variables
}
