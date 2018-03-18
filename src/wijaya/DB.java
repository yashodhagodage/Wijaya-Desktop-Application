/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wijaya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Salitha Kaweendra
 */

public class DB {
    
   // public static String adminship;
    public static String admin;
    
    public static Connection c;

    public static Connection getConnection() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/wijaya", "pma", "123");
        }
        return c;
    }

    // Send data TO Database
    public static void setData(String sql) throws Exception {
        DB.getConnection().createStatement().executeUpdate(sql);
    }

    // Get Data From Datavase
    public static ResultSet getData(String sql) throws Exception {
        ResultSet rs = DB.getConnection().createStatement().executeQuery(sql);
        return rs;
    }
    
    void showDate(){
        Date d =new Date();
        System.out.println(d);
        SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd");
        String date = adf.format(d);
        
    }
    
   
    
}
