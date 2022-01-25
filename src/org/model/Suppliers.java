
package org.model;

public class Suppliers {
    private int supplierID;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
public int getSupplierID() {

return supplierID;
}
  public void setSupplierID(int supplierID) {
this.supplierID= supplierID;
}
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }
   public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
       public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
