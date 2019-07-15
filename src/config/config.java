/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author Ammar Dragneel
 */
public class config {
    static Connection conn;
    public static Connection Conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/sekolah","root","");
        }catch (Exception e) {
            System.out.println(e);
           
        }
        return conn;
    
    
    
    }
    public static void main(String[] args) {
        System.out.println(config.Conn());
    }
    
    
    
    
    
    
    
    
    
}
    /*static Connection conn;
   public  static Connection getConn(){
    try {
       Class.forName("com.mysql.jdbc.Driver");
       conn = DriverManager.getConnection("jdbc:mysql://localhost/sekolah","root","");
    }catch (Exception e) {
        System.out.println(e.getMessage());
    }
       return conn;
    
   }
    public static void main(String[] args) {
        System.out.println(config.getConn());
    }
  */