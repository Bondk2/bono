/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bondk2;

import java.sql.*;

/**
 *
 * @author O.HASHEM
 */
public class Bondk2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
      
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con ;
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM" , "123");
        Statement s=con.createStatement();
        s.execute("Create table bon(id number(6) primary key , name varchar2(25),password varchar2(20))");
        System.out.println("Table Created");
        
    }
    
}
