/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absence.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hajer
 */
public class Connecteur {
   public static Statement getConnection() throws ClassNotFoundException, SQLException{
   Class.forName("com.mysql.jdbc.Driver");
   Connection cnx=DriverManager.getConnection("jdbc:mysql://127.0.0.1/gestion_absences","root","");
   Statement st=cnx.createStatement();
   return st;
   } 
}

