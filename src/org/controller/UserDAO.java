/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import org.model.User;
import org.util.DBConnection;

/**
 *
 * @author Amil
 */
public class UserDAO {

    public int saveData(User ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into user(fullName,userName,email,phone,password,isAdmin,address,dob) "
                    + "values(?,?,?,?,md5(?),?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, ob.getFullname());
            st.setString(2, ob.getUserName());
            st.setString(3, ob.getEmail());
            st.setString(4, ob.getPhoneNumber());
            st.setString(5, "admin");
            st.setBoolean(6, ob.getIsAdmin());
            st.setString(7, ob.getAddress());
            st.setString(8, ob.getDob());
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

    public ArrayList<User> fetchData() {
        ArrayList<User> typesList = new ArrayList();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select *from user";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                User ob = new User();
                ob.setUserID(rs.getInt("userID"));
                ob.setFullname(rs.getString("fullname"));
                ob.setUserName(rs.getString("userName"));
                ob.setEmail(rs.getString("email"));
                ob.setPhoneNumber(rs.getString("phone"));
                ob.setIsAdmin(rs.getBoolean("isAdmin"));
                ob.setAddress(rs.getString("address"));
                ob.setDob(rs.getString("dob"));
                typesList.add(ob);
            }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return typesList;
    }

    public int  updateRecord(User ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "update user set fullName=?,userName=?,email=?,phone=?,password=md5(?),isAdmin=?,address=?,dob=?  where userID=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ob.getFullname());
            pst.setString(2, ob.getUserName());
            pst.setString(3, ob.getEmail());
            pst.setString(4, ob.getPhoneNumber());
            pst.setString(5, "admin");
            pst.setBoolean(6, ob.getIsAdmin());
            pst.setString(7, ob.getAddress());
            pst.setString(8, ob.getDob());
            pst.setInt(9, ob.getUserID());
            System.out.println(pst);
            int i=pst.executeUpdate();
            if(i==1){
                 con.close();
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
    public int  updateRecord1(User ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "update user set fullName=?,userName=?,email=?,phone=?,password=md5(?),isAdmin=?,address=?,dob=?  where userID=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ob.getFullname());
            pst.setString(2, ob.getUserName());
            pst.setString(3, ob.getEmail());
            pst.setString(4, ob.getPhoneNumber());
            pst.setString(5, ob.getPassword());
            pst.setBoolean(6, ob.getIsAdmin());
            pst.setString(7, ob.getAddress());
            pst.setString(8, ob.getDob());
            pst.setInt(9, ob.getUserID());
            System.out.println(pst);
            int i=pst.executeUpdate();
            if(i==1){
                 con.close();
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

    public void deleteRecord(User ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "delete from user where userID=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, ob.getUserID());
            pst.execute();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public User fetchData(int userID) {
        User ob = new User();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select *from user where userID=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, userID);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                ob.setUserID(rs.getInt("userID"));
                ob.setFullname(rs.getString("fullname"));
                ob.setUserName(rs.getString("userName"));
                ob.setEmail(rs.getString("email"));
                ob.setPhoneNumber(rs.getString("phone"));
                ob.setPassword(rs.getString("password"));
                ob.setAddress(rs.getString("address"));
                ob.setDob(rs.getString("dob"));
            }
            else{
                con.close();

            }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return ob;
    }
    public boolean checkUser(String username){
        try {
            Connection con = DBConnection.getConnection();
            String sql="Select * from  user where userName=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,username);
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
    
    public boolean checkUser1(String email){
        try {
            Connection con = DBConnection.getConnection();
            String sql="Select * from user where email=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,email);
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
