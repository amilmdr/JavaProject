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
public class Login {
    private int userID;
    private String userName ;
     private String password;
public int getUserID() {
return userID;
}
 public void setUserID(int userID) {
    this.userID= userID;
 }
     public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName=userName;
    }
   public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
