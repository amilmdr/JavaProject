package org.view;
import com.sun.glass.events.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.controller.MedicineDAO;
import org.controller.PaymentDAO;
import org.controller.PrescriptionDAO;
import org.controller.SalesItemDAO;
import org.controller.SalesDAO;
import org.model.Medicine;
import org.model.Payments;
import org.model.Prescription;
import org.model.Sales;
import org.model.SalesItem;

/**
 *
 * @author Amil
 */
public class Transaction extends javax.swing.JInternalFrame {

    DefaultTableModel model;
    DefaultTableModel model1;
    PrescriptionView pres = new PrescriptionView();
    boolean pescriptionStatus1=false;

    public Transaction() {
        initComponents();
        model = new DefaultTableModel(null, new String[]{"medicineId", "genericName", "specificName", "batchId", "chemicalComposition",
            "CostPricePerUnit", "SellingPricePerUnits", "expDate", "mfgDate", "dose", "Quantity", "pescriptionStatus", "typesID"});
        jTable1.setModel(model);
        model1 = new DefaultTableModel(null, new String[]{"medicineId", "batchId", "SellingPricePerUnits", "Quantity", "Amount"});
        jTable2.setModel(model1);
        loadData();
        loadColumn();

    }

    public void loadColumn() {
        MedicineDAO mDAO = new MedicineDAO();
        ArrayList<String> column = mDAO.fetchData1();
        for (int i = 0; i < column.size(); i++) {
            jComboBox_Column.addItem(column.get(i));
        }

    }

    public void loadData() {
        clearModel();
        MedicineDAO mDAO = new MedicineDAO();
        ArrayList<Medicine> cList = mDAO.fetchData();
        for (int i = 0; i < cList.size(); i++) {

            model.addRow(new Object[]{cList.get(i).getMedicineId(), cList.get(i).getGenericName(), cList.get(i).getSpecificName(), cList.get(i).getBatchId(), cList.get(i).getChemicalComposition(),
                cList.get(i).getCostPricePerUnit(), cList.get(i).getSellingPricePerUnits(), cList.get(i).getExpDate(), cList.get(i).getMfgDate(), cList.get(i).getDose(),
                cList.get(i).getQuantity(), cList.get(i).getPescriptionStatus(), cList.get(i).getTypesID()});
        }
    }
    public void SearchData(){
        clearModel();
         MedicineDAO mDAO = new MedicineDAO();
       
    }

    public double totalAmount(double SellingPricePerUnits, int qty) {

        double amt = qty * SellingPricePerUnits;
        return amt;
    }

    public void loadAmount() {
        int c = model1.getRowCount();
        double amt1 = 0, amt;
        for (int i = 0; i < c; i++) {
            amt = Double.parseDouble(jTable2.getValueAt(i, 4).toString());
            amt1 += amt;
        }
        jTextField2_amount.setText(amt1 + "");

        double Discount = jTextField3_DiscountPercent.getText().equals("")
                ? 0
                : Double.parseDouble(jTextField3_DiscountPercent.getText().toString());
        //double amt1 = Double.parseDouble(jTextField2_amount.getText().toString());
        double discountAmount = Discount / 100 * amt1;
        double amountToReceived = amt1 - discountAmount;
        jTextField4_DiscountAmount.setText(discountAmount + "");
        jTextField5_amountToReceived.setText(amountToReceived + "");
    }

    public void clearModel() {
        int count = model.getRowCount();
        for (int i = 0; i < count; i++) {
            model.removeRow(0);
        }
    }

    public void clearModel1() {
        int count = model1.getRowCount();
        for (int i = 0; i < count; i++) {
            model1.removeRow(0);
        }
    }
   static Prescription ob5 ;
     public static  void getPrescription(Prescription p)
               {
                   ob5 = p ;    
               }
     public void clearText(){
    jTextArea1_ChemicalComposition.setText("");
    jTextField1_Search.setText("");
    jTextField2_Name.setText("");
    jTextField3_DiscountPercent.setText("0");
    jTextField4_DiscountAmount.setText("");
    jTextField5_amountToReceived.setText("");
    jTextField6_AmountReceived.setText("");
    jTextField7_amountToReturn.setText("");
    jTextField3_PhoneNumber.setText("");
    jTextField2_amount.setText("");
}
     public void clearLabel(){
         validateAmountReceived.setText("");
         validateDiscount.setText("");
         validateName.setText("");
         validatePhoneNumber.setText("");
     }
 
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_ChemicalComposition = new javax.swing.JTextArea();
        jComboBox_Column = new javax.swing.JComboBox<>();
        jTextField1_Search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2_Delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2_amount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3_DiscountPercent = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4_DiscountAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5_amountToReceived = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField6_AmountReceived = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField7_amountToReturn = new javax.swing.JTextField();
        jButton5_Save = new javax.swing.JButton();
        jButton6_AddPrescription = new javax.swing.JButton();
        jButton2_update = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2_Name = new javax.swing.JTextField();
        jTextField3_PhoneNumber = new javax.swing.JTextField();
        validateAmountReceived = new javax.swing.JLabel();
        validateName = new javax.swing.JLabel();
        validateDiscount = new javax.swing.JLabel();
        validatePhoneNumber = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));

        jTextArea1_ChemicalComposition.setEditable(false);
        jTextArea1_ChemicalComposition.setColumns(20);
        jTextArea1_ChemicalComposition.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jTextArea1_ChemicalComposition.setRows(5);
        jScrollPane1.setViewportView(jTextArea1_ChemicalComposition);

        jComboBox_Column.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_Column.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ColumnActionPerformed(evt);
            }
        });

        jTextField1_Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_SearchActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Add Quantity ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2_Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_Delete.setText("Delete");
        jButton2_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_DeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Amount ");

        jTextField2_amount.setEditable(false);
        jTextField2_amount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_amountActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Discount %");

        jTextField3_DiscountPercent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3_DiscountPercent.setText("0");
        jTextField3_DiscountPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_DiscountPercentActionPerformed(evt);
            }
        });
        jTextField3_DiscountPercent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3_DiscountPercentKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_DiscountPercentKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Discount Amount");

        jTextField4_DiscountAmount.setEditable(false);
        jTextField4_DiscountAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4_DiscountAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_DiscountAmountActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Amount to Received");

        jTextField5_amountToReceived.setEditable(false);
        jTextField5_amountToReceived.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5_amountToReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5_amountToReceivedActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Amount Received ");

        jTextField6_AmountReceived.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField6_AmountReceived.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6_AmountReceivedKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6_AmountReceivedKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Amount to be Return");

        jTextField7_amountToReturn.setEditable(false);
        jTextField7_amountToReturn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7_amountToReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7_amountToReturnActionPerformed(evt);
            }
        });

        jButton5_Save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5_Save.setText("Save");
        jButton5_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_SaveActionPerformed(evt);
            }
        });

        jButton6_AddPrescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6_AddPrescription.setText("Add Prescription");
        jButton6_AddPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_AddPrescriptionActionPerformed(evt);
            }
        });

        jButton2_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_update.setText("Update");
        jButton2_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_updateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Phone Number");

        jTextField2_Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2_NameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2_NameKeyReleased(evt);
            }
        });

        jTextField3_PhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3_PhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3_PhoneNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3_PhoneNumberKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox_Column, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(jButton2_update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2_Delete))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField2_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                    .addComponent(jTextField5_amountToReceived)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel1)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField6_AmountReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(validateAmountReceived)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6_AddPrescription)
                                .addGap(141, 141, 141))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5_Save)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTextField3_DiscountPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jTextField4_DiscountAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(validateDiscount))
                                                    .addComponent(jLabel3)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField7_amountToReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6)))
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(validatePhoneNumber)
                                            .addComponent(validateName))))
                                .addGap(40, 40, 40))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Column, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2_update)
                            .addComponent(jButton2_Delete)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField6_AmountReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validateAmountReceived))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5_amountToReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jButton6_AddPrescription)
                                    .addComponent(jButton5_Save))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7_amountToReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jTextField3_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(validatePhoneNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3_DiscountPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4_DiscountAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(validateDiscount))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(23, 23, 23)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validateName)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jTable1.getSelectionModel().isSelectionEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Please select Medicine First");

        }
        else 
        {
            int row1 = jTable1.getSelectedRow();
            String date = jTable1.getValueAt(row1, 7).toString();
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = dateFormat.format(currentDate);
            if (date.compareTo(date1) < 0) {
                JOptionPane.showMessageDialog(rootPane, "Medicine Expire");
            }
            else 
            {

                try {
                    int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity"));
                    if (qty != 0) 
                    {

                        int row = jTable1.getSelectedRow();
                        int qty2 = Integer.parseInt(jTable1.getValueAt(row, 10).toString());
                        if (qty > qty2)
                        {
                            JOptionPane.showMessageDialog(rootPane, "requested Qty not available");
                        } 
                        else {
                            int id = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
                            String batchId = jTable1.getValueAt(row, 3).toString();
                            String chemicalComposition = jTable1.getValueAt(row, 5).toString();
                            Boolean pescriptionStatus = Boolean.parseBoolean((jTable1.getValueAt(row, 11).toString()));
                            if (pescriptionStatus == true) {
                                pescriptionStatus1 = true;
                            }
                            double SellingPricePerUnits = Double.parseDouble(jTable1.getValueAt(row, 6).toString());

                            for (int i = 0; i < jTable2.getRowCount(); i++) {
                                if (Integer.parseInt(jTable2.getValueAt(i, 0).toString()) == id) {
                                    int confirm = JOptionPane.showConfirmDialog(null, "the medicine is already added\n and do you want to update quantity  ");
                                    if (confirm == 0) {
                                        model1.setValueAt(qty, i, 3);
                                        model1.setValueAt(totalAmount(SellingPricePerUnits, qty), i, 4);
                                        loadAmount();

                                    }
                                    return;
                                } else {
                                    System.out.println("not found");
                                }
                            }

                            model1.addRow(new Object[]{id, batchId, SellingPricePerUnits, qty, totalAmount(SellingPricePerUnits, qty)});
                            loadAmount();
                        }
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Enter Integer value");
                    return;
                }
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_SearchActionPerformed

    private void jComboBox_ColumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ColumnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_ColumnActionPerformed

    private void jButton2_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_DeleteActionPerformed
        // TODO add your handling code here:
        if (jTable2.getSelectionModel().isSelectionEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Please select Medicine First");

        } else {

            int conformation = JOptionPane.showConfirmDialog(rootPane, "Are you sure do you want to  delete seleced items");
            if (conformation == 0) {
                int row = jTable2.getSelectedRow();
                model1.removeRow(row);
                loadAmount();
                JOptionPane.showMessageDialog(rootPane, "delete completed");
            }
        }
    }//GEN-LAST:event_jButton2_DeleteActionPerformed

    private void jTextField4_DiscountAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_DiscountAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_DiscountAmountActionPerformed

    private void jTextField5_amountToReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5_amountToReceivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_amountToReceivedActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();
        jTextArea1_ChemicalComposition.setText(jTable1.getValueAt(row, 4).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_amountActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked


    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton2_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_updateActionPerformed
        if (jTable2.getSelectionModel().isSelectionEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Please select Medicine First");

        } else {
            try {
                int row = jTable2.getSelectedRow();
                int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity"));
                model1.setValueAt(qty, row, 3);
                double SellingPricePerUnits = Double.parseDouble(jTable2.getValueAt(row, 2).toString());
                model1.setValueAt(totalAmount(SellingPricePerUnits, qty), row, 4);
                loadAmount();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Enter Integer value");
                return;
            }
        }
    }//GEN-LAST:event_jButton2_updateActionPerformed

    private void jTextField3_DiscountPercentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_DiscountPercentKeyReleased
        // TODO add your handling code here:
        double Discount = Double.parseDouble(jTextField3_DiscountPercent.getText().toString());
        double amt = Double.parseDouble(jTextField2_amount.getText().toString());
        double discountAmount = Discount / 100 * amt;
        double amountToReceived = amt - discountAmount;
        jTextField4_DiscountAmount.setText(discountAmount + "");
        jTextField5_amountToReceived.setText(amountToReceived + "");
        validateDiscount.setText("");


    }//GEN-LAST:event_jTextField3_DiscountPercentKeyReleased

    private void jTextField3_DiscountPercentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_DiscountPercentKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACKSPACE)) {
            int punto = 0;
            if (c == KeyEvent.VK_PERIOD) {
                String s = jTextField3_DiscountPercent.getText();
                int dot = s.indexOf('.');

                punto = dot;
                if (dot != -1) {
                    getToolkit().beep();
                    evt.consume();
                }
            }
        } else {
            getToolkit().beep();
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_DiscountPercentKeyTyped

    private void jTextField7_amountToReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7_amountToReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7_amountToReturnActionPerformed

    private void jTextField6_AmountReceivedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_AmountReceivedKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6_AmountReceivedKeyTyped

    private void jTextField6_AmountReceivedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_AmountReceivedKeyReleased
        double amountReceived = Double.parseDouble(jTextField6_AmountReceived.getText());
        double amountToReceived = Double.parseDouble(jTextField5_amountToReceived.getText());
        double amountToReturn = amountReceived - amountToReceived;
        jTextField7_amountToReturn.setText(amountToReturn + "");
    }//GEN-LAST:event_jTextField6_AmountReceivedKeyReleased

    private void jButton5_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_SaveActionPerformed
        boolean error = false;
        String contact = jTextField3_PhoneNumber.getText();
        int length = contact.length();

        if (jTable2.getRowCount() == 0) {

            JOptionPane.showMessageDialog(rootPane, "First select Medicine");
            error = true;
        }

        if (jTextField6_AmountReceived.getText().trim().isEmpty()) {
            validateAmountReceived.setText("Amount is not received");
            error = true;
        }
        if (jTextField2_Name.getText().trim().isEmpty()) {
            validateName.setText("Please Enter The customer Name");
            error = true;

        }
        if (jTextField3_PhoneNumber.getText().trim().isEmpty()) {
            validatePhoneNumber.setText("Please Enter the Phone Number");
            error = true;
        }
        if (jTextField4_DiscountAmount.getText().trim().isEmpty()) {
            validateDiscount.setText("Discount must be 0 or more but cant not be empty");
            error = true;
        }
        if (!(Pattern.matches("^[9]{1}+[8]{1}+[0-9]+$", jTextField3_PhoneNumber.getText()))) {
            validatePhoneNumber.setText("Number must start  with  98");
            error = true;
        }
        if (length < 10) {
            validatePhoneNumber.setText("Phone number must be of 10 digit");
            error = true;
        }

        if (error == false) {

            if (pescriptionStatus1 == true) {
                if (ob5 == null) {
                    JOptionPane.showMessageDialog(null, "Please add prescription");
                    return;
                }
                double Discount = Double.parseDouble(jTextField3_DiscountPercent.getText().toString());
                double amountToReceived = Double.parseDouble(jTextField5_amountToReceived.getText());
                String customerName = jTextField2_Name.getText();
                String phoneNumber = jTextField3_PhoneNumber.getText();
                Date currentDate = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String date = dateFormat.format(currentDate);
                int amount = Integer.parseInt(jTextField5_amountToReceived.getText());
                int amount1 =Integer.parseInt(jTextField6_AmountReceived.getText());
                if (amount1 != amount) {
                    JOptionPane.showMessageDialog(rootPane, "Credit sales is not allow");
                } else {
                    Sales ob = new Sales();
                    ob.setCustomerName(customerName);
                    ob.setDate(date);
                    ob.setDiscount(Discount);
                    ob.setPhoneNumber(phoneNumber);
                    SalesDAO sDAO = new SalesDAO();
                    int sales_id = sDAO.addSalesDAO(ob);

                    ArrayList<SalesItem> sList = new ArrayList<>();
                    int c = model1.getRowCount();
                    for (int i = 0; i < c; i++) {
                        SalesItem ob1 = new SalesItem();
                        ob1.setSalesId(sales_id);
                        ob1.setMedicineId(Integer.parseInt(jTable2.getValueAt(i, 0).toString()));
                        ob1.setBatchID(jTable2.getValueAt(i, 1).toString());
                        ob1.setQuantity(Integer.parseInt(jTable2.getValueAt(i, 3).toString()));
                        ob1.setSellingPricePerUnits(Double.parseDouble((jTable2.getValueAt(i, 2)).toString()));
                        sList.add(ob1);
                    }
                    SalesItemDAO siDAO = new SalesItemDAO();
                    siDAO.addSalesItem(sList);

                    Payments ob2 = new Payments();
                    ob2.setAmount(Double.parseDouble(jTextField5_amountToReceived.getText()));
                    ob2.setDate(date);
                    ob2.setSalesId(sales_id);
                    PaymentDAO pDAO = new PaymentDAO();
                    int result = pDAO.addPayment(ob2);
                    if (result == 1) {
                        JOptionPane.showMessageDialog(rootPane, "Record Save");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Record not Save");
                    }
                    PrescriptionDAO psDAO = new PrescriptionDAO();
                    ob5.setSalesId(sales_id);
                    psDAO.saveData(ob5);

                    loadData();
                    clearModel1();
                    clearLabel();
                    clearText();
                    pescriptionStatus1 = false;
                }
            } else {
                double Discount = Double.parseDouble(jTextField3_DiscountPercent.getText().toString());
                double amountToReceived = Double.parseDouble(jTextField5_amountToReceived.getText());
                String customerName = jTextField2_Name.getText();
                String phoneNumber = jTextField3_PhoneNumber.getText();
                Date currentDate = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String date = dateFormat.format(currentDate);
                double amount = Double.parseDouble(jTextField5_amountToReceived.getText());
                double amount1 = Double.parseDouble(jTextField6_AmountReceived.getText());
                if (amount1 != amount) {
                    JOptionPane.showMessageDialog(rootPane, "Credit sales is not allow");
                } 
                else {
                    Sales ob = new Sales();
                    ob.setCustomerName(customerName);
                    ob.setDate(date);
                    ob.setDiscount(Discount);
                    ob.setPhoneNumber(phoneNumber);
                    SalesDAO sDAO = new SalesDAO();
                    int sales_id = sDAO.addSalesDAO(ob);

                    ArrayList<SalesItem> sList = new ArrayList<>();
                    int c = model1.getRowCount();
                    for (int i = 0; i < c; i++) {
                        SalesItem ob1 = new SalesItem();
                        ob1.setSalesId(sales_id);
                        ob1.setMedicineId(Integer.parseInt(jTable2.getValueAt(i, 0).toString()));
                        ob1.setBatchID(jTable2.getValueAt(i, 1).toString());
                        ob1.setQuantity(Integer.parseInt(jTable2.getValueAt(i, 3).toString()));
                        ob1.setSellingPricePerUnits(Double.parseDouble((jTable2.getValueAt(i, 2)).toString()));
                        sList.add(ob1);
                    }
                    SalesItemDAO siDAO = new SalesItemDAO();
                    siDAO.addSalesItem(sList);

                    Payments ob2 = new Payments();
                    ob2.setAmount(Double.parseDouble(jTextField5_amountToReceived.getText()));
                    ob2.setDate(date);
                    ob2.setSalesId(sales_id);
                    PaymentDAO pDAO = new PaymentDAO();
                    int result = pDAO.addPayment(ob2);
                    if (result == 1) {
                        JOptionPane.showMessageDialog(rootPane, "Record Save");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Record not Save");
                    }
                    loadData();
                    clearModel1();
                    clearText();
                    clearLabel();

                }
            }
        }


    }//GEN-LAST:event_jButton5_SaveActionPerformed

    private void jButton6_AddPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_AddPrescriptionActionPerformed
        pres.setVisible(true);
    }//GEN-LAST:event_jButton6_AddPrescriptionActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
clearModel();
String Search_Item=jComboBox_Column.getSelectedItem().toString();
String Search_Text=jTextField1_Search.getText();
       MedicineDAO mDAO = new MedicineDAO();
        ArrayList<Medicine> cList =mDAO.SearchData( Search_Item, Search_Text);
           for (int i = 0; i < cList.size(); i++) {

            model.addRow(new Object[]{cList.get(i).getMedicineId(), cList.get(i).getGenericName(), cList.get(i).getSpecificName(), cList.get(i).getBatchId(), cList.get(i).getChemicalComposition(),
                cList.get(i).getCostPricePerUnit(), cList.get(i).getSellingPricePerUnits(), cList.get(i).getExpDate(), cList.get(i).getMfgDate(), cList.get(i).getDose(),
                cList.get(i).getQuantity(), cList.get(i).getPescriptionStatus(), cList.get(i).getTypesID()});
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3_DiscountPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_DiscountPercentActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField3_DiscountPercentActionPerformed

    private void jTextField3_PhoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_PhoneNumberKeyPressed
        // TODO add your handling code here:
         String contact =jTextField3_PhoneNumber.getText();
    int length =contact.length();
        char c = evt.getKeyChar();
   if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9'){
                if(length<10){
                    jTextField3_PhoneNumber.setEditable(true);
                }
                else{
                  jTextField3_PhoneNumber.setEditable(false);  
                }
                
            }
            else{
                if(evt.getExtendedKeyCode()== KeyEvent.VK_BACKSPACE|| evt.getExtendedKeyCode() == KeyEvent.VK_DELETE)
                {
                    jTextField3_PhoneNumber.setEditable(true);
                }
                        else{
                                jTextField3_PhoneNumber.setEditable(false);
                                }
            }
                                                   
    }//GEN-LAST:event_jTextField3_PhoneNumberKeyPressed

    private void jTextField3_PhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_PhoneNumberKeyReleased
        // TODO add your handling code here:
        validatePhoneNumber.setText("");
    }//GEN-LAST:event_jTextField3_PhoneNumberKeyReleased

    private void jTextField2_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_NameKeyReleased
        // TODO add your handling code here:
        validateName.setText("");
    }//GEN-LAST:event_jTextField2_NameKeyReleased

    private void jTextField2_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_NameKeyPressed
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACKSPACE)||  c==KeyEvent.VK_DELETE ||c==KeyEvent.VK_SPACE ))
        evt.consume(); 
    }//GEN-LAST:event_jTextField2_NameKeyPressed

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
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2_Delete;
    private javax.swing.JButton jButton2_update;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5_Save;
    private javax.swing.JButton jButton6_AddPrescription;
    private javax.swing.JComboBox<String> jComboBox_Column;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1_ChemicalComposition;
    private javax.swing.JTextField jTextField1_Search;
    private javax.swing.JTextField jTextField2_Name;
    private javax.swing.JTextField jTextField2_amount;
    private javax.swing.JTextField jTextField3_DiscountPercent;
    private javax.swing.JTextField jTextField3_PhoneNumber;
    private javax.swing.JTextField jTextField4_DiscountAmount;
    private javax.swing.JTextField jTextField5_amountToReceived;
    private javax.swing.JTextField jTextField6_AmountReceived;
    private javax.swing.JTextField jTextField7_amountToReturn;
    private javax.swing.JLabel validateAmountReceived;
    private javax.swing.JLabel validateDiscount;
    private javax.swing.JLabel validateName;
    private javax.swing.JLabel validatePhoneNumber;
    // End of variables declaration//GEN-END:variables
}
