/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.util;
import java.sql.*;

/**
 *
 * @author Amil
 */
public class DBConnection {
    public static Connection getConnection(){
String url = "jdbc:mysql://localhost:3306/pharmacymanagement";
            String uname = "root";
            String pwd = "";
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pwd);
            return con;
            }
            catch(Exception  ex){
             ex.printStackTrace();        
            }
             return null;
    }
}

