/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import org.model.Medicine;
import org.util.DBConnection;

public class MedicineDAO {

    public int saveData(Medicine ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into medicines (genericName,specificName,batchId,chemicalComposition,CostPricePerUnit,SellingPricePerUnits,expDate,mfgDate,dose,"
                    + "Quantity,pescriptionStatus,userID,suppliersId,typesID) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, ob.getGenericName());
            st.setString(2, ob.getSpecificName());
            st.setString(3, ob.getBatchId());
            st.setString(4, ob.getChemicalComposition());
            st.setDouble(5, ob.getCostPricePerUnit());
            st.setDouble(6, ob.getSellingPricePerUnits());
            st.setString(7, ob.getExpDate());
            st.setString(8, ob.getMfgDate());
            st.setString(9, ob.getDose());
            st.setInt(10, ob.getQuantity());
            st.setBoolean(11, ob.getPescriptionStatus());
            st.setInt(12, org.util.Util.userID);
            st.setInt(13, ob.getSuppliersId());
            st.setInt(14, ob.getTypesID());
            int count = st.executeUpdate();
            if (count > 0) {
                return 1;
            } else {
                con.close();
                return 2;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public ArrayList<Medicine> fetchData() {
        ArrayList<Medicine> medicineList = new ArrayList();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select m.*, s.name as supplier ,t.name as type from medicines as m"
                    + " inner join  suppliers as s on s.suppliersId=m.suppliersId"
                    + " inner join  types as t on t.typesID=m.typesID";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Medicine ob = new Medicine();
                ob.setMedicineId(rs.getInt("medicineId"));
                ob.setGenericName(rs.getString("genericName"));
                ob.setSpecificName(rs.getString("specificName"));
                ob.setBatchId(rs.getString("batchId"));
                ob.setChemicalComposition(rs.getString("chemicalComposition"));
                ob.setCostPricePerUnit(rs.getDouble("CostPricePerUnit"));
                ob.setSellingPricePerUnits(rs.getDouble("SellingPricePerUnits"));
                ob.setExpDate(rs.getString("expDate"));
                ob.setMfgDate(rs.getString("mfgDate"));
                ob.setDose(rs.getString("dose"));
                ob.setQuantity(rs.getInt("Quantity"));
                ob.setPescriptionStatus(rs.getBoolean("pescriptionStatus"));
                ob.setSuppliersId(rs.getByte("suppliersId"));
                ob.setTypesID(rs.getByte("typesID"));
                ob.setSupplier(rs.getString("supplier"));
                ob.setType(rs.getString("type"));

                medicineList.add(ob);
            }

            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return medicineList;
    }

    public int updateRecord(Medicine ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "update medicines set genericName=?,specificName=?,batchId=?,chemicalComposition=?,CostPricePerUnit=?,SellingPricePerUnits=?,expDate=?,mfgDate=?,dose=?,"
                    + "Quantity=?,pescriptionStatus=?,suppliersId=?,typesId=? where medicineId=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ob.getGenericName());
            pst.setString(2, ob.getSpecificName());
            pst.setString(3, ob.getBatchId());
            pst.setString(4, ob.getChemicalComposition());
            pst.setDouble(5, ob.getCostPricePerUnit());
            pst.setDouble(6, ob.getSellingPricePerUnits());
            pst.setString(7, ob.getExpDate());
            pst.setString(8, ob.getMfgDate());
            pst.setString(9, ob.getDose());
            pst.setInt(10, ob.getQuantity());
            pst.setBoolean(11, ob.getPescriptionStatus());
            pst.setInt(12, ob.getSuppliersId());
            pst.setInt(13, ob.getTypesID());
            pst.setInt(14, ob.getMedicineId());
            boolean re=pst.execute();
            if(re==false){
                return 1;
            }
            else{
            con.close(); 
            return 2;
            
                
            }


        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public int deleteRecord(Medicine ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "delete from  medicines where medicineId=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, ob.getMedicineId());
            boolean re=pst.execute();
            if(re==false){
                
                return 1;
            }
            else{
                con.close();
                return 2;
            }
            
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public ArrayList<String> fetchData1() {
        ArrayList<String> column = new ArrayList();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select *from medicines";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            int callcount = rsmd.getColumnCount();
            for (int i = 2; i <= callcount; i++) {
                column.add(rsmd.getColumnName(i));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return column;
    }

    public ArrayList<Medicine> SearchData(String Search_Item, String Search_Text) {
        ArrayList<Medicine> medicineList = new ArrayList();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select *from medicines where " + Search_Item + " like '%" + Search_Text + "%' ";
            Statement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Medicine ob1 = new Medicine();
                ob1.setMedicineId(rs.getInt("medicineId"));
                ob1.setGenericName(rs.getString("genericName"));
                ob1.setSpecificName(rs.getString("specificName"));
                ob1.setBatchId(rs.getString("batchId"));
                ob1.setChemicalComposition(rs.getString("chemicalComposition"));
                ob1.setCostPricePerUnit(rs.getDouble("CostPricePerUnit"));
                ob1.setSellingPricePerUnits(rs.getDouble("SellingPricePerUnits"));
                ob1.setExpDate(rs.getString("expDate"));
                ob1.setMfgDate(rs.getString("mfgDate"));
                ob1.setDose(rs.getString("dose"));
                ob1.setQuantity(rs.getInt("Quantity"));
                ob1.setPescriptionStatus(rs.getBoolean("pescriptionStatus"));
                ob1.setSuppliersId(rs.getByte("suppliersId"));
                ob1.setTypesID(rs.getByte("typesID"));

                medicineList.add(ob1);
            }

            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return medicineList;
    }
    public boolean checkprodut(String batchID){
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select *from medicines where batchId=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, batchID);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                return true;
                
            }
            else{
                return false;
            }
            
        }
        
        catch(Exception ex){
            System.out.println(ex);
        }
        return  false;
    }
}
