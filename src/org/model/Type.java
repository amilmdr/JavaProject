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
public class Type {
  private int typeID ;
  private String name;
      public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
