/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jreflexion_git;

import java.lang.reflect.Method;

/**
 *
 * @author kadar
 */
public class Main {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException {
        
        /*
        il est possible pour une classe d'obtenir :
        le nom de la class + le nom de sa super class :
        */
        System.out.println("La superclasse de la classe " + String.class.getName() + " est : " + String.class.getSuperclass());
        //Class c = String.class; est équivalent
        Class c = new String().getClass();
        
        Class[] strings = c.getInterfaces();
        //Pour voir le nombre d'interfaces
        System.out.println("*********************************************");
        System.out.println("1-Il y a " + strings.length + " interfaces implémentées");
        System.out.println("*********************************************");
        
        Class i =new Etudiant("az").getClass();
        Class[] paw=i.getInterfaces();

        //On parcourt le tableau d'interfaces
        for (Class string : strings) {
            System.out.println(string);
        }       
        System.out.println("*********************************************");

        System.out.println("2-Il y a " + paw.length + " interfaces implémentées");

        
        for (Class paw1 : paw) {
            System.out.println(paw1);
        }
        /*
        Connaître la liste des méthodes de la classe
        */
        Method[] pa =i.getMethods();
        System.out.println("*********************************************");

        System.out.println("2-Il y a " + pa.length + " methode implémentées");

        for(Method pa1:pa){
            System.out.println(pa1);
        }
        
        

        
}
    
}

