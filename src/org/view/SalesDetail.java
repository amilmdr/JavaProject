/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.controller.PaymentDAO;
import org.controller.PrescriptionDAO;
import org.controller.SalesDAO;
import org.controller.SalesItemDAO;
import org.model.Payments;
import org.model.Prescription;
import org.model.Sales;
import org.model.SalesItem;

/**
 *
 * @author Amil
 */
public class SalesDetail extends javax.swing.JInternalFrame {

    DefaultTableModel model;
    DefaultTableModel model1;
    DefaultTableModel model2;
    DefaultTableModel model3;

    public SalesDetail() {
        initComponents();

        model = new DefaultTableModel(null, new String[]{"salesId", "date", "discount", "customerName", "phoneNumber", "prescriptionId"});
        jTable1_Sales.setModel(model);
        model1 = new DefaultTableModel(null, new String[]{"salesItemId", "batchID", "quantity", "SellingPricePerUnits", "medicineId"});
        jTable2_SalesItem.setModel(model1);
        model2 = new DefaultTableModel(null, new String[]{"paymentsId", "amount", "Date"});
        jTable3_Payment.setModel(model2);
        model3 = new DefaultTableModel(null, new String[]{"PrescriptionId", "DrName", "PhoneNumber", "NmcNumber", "Email", "Address", "Date"});
        jTable1_prescription.setModel(model3);
        loadData();
    }

    public void loadData() {
        SalesDAO sDAO = new SalesDAO();
        ArrayList<Sales> cList = sDAO.fetchData();
        for (int i = 0; i < cList.size(); i++) {
            model.addRow(new Object[]{cList.get(i).getSalesId(),
                cList.get(i).getDate(),
                cList.get(i).getDiscount(),
                cList.get(i).getCustomerName(),
                cList.get(i).getPhoneNumber(),
                cList.get(i).getPrescriptionId()});
        }

    }

    public void clearModel() {
        int count = model1.getRowCount();
        for (int i = 0; i < count; i++) {
            model1.removeRow(0);
        }
    }

    public void clearModel2() {
        int count = model2.getRowCount();
        for (int i = 0; i < count; i++) {
            model2.removeRow(0);
        }
    }

    public void clearModel3() {
        int count = model3.getRowCount();
        for (int i = 0; i < count; i++) {
            model3.removeRow(0);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_Sales = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2_SalesItem = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3_Payment = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1_prescription = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);

        jTable1_Sales.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1_Sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1_Sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_SalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_Sales);

        jTable2_SalesItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable2_SalesItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2_SalesItem);

        jTable3_Payment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable3_Payment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3_Payment);

        jTable1_prescription.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1_prescription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1_prescription);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sales");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SalesItem");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Payment");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Prescription");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                                .addComponent(jScrollPane3))
                            .addComponent(jLabel3))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1_SalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_SalesMouseClicked
        clearModel();
        int row = jTable1_Sales.getSelectedRow();
        int id = Integer.parseInt(jTable1_Sales.getValueAt(row, 0).toString());
        SalesItemDAO slDAO = new SalesItemDAO();
        ArrayList<SalesItem> slList = slDAO.fetchData(id);
        for (int i = 0; i < slList.size(); i++) {
            model1.addRow(new Object[]{slList.get(i).getSalesItemId(),
                slList.get(i).getBatchID(),
                slList.get(i).getQuantity(),
                slList.get(i).getSellingPricePerUnits(),
                slList.get(i).getMedicineId()});

        }
        clearModel2();
        PaymentDAO pDAO = new PaymentDAO();
        ArrayList<Payments> pList = pDAO.fetchData(id);
        for (int i = 0; i < pList.size(); i++) {
            model2.addRow(new Object[]{pList.get(i).getPaymentsId(),
                pList.get(i).getAmount(),
                pList.get(i).getDate()
            });
        }
        clearModel3();
        PrescriptionDAO paDAO = new PrescriptionDAO();
        ArrayList<Prescription> paList = paDAO.fetchData(id);
        for (int i = 0; i < paList.size(); i++) {
            model3.addRow(new Object[]{paList.get(i).getPrescriptionId(),
                paList.get(i).getDrName(),
                paList.get(i).getPhoneNumber(),
                paList.get(i).getNmcNumber(),
                paList.get(i).getEmail(),
                paList.get(i).getAddress(),
                paList.get(i).getDate()});
        }


    }//GEN-LAST:event_jTable1_SalesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1_Sales;
    private javax.swing.JTable jTable1_prescription;
    private javax.swing.JTable jTable2_SalesItem;
    private javax.swing.JTable jTable3_Payment;
    // End of variables declaration//GEN-END:variables
}
