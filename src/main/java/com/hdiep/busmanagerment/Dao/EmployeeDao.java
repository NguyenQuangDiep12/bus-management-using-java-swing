package com.hdiep.busmanagerment.Dao;

import com.hdiep.busmanagerment.Model.BusDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class EmployeeDao {
    
    private static final String url = "jdbc:mysql://localhost:3306/Busm";
    private static final String user = "root";
    private static final String password = "123456";
    
   public List<BusDetails> getAllBusDetails(){
       List<BusDetails> busdetails = new ArrayList<>();
       try {
           Connection con = DriverManager.getConnection(url, user, password);
           Statement statement = con.createStatement();
           ResultSet resultSet = statement.executeQuery("Select * from bus_details");
           
           while(resultSet.next()){
               int id = resultSet.getInt("id");
               String bus_no = resultSet.getString("bus_no");
               String bus_source = resultSet.getString("bus_source");
               String bus_dest = resultSet.getString("bus_dest");
               String departDate = resultSet.getString("departDate");
               String price = resultSet.getString("price");
               String seat = resultSet.getString("seat");
               
               busdetails.add(new BusDetails(id, bus_no,bus_dest,bus_source,departDate,price, seat));
           }
       } catch ( SQLException p) {
           p.printStackTrace();
       }
       return busdetails;
   }
}
