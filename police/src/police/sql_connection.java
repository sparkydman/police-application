package police;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRIST CHURCH
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class sql_connection {
    Connection conn = null;
    public static Connection ConnecrDB(){
    try{
    Class.forName("org.sqlite.JDBC");
    Connection conn = DriverManager.getConnection("jdbc:sqlite:police.sqlite");
   //JOptionPane.showMessageDialog(null, "connection establisted");
     //conn.setAutoCommit(false);
    return conn;
    }catch(ClassNotFoundException | SQLException e){
       // JOptionPane.showMessageDialog(null, "connection failed");
    JOptionPane.showMessageDialog(null, e);
    return null;
    }
    }
     
      public ArrayList<statesClass>getValue(String stateName){
            ArrayList<statesClass> data = new ArrayList<>();
           Connection con = ConnecrDB();
            Statement st;
            ResultSet rs;
            
            
             try {
           
            st = con.createStatement();
            rs = st.executeQuery("select * from LGA '"+ stateName +"'");
           
            
            statesClass m;
            while (rs.next()){
                m = new statesClass (
                             rs.getString("Abia"),
                             rs.getString("Adamawa"),
                             rs.getString("Akwa Ibom"),
                             rs.getString("Anambra"),
                             rs.getString("Bauchi"),
                             rs.getString("Bayelsa"),
                             rs.getString("Benue"),
                             rs.getString("Bornu"),
                             rs.getString("Cross River"),
                             rs.getString("Delta"),
                             rs.getString("Ebonyi"),
                             rs.getString("Edo"),
                             rs.getString("Ekiti"),
                             rs.getString("Enugu"),
                             rs.getString("Gombe"),
                             rs.getString("Imo"),
                             rs.getString("Jigawa"),
                             rs.getString("Kaduna"),
                             rs.getString("Kano"),
                             rs.getString("Katsina"),
                             rs.getString("Kebbi"),
                             rs.getString("Kogi"),
                             rs.getString("kwara"),
                             rs.getString("Lagos"),
                             rs.getString("Nasarawa"),
                             rs.getString("Niger"),
                             rs.getString("Ogun"),
                             rs.getString("Ondo"),
                             rs.getString("Osun"),
                             rs.getString("Oyo"),
                             rs.getString("Plateau"),
                             rs.getString("Rivers"),
                             rs.getString("Sokoto"),
                             rs.getString("Taraba"),
                             rs.getString("Yobe"),
                             rs.getString("Zamfara")
                             
                );
                data.add(m);
                
            }
          //  rs.close();
         //   st.close();
        } catch (SQLException ex) {
            Logger.getLogger(sql_connection.class.getName()).log(Level.SEVERE, null, ex);
         
        }
        
            
            return data;
      }
}
