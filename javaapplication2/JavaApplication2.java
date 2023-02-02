/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author admin
 */
public class JavaApplication2 {
    Connection con;
    public static void main(String[] args) {
      JavaApplication2 obj1 = new JavaApplication2();
      obj1.createconnection();
    }
    
    public void createconnection(){
       
            try {

                try {
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                } catch (SQLException ex) {
                    Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("connection successfull");
                
                Statement smt = con.createStatement();
                ResultSet rs = smt.executeQuery("select * from users");
                while(rs.next()){
                    String name = rs.getString("name");
                    int id = rs.getInt("id");
                    int age = rs.getInt("age");
                    System.out.println(id+" "+name+ " "+age);
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
    }
            
    

