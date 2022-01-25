/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import com.sun.glass.events.KeyEvent;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.controller.SupplierDAO;
import org.model.Suppliers;

/**
 *
 * @author Amil
 */
public class AddSuppliers extends javax.swing.JInternalFrame {
    DefaultTableModel model;
    public AddSuppliers() {
        
        initComponents();
        jTextField1_id.setVisible(false);
        jLabel2.setVisible(false);
         model =new DefaultTableModel(null,new String[]{"id","Name","Address","Email","phoneNumber"});
        jTable1.setModel(model);
    }
public void loadData(){
    clearModel();
    SupplierDAO sDAO =new SupplierDAO();
   ArrayList<Suppliers> cList=sDAO.fetchData();
   for(int i=0;i<cList.size();i++){
       
  
   model.addRow(new Object[] {cList.get(i).getSupplierID(),cList.get(i).getName(),cList.get(i).getAddress(),cList.get(i).getEmail(),cList.get(i).getPhoneNumber()});
            }
           }
public void clearModel(){
    int count =model.getRowCount();
    for(int i=0;i<count;i++){
        model.removeRow(0);
    }    
}
public void clearLabel(){
     jLabel7_EmailErrorMesage.setText("");
     jLabel7_nameValidation.setText("");
     jLabel8_addressValidation.setText("");
     jLabel9_numberValidation.setText("");
    }
public void clearText(){
   jTextField1_id.setText("");
        jTextField2_Name.setText("");
        jTextField3_Address.setText("");
        jTextField4_Email.setText("");
        jTextField5_PhoneNumber.setText(""); 
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1_Save = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1_Update = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2_Delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1_id = new javax.swing.JTextField();
        jTextField2_Name = new javax.swing.JTextField();
        jTextField3_Address = new javax.swing.JTextField();
        jTextField4_Email = new javax.swing.JTextField();
        jTextField5_PhoneNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2_Clear = new javax.swing.JButton();
        jLabel7_EmailErrorMesage = new javax.swing.JLabel();
        jLabel7_nameValidation = new javax.swing.JLabel();
        jLabel8_addressValidation = new javax.swing.JLabel();
        jLabel9_numberValidation = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        jButton1_Save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_Save.setText("Save");
        jButton1_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SaveActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address");

        jButton1_Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_Update.setText("Update");
        jButton1_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_UpdateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        jButton2_Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_Delete.setText("Delete");
        jButton2_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_DeleteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Phone Number");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1_id.setEditable(false);
        jTextField1_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_idActionPerformed(evt);
            }
        });

        jTextField2_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2_NameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_NameKeyTyped(evt);
            }
        });

        jTextField3_Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3_AddressKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3_AddressKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_AddressKeyTyped(evt);
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

        jTextField5_PhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5_PhoneNumberActionPerformed(evt);
            }
        });
        jTextField5_PhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5_PhoneNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5_PhoneNumberKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Supplyers Information");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Id");

        jButton2_Clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_Clear.setText("Clear");
        jButton2_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8_addressValidation)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7_nameValidation)
                                            .addComponent(jTextField2_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                            .addComponent(jTextField3_Address)
                                            .addComponent(jTextField1_id))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField4_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                            .addComponent(jLabel9_numberValidation)
                                            .addComponent(jLabel7_EmailErrorMesage)
                                            .addComponent(jTextField5_PhoneNumber)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2_Clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2_Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_Update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1_Save)
                        .addGap(39, 39, 39)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7_EmailErrorMesage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(19, 19, 19)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7_nameValidation)
                    .addComponent(jLabel9_numberValidation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8_addressValidation)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_Save)
                    .addComponent(jButton1_Update)
                    .addComponent(jButton2_Delete)
                    .addComponent(jButton1)
                    .addComponent(jButton2_Clear))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_DeleteActionPerformed
       if(!jTextField1_id.getText().trim().isEmpty()){
   int answer = JOptionPane.showConfirmDialog(rootPane,"Are you Sure???", "Conformation", JOptionPane.YES_NO_OPTION);
if (answer==0){
        int id=Integer.parseInt(jTextField1_id.getText());
        Suppliers ob=new Suppliers();
        ob.setSupplierID(id);
        SupplierDAO sDAO=new SupplierDAO();
       int result = sDAO.deleteRecord(ob);
        if(result==1){
            JOptionPane.showMessageDialog(rootPane,"Medicine delete");
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Cannot delete a parent row: a foreign key constraint fails");
        }
        loadData();
        clearText();
}
       }
       else{
           JOptionPane.showMessageDialog(rootPane,"Please select Suppliers First");
       }
    }//GEN-LAST:event_jButton2_DeleteActionPerformed

    private void jButton1_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_UpdateActionPerformed
boolean error=false;
String contact =jTextField5_PhoneNumber.getText();
    int length =contact.length();
  if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jTextField4_Email.getText())))
  {
        jLabel7_EmailErrorMesage.setText("email pattern  doesnot match ");
      error=true;
  }
  if(jTextField2_Name.getText().trim().isEmpty()){
    jLabel7_nameValidation.setText("Name can not be empty");
    error=true;
  }
 if(jTextField3_Address.getText().trim().isEmpty()){
   jLabel8_addressValidation.setText("Address can  not be empty ");   
   error=true;
  }
if(jTextField5_PhoneNumber.getText().trim().isEmpty()){
   jLabel9_numberValidation.setText("number can not be empty"); 
   error=true;
   
  }
if(length<10){
    jLabel9_numberValidation.setText("number must of 10 digit");
    error=true;
}

if(error==false){
    int id=Integer.parseInt(jTextField1_id.getText());

        String name =jTextField2_Name.getText();
        String address=jTextField3_Address.getText();
        String eamil=jTextField4_Email.getText();
        String phoneNumber =jTextField5_PhoneNumber.getText();
        if(new SupplierDAO().checkSupplier((jTextField4_Email.getText()),jTextField5_PhoneNumber.getText())){
            JOptionPane.showMessageDialog(rootPane,"Duplicate Email and phone number");
        }
        else{
        Suppliers ob=new Suppliers();
        ob.setSupplierID(id);
        ob.setName(name);
        ob.setAddress(address);
        ob.setEmail(eamil);
        ob.setPhoneNumber(phoneNumber);
        SupplierDAO sDAO=new SupplierDAO();
        int result=sDAO.updateRecord(ob);
        if(result==1){
           JOptionPane.showMessageDialog(rootPane,"Record Update");
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Record not Update");
        }
        }
        loadData();
        clearLabel();
        clearText();
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_UpdateActionPerformed

    private void jButton1_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SaveActionPerformed
  boolean error=false;
   String contact =jTextField5_PhoneNumber.getText();
    int length =contact.length();
 if(jTextField1_id.getText().equals("")==false){
      JOptionPane.showMessageDialog(null,"Please Clear All Fields First");
      return;
      
  }
  if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jTextField4_Email.getText())))
  {
        jLabel7_EmailErrorMesage.setText("email pattern  doesnot match ");
      error=true;
  }
  if(jTextField2_Name.getText().trim().isEmpty()){
    jLabel7_nameValidation.setText("Name can not be empty");
    error=true;
  }
 if(jTextField3_Address.getText().trim().isEmpty()){
   jLabel8_addressValidation.setText("Address can  not be empty ");   
   error=true;
  }
if(jTextField5_PhoneNumber.getText().trim().isEmpty()){
   jLabel9_numberValidation.setText("number can not be empty"); 
   error=true;
   
  }
if(!(Pattern.matches("^[9]{1}+[8]{1}+[0-9]+$", jTextField5_PhoneNumber.getText()))){
    jLabel9_numberValidation.setText("Number must start  with  98");
    error=true;
    jTextField5_PhoneNumber.setEditable(true);
}
if(length<10){
    jLabel9_numberValidation.setText("number must of 10 digit");
    error=true;
}
  
  if(error==false){
        String name =jTextField2_Name.getText();
        String address=jTextField3_Address.getText();
        String eamil=jTextField4_Email.getText();
        String phoneNumber =jTextField5_PhoneNumber.getText();
        //set this value into  model class "Category" object
        Suppliers ob=new Suppliers();
        if(new SupplierDAO().checkSupplier((jTextField4_Email.toString()),jTextField5_PhoneNumber.toString())){
            JOptionPane.showMessageDialog(rootPane,"Duplicate Email and phone number");
        }
        else{
        ob.setName(name);
        ob.setAddress(address);
        ob.setEmail(eamil);
        ob.setPhoneNumber(phoneNumber);
        //hand over this model class object to  controller class
        SupplierDAO sDAO=new SupplierDAO();
        int result =sDAO.saveData(ob);
        if(result==1){
            JOptionPane.showMessageDialog(rootPane,"Record Save");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Record not Save");
        }
        }
        loadData();
        //empty Textfield
       clearLabel();
       clearText();
  }
    }//GEN-LAST:event_jButton1_SaveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         jTextField1_id.setVisible(true);
        jLabel2.setVisible(true);
        int row =jTable1.getSelectedRow();
        jTextField1_id.setText(jTable1.getValueAt(row,0).toString());
        jTextField2_Name.setText(jTable1.getValueAt(row,1).toString());
        jTextField3_Address.setText(jTable1.getValueAt(row,2).toString());
        jTextField4_Email.setText(jTable1.getValueAt(row,3).toString());
        jTextField5_PhoneNumber.setText(jTable1.getValueAt(row,4).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField4_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_EmailActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_EmailActionPerformed

    private void jTextField1_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_idActionPerformed

    private void jButton2_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_ClearActionPerformed
  // TODO add your handling code here:
   jTextField1_id.setVisible(false);
        jLabel2.setVisible(false);
       clearLabel();
       clearText();       
    }//GEN-LAST:event_jButton2_ClearActionPerformed

    private void jTextField2_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_NameKeyTyped
 char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACKSPACE)||  c==KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE))
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_NameKeyTyped

    private void jTextField2_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_NameKeyReleased
jLabel7_nameValidation.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_NameKeyReleased

    private void jTextField3_AddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_AddressKeyReleased
      jLabel8_addressValidation.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_AddressKeyReleased

    private void jTextField4_EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_EmailKeyReleased
jLabel7_EmailErrorMesage.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_EmailKeyReleased

    private void jTextField5_PhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_PhoneNumberKeyReleased
     jLabel9_numberValidation.setText("");   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_PhoneNumberKeyReleased

    private void jTextField3_AddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_AddressKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField3_AddressKeyTyped

    private void jTextField5_PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5_PhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_PhoneNumberActionPerformed

    private void jTextField5_PhoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_PhoneNumberKeyPressed
        // TODO add your handling code here:
         String contact =jTextField5_PhoneNumber.getText();
    int length =contact.length();
        char c = evt.getKeyChar();
   if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9'){
                if(length<10){
                    jTextField5_PhoneNumber.setEditable(true);
                }
                else{
                  jTextField5_PhoneNumber.setEditable(false);  
                }
                
            }
            else{
                if(evt.getExtendedKeyCode()== KeyEvent.VK_BACKSPACE|| evt.getExtendedKeyCode() == KeyEvent.VK_DELETE)
                {
                    jTextField5_PhoneNumber.setEditable(true);
                }
                        else{
                                jTextField5_PhoneNumber.setEditable(false);
                                }
            }
    }//GEN-LAST:event_jTextField5_PhoneNumberKeyPressed

    private void jTextField3_AddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_AddressKeyPressed
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACKSPACE)||  c==KeyEvent.VK_DELETE ||Character.isDigit(c) ||  c==KeyEvent.VK_BACKSPACE ))
        evt.consume();  
    }//GEN-LAST:event_jTextField3_AddressKeyPressed

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
            java.util.logging.Logger.getLogger(AddSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSuppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_Save;
    private javax.swing.JButton jButton1_Update;
    private javax.swing.JButton jButton2_Clear;
    private javax.swing.JButton jButton2_Delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7_EmailErrorMesage;
    private javax.swing.JLabel jLabel7_nameValidation;
    private javax.swing.JLabel jLabel8_addressValidation;
    private javax.swing.JLabel jLabel9_numberValidation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1_id;
    private javax.swing.JTextField jTextField2_Name;
    private javax.swing.JTextField jTextField3_Address;
    private javax.swing.JTextField jTextField4_Email;
    private javax.swing.JTextField jTextField5_PhoneNumber;
    // End of variables declaration//GEN-END:variables
}
