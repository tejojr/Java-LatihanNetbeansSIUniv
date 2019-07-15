/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import config.config;
/**
 *
 * @author Ammar Dragneel
 */
public class fungsi {
    public static int insert (String tabel,String isi) {
        try {
            String sql = "insert into " +tabel+ " values ("+isi+")";
            Statement st = config.Conn().createStatement();
            st.executeUpdate(sql);
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        } finally{
            try {
                config.Conn().close();
                
            } catch (Exception e) {
            }
}
    }
       public static int update(String tabel,String isi) {
        try {
            String sql = "update " +tabel+ " set "+isi+"";
            Statement st = config.Conn().createStatement();
            st.executeUpdate(sql);
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        } finally{
            try {
                config.Conn().close();
                
            } catch (Exception e) {
            }
    
    }
} 
       public static int delete(String tabel,String isi) {
        try {
            String sql = "delete from " +tabel+ " where "+isi+"";
            Statement st = config.Conn().createStatement();
            st.executeUpdate(sql);
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        } finally{
            try {
                config.Conn().close();
                
            } catch (Exception e) {
            }
    
    }

}
       public static int select (String tabel,String kolom) {
          try {
            String sql = "select "+kolom+" from "+tabel+"";
            Statement st = config.Conn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        } finally{
            try {
                config.Conn().close();
                
            } catch (Exception e) {
            }
    
    }
}
       public static int selectwhere (String tabel,String kolom, String kondisi) {
          try {
            String sql = "select "+kolom+" from "+tabel+" where "+kondisi;
            Statement st = config.Conn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        } finally{
            try {
                config.Conn().close();
                
            } catch (Exception e) {
            }
    
    }
}
}
    
  
