/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absence.entity;

/**
 *
 * @author aymen
 */
public class Etudiant {
    int code_etudiant;
    String nom;
    String prenom;

    public Etudiant(int code_etudiant, String nom, String prenom) {
        this.code_etudiant = code_etudiant;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getCode_etudiant() {
        return code_etudiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    
}
