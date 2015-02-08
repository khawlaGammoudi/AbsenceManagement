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
public class Matiere {
    
 int code_mat;
 String lib_mat;
    public Matiere(int code_mat,String lib_mat )
    {
        this.code_mat=code_mat;
        this.lib_mat=lib_mat;
    }

    public int getCode_mat() {
        return code_mat;
    }

    public String getLib_mat() {
        return lib_mat;
    }
    
    
    
}
