/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.model;

/**
 *
 * @author Amil
 */
public class SalesItem {
  private  int  salesItemId;	
  private String batchID;
  private int quantity;
 private double SellingPricePerUnits;
  private int userID;
  private int medicineId;
  private int salesId;

    public double getSellingPricePerUnits() {
        return SellingPricePerUnits;
    }

    public void setSellingPricePerUnits(double SellingPricePerUnits) {
        this.SellingPricePerUnits = SellingPricePerUnits;
    }

    public int getSalesItemId() {
        return salesItemId;
    }

    public void setSalesItemId(int salesItemId) {
        this.salesItemId = salesItemId;
    }

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }
    
}
