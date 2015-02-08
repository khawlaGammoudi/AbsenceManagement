/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absence.pack;
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
public class GroupeListe {
    
    public static ArrayList<demande>GetGroupe() throws SQLException, ClassNotFoundException{
      ArrayList<demande> liste=new ArrayList<demande>();
       Statement st=Connecteur.getConnection();
        String rq="select * from groupe ";
        ResultSet rs=st.executeQuery(rq);
        while(rs.next()) 
        {
            demande d=new demande(rs.getInt(1),rs.getString(2));
            liste.add(d);
        }
        return liste;
    }
    
}
