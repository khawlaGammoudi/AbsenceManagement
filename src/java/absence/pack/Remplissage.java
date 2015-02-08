/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absence.pack;

import absence.util.Connecteur;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author aymen
 */
public class Remplissage {

    public static void remplir(int code_etudiant,int presence,int code_mat,int code_groupe) throws ClassNotFoundException, SQLException {
        Statement st=Connecteur.getConnection();
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
        Date date = new Date();
       // System.out.println(sdf.format(date));
        
        
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        Date date2 = new Date();
       // System.out.println(sdf2.format(date2));
         //String rq="insert into seance values ("+date+","+sdf2.format(date2)+","+code_mat+","+1+","+code_etudiant+","+code_groupe+")  ";
        
     String rq="insert into seance values ('"+sdf.format(date)+"','"+sdf2.format(date2)+"','"+code_mat+"','"+presence+"','"+code_etudiant+"','"+code_groupe+"')  ";
         st.executeUpdate(rq);
    }
    
 
    
    
    
}
