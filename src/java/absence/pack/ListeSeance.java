/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absence.pack;

import absence.entity.Etudiant;
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
public class ListeSeance{

    public ListeSeance(int code_etudiant) throws ClassNotFoundException, SQLException {
        
        Statement st=Connecteur.getConnection();
        String rq="select * from seance where code_etudiant="+code_etudiant ;
        ResultSet rs=st.executeQuery(rq);
        while(rs.next()) 
        {
            Etudiant d=new Etudiant(rs.getInt(1),rs.getString(2),rs.getString(3));
            //liste.add(d);
        }
      //  return liste;
        
    }
    

    
}
