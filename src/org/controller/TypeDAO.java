/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import org.model.Type;
import org.util.DBConnection;
public class TypeDAO {
     public int saveData(Type ob){
    try{
            Connection con=DBConnection.getConnection();
            String sql="insert into types(name,userID) values(?,?)";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,ob.getName());
             st.setInt(2,org.util.Util.userID);
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
     public ArrayList<Type> fetchData(){
        ArrayList<Type>typesList=new ArrayList();
        try{
            Connection con=DBConnection.getConnection();
            String sql="select *from types";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                Type ob=new Type();
                ob.setTypeID(rs.getInt("typesID"));
                ob.setName(rs.getString("name"));
                
              typesList.add(ob);
            }
            con.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return typesList;
    }
    public int updateRecord(Type ob){
        try{
             Connection con=DBConnection.getConnection();
            String sql="update types set name=? where typesID=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,ob.getName());
              pst.setInt(2,ob.getTypeID());
              boolean re=pst.execute();
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
        return 0;
    }
    public int deleteRecord(Type ob){
        try{
         Connection con=DBConnection.getConnection();
         String sql="delete from  types where typesID=?";
         PreparedStatement pst=con.prepareStatement(sql);
           pst.setInt(1,ob.getTypeID());
              boolean re=pst.execute();
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
        return 0;
    }
      public HashMap<String,Integer> fetchType(){
        HashMap<String,Integer> map=new HashMap();
               
        try{
            Connection con=DBConnection.getConnection();
            String sql="select typesID,name from types";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                map.put(rs.getString("name"),rs.getInt("typesID"));
            }
            con.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return map;
    }
     public boolean checkTypes(String name){
        try {
            Connection con = DBConnection.getConnection();
            String sql="Select * from  suppliers where name=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,name);
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

