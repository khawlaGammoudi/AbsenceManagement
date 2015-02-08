/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absence.entity;

import absence.util.Connecteur;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Aymen
 */
public class demande {
     int id_groupe;
   
     String lib_groupe;

    public demande(int id_groupe, String lib_groupe) {
        this.id_groupe = id_groupe;
        this.lib_groupe = lib_groupe;
    }

    public int getId_groupe() {
        return id_groupe;
    }

    public String getLib_groupe() {
        return lib_groupe;
    }
    
    
    
}
