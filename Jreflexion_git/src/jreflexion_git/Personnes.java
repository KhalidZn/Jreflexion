/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jreflexion_git;

/**
 *
 * @author kadar
 */
public class Personnes {
    String nom ;
    String prenom ;

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "Personnes{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
}
