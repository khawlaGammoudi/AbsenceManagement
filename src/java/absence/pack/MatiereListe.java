/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absence.pack;

import absence.entity.Matiere;
import absence.entity.demande;
import absence.util.Connecteur;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aymen
 */
public class MatiereListe {
    
    public static ArrayList<Matiere>GetMatiere(int id_groupe) throws SQLException, ClassNotFoundException{
      ArrayList<Matiere> liste=new ArrayList<Matiere>();
       Statement st=Connecteur.getConnection();
        String rq="select * from matiere where id_groupe="+id_groupe   ;
        ResultSet rs=st.executeQuery(rq);
        while(rs.next()) 
        {
            Matiere d=new Matiere(rs.getInt(1),rs.getString(2));
            liste.add(d);
        }
        return liste;
    }
}
