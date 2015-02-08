package absence.pack;


import absence.entity.Etudiant;
import absence.entity.Matiere;
import absence.util.Connecteur;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aymen
 */
public class EtudiantListe {
    
     public static ArrayList<Etudiant>GetEtudiant(int id_groupe) throws SQLException, ClassNotFoundException{
      ArrayList<Etudiant> liste=new ArrayList<Etudiant>();
       Statement st=Connecteur.getConnection();
        String rq="select * from etudiant where id_groupe="+id_groupe   ;
        ResultSet rs=st.executeQuery(rq);
        while(rs.next()) 
        {
            Etudiant d=new Etudiant(rs.getInt(1),rs.getString(2),rs.getString(3));
            liste.add(d);
        }
        return liste;
    }
    
}
