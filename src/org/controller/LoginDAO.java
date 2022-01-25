/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import org.model.Login;
import org.util.DBConnection;

public class LoginDAO {

    public int logIn(Login ob) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select *from user where userName=? and password=md5(?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ob.getUserName());
            pst.setString(2, ob.getPassword());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
               org.util.Util.userID=rs.getInt("userID");
               org.util.Util.isAdmin=rs.getBoolean("isAdmin");
                con.close();
                return 1;
            } else {
                con.close();
                return 2;
            }

        } catch (Exception ex) {
            System.out.println(ex);

        }
        return 0;
    }

}