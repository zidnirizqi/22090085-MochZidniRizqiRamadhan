package com.buah.utills;

/**
 *
 * @author ACER
 */
import java.sql.Connection; 
 import java.sql.DriverManager; 
 import javax.swing.JOptionPane; 
  
 public class KoneksiDB { 
     public static Connection OpenConnection(){ 
         try { 
             Class.forName("com.mysql.jdbc.Driver"); 
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/aplikasikasirbuah", "root", ""); 
             return cn; 
         } catch (Exception e) { 
             JOptionPane.showMessageDialog(null, e); 
             return null; 
         } 
     } 
 }