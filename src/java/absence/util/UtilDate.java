/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absence.util;

import java.sql.Date;

/**
 *
 * @author Hajer
 */
public class UtilDate {
   
    public static Date getDate(String d)
    {
       int jour =Integer.parseInt(d.substring(0,2));
      int mois =Integer.parseInt(d.substring(3,5));
       int annee =Integer.parseInt(d.substring(6,10));
       Date D=new Date(jour,mois,annee);
       return D;
       
    }
}
