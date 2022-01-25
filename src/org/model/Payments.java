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
public class Payments {
   	private int paymentsId;
        private double amount;
        private String Date;
       private int salesId; 

    public int getPaymentsId() {
        return paymentsId;
    }

    public void setPaymentsId(int paymentsId) {
        this.paymentsId = paymentsId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }
       
}
