/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.model;

public class Medicine {
       private int medicineId;
       private String genericName;
       private String specificName;
       private String batchId;
       private String chemicalComposition;
       private double CostPricePerUnit;
       private double SellingPricePerUnits;
       private String expDate;
       private String mfgDate;
       private String dose;
       private int Quantity;
       private boolean pescriptionStatus;
       private int userID;
       private int suppliersId;
       private int typesID;
       private String supplier;
       private String type;

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
       
    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getSpecificName() {
        return specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getChemicalComposition() {
        return chemicalComposition;
    }

    public void setChemicalComposition(String chemicalComposition) {
        this.chemicalComposition = chemicalComposition;
    }

    public double getCostPricePerUnit() {
        return CostPricePerUnit;
    }

    public void setCostPricePerUnit(double CostPricePerUnit) {
        this.CostPricePerUnit = CostPricePerUnit;
    }

    public double getSellingPricePerUnits() {
        return SellingPricePerUnits;
    }

    public void setSellingPricePerUnits(double SellingPricePerUnits) {
        this.SellingPricePerUnits = SellingPricePerUnits;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(String mfgDate) {
        this.mfgDate = mfgDate;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public boolean getPescriptionStatus() {
        return pescriptionStatus;
    }

    public void setPescriptionStatus(boolean pescriptionStatus) {
        this.pescriptionStatus = pescriptionStatus;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(int suppliersId) {
        this.suppliersId = suppliersId;
    }

    public int getTypesID() {
        return typesID;
    }

    public void setTypesID(int typesID) {
        this.typesID = typesID;
    }
      
       
}
