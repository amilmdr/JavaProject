/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.model.Sales;
import org.util.DBConnection;

/**
 *
 * @author Amil
 */
public class SalesDAO {
    public int addSalesDAO(Sales ob){
        try{
            
        
        Connection con = DBConnection.getConnection();
        String sql= "insert into sales(date,discount,customerName,phoneNumber,userID) values(?,?,?,?,?) ";
        PreparedStatement pst =con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        pst.setString(1,ob.getDate());
        pst.setDouble(2, ob.getDiscount());
        pst.setString(3,ob.getCustomerName());
        pst.setString(4, ob.getPhoneNumber());
        pst.setInt(5, org.util.Util.userID);
        pst.execute();
            ResultSet rs= pst.getGeneratedKeys();
            if(rs.next()){
                return rs.getInt(1);
            }
        
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
    public ArrayList<Sales> fetchData() {
        ArrayList<Sales> sList = new ArrayList();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select * from sales";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Sales ob = new Sales();
                ob.setSalesId(rs.getInt("salesId"));
                ob.setCustomerName(rs.getString("customerName"));
                ob.setDate(rs.getDate("date").toString());
                ob.setDiscount(rs.getDouble("discount"));
                ob.setPhoneNumber(rs.getString("phoneNumber"));
                ob.setPrescriptionId(rs.getInt("prescriptionId"));
                sList.add(ob);
            }

            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return sList;
    }
}
