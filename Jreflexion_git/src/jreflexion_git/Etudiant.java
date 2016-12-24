/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jreflexion_git;

import java.util.logging.Logger;

/**
 *
 * @author kadar
 */
public class Etudiant extends Personnes implements Note{
    
    
    String CNE ;
    
    
    public Etudiant(String CNE) {
        this.CNE = CNE;
    }

    @Override
    public String toString() {
       
        return super.toString()+"Etudiant{" + "CNE=" + CNE + '}';
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }
   
    public String getCNE() {
        return CNE;
    }

   

    
    
}
