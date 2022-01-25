/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import org.model.Suppliers;
import org.model.Type;
import org.util.DBConnection;
public class SupplierDAO {
     public int saveData(Suppliers ob){
        try{
           Connection con=DBConnection.getConnection();
           String sql="insert into suppliers (name,address,email,phoneNumber,userID) values(?,?,?,?,?)";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,ob.getName());
            st.setString(2,ob.getAddress());
             st.setString(3,ob.getEmail());
              st.setString(4,ob.getPhoneNumber());
              st.setInt(5,org.util.Util.userID);
            int count=st.executeUpdate();
            if(count>0){
            return 1;
        }
            else{
                con.close();
               return 2;    
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }
      public ArrayList<Suppliers> fetchData(){
        ArrayList<Suppliers>suppliersList=new ArrayList();
        try{
            Connection con=DBConnection.getConnection();
            String sql="select *from suppliers";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                Suppliers ob=new Suppliers();
                ob.setSupplierID(rs.getInt("suppliersId"));
                ob.setName(rs.getString("Name"));
                ob.setAddress(rs.getString("Address"));
                ob.setEmail(rs.getString("Email"));
                ob.setPhoneNumber(rs.getString("phoneNumber"));
                
              suppliersList.add(ob);
            }
            con.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return suppliersList;
    }
    public int updateRecord( Suppliers ob){
        try{
             Connection con=DBConnection.getConnection();
            String sql="update suppliers set name=?,address=?,email=?,phoneNumber=? where suppliersId=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,ob.getName());
            pst.setString(2,ob.getAddress());
            pst.setString(3,ob.getEmail());
            pst.setString(4,ob.getPhoneNumber());
              pst.setInt(5,ob.getSupplierID());
              boolean re =pst.execute();
              if(re==false){
                return 1;
            }
            else{
            con.close(); 
            return 2;    
            }
              
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return  0;
    }
    public int deleteRecord(Suppliers ob){
        try{
         Connection con=DBConnection.getConnection();
         String sql="delete from  suppliers where id=?";
         PreparedStatement pst=con.prepareStatement(sql);
          pst.setInt(1,ob.getSupplierID());
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
     public HashMap<String,Integer> fetchSupplier(){
        HashMap<String,Integer> map=new HashMap();
               
        try{
            Connection con=DBConnection.getConnection();
            String sql="select suppliersId,name from Suppliers";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                map.put(rs.getString("name"),rs.getInt("suppliersId"));
            }
            con.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return map;
    }
     public boolean checkSupplier(String email,String number){
        try {
            Connection con = DBConnection.getConnection();
            String sql="Select * from  suppliers where email=? and phoneNumber=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,email);
            pst.setString(2,number);
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
