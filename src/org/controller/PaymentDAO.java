package org.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.model.Payments;
import org.util.DBConnection;

/**
 *
 * @author Amil
 */
public class PaymentDAO {

    public int addPayment(Payments ob) {
        try {

            Connection con = DBConnection.getConnection();
            String sql = "insert into payments(amount,Date,userID,salesId) values(?,?,?,?) ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(2, ob.getDate());
            pst.setDouble(1, ob.getAmount());
            pst.setInt(3, org.util.Util.userID);
            pst.setInt(4, ob.getSalesId());
             int result =pst.executeUpdate();
             if(result>0){
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

    public ArrayList<Payments> fetchData(int id) {
        ArrayList<Payments> pList = new ArrayList();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select * from payments where salesId =" + id + "";
            Statement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Payments ob = new Payments();
                ob.setPaymentsId(rs.getInt("paymentsId"));
                ob.setAmount(rs.getDouble("amount"));
                ob.setDate(rs.getDate("Date").toString());
                pList.add(ob);
            }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return pList;

    }
}
