/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;

import java.sql.*;
import java.util.ArrayList;
import org.model.Prescription;
import org.util.DBConnection;

/**
 *
 * @author Amil
 */
public class PrescriptionDAO {

    public void saveData(Prescription ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into prescription (drName,phoneNumber,nmcNumber,email,address,date,userID,salesId) values(?,?,?,?,?,?,?,?)";
            String sql1= "update sales set prescriptionId = ? where salesId = ?";
            PreparedStatement st = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            st.setString(1, ob.getDrName());
            st.setString(2, ob.getPhoneNumber());
            st.setString(3, ob.getNmcNumber());
            st.setString(4, ob.getEmail());
            st.setString(5, ob.getAddress());
            st.setString(6, ob.getDate());
            st.setInt(7, org.util.Util.userID);
            st.setInt(8, ob.getSalesId());  
            System.out.println(st);
            
            st.execute();
            ResultSet rs= st.getGeneratedKeys();
            if(rs.next()){
                int prescriptionID=rs.getInt(1);
                PreparedStatement pst =con.prepareStatement(sql1);
                pst.setInt(1,prescriptionID);
                pst.setInt(2, ob.getSalesId());
                System.out.println(pst);
                pst.execute();
                System.out.println("Record Save");
            }
//            if (count > 0) {
//                System.out.println("Record Save");
//            } else {
//                System.out.println("Record not Save");
//            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public ArrayList<Prescription> fetchData(int id) {
        ArrayList<Prescription> paList = new ArrayList();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select * from  prescription where salesId =" + id + "";
            Statement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Prescription ob = new Prescription();
                ob.setPrescriptionId(rs.getInt("prescriptionId"));
                ob.setDrName(rs.getString("drName"));
                ob.setDate(rs.getString("date"));
                ob.setAddress(rs.getString("address"));
                ob.setEmail(rs.getString("email"));
                ob.setNmcNumber(rs.getString("nmcNumber"));
                ob.setPhoneNumber(rs.getString("phoneNumber"));
                
                
                
                
                paList.add(ob);
            }

            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return paList;
    }
}
