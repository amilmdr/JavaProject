package org.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.model.SalesItem;
import org.util.DBConnection;

public class SalesItemDAO {

    public void addSalesItem(ArrayList<SalesItem> sList) {

        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into salesitems(batchID,quantity,SellingPricePerUnits,userID,medicineId,salesId) values(?,?,?,?,?,?)";
            String sql1 = "update  medicines set Quantity=((select Quantity  from medicines where medicineId=?)-?) where medicineId=? ";
            for (int i = 0; i < sList.size(); i++) {
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, sList.get(i).getBatchID());
                pst.setInt(2, sList.get(i).getQuantity());
                pst.setDouble(3, sList.get(i).getSellingPricePerUnits());
                pst.setInt(4, org.util.Util.userID);
                pst.setInt(5, sList.get(i).getMedicineId());
                pst.setInt(6, sList.get(i).getSalesId());
                System.out.println(pst);
                pst.execute();
                PreparedStatement pst1 = con.prepareStatement(sql1);
                pst1.setInt(1, sList.get(i).getMedicineId());
                pst1.setInt(2, sList.get(i).getQuantity());
                pst1.setInt(3, sList.get(i).getMedicineId());
                System.out.println(pst1);
                pst1.execute();

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public ArrayList<SalesItem> fetchData(int id) {
        ArrayList<SalesItem> slList = new ArrayList();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select * from salesitems where salesId =" + id + "";
            Statement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                SalesItem ob = new SalesItem();
                ob.setSalesItemId(rs.getInt("salesItemId"));
                ob.setBatchID(rs.getString("batchID"));
                ob.setQuantity(rs.getInt("quantity"));
                ob.setSellingPricePerUnits(rs.getDouble("SellingPricePerUnits"));
                ob.setMedicineId(rs.getInt("medicineId"));
                slList.add(ob);
            }

            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return slList;
    }

}
