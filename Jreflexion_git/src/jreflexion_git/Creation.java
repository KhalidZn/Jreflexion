/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jreflexion_git;

import java.lang.reflect.Method;

/**
 *
 * @author KhalidZn
 */
public class Creation {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException {
     
    	String nom = Etudiant.class.getName();        
    	try {
    	    //On crée un objet Class
    	    Class cl = Class.forName(nom);
    	    //Nouvelle instance de la classe Etudiant
    	    Object e1 = cl.newInstance();//Constructeur sans paramètres

            
    	    //On crée les paramètres du constructeur
    	    Class[] types = new Class[]{String.class};
    	    //On récupère le constructeur avec les deux paramètres
    	    Constructor ct = cl.getConstructor(types);      
    	    //On instancie l'objet avec le constructeur surchargé !
    	    Object e2 = ct.newInstance(new String[]{"CNE2016"} );
    	    
    	    //On va chercher la méthode toString, elle n'a aucun paramètre
    	    Method m = cl.getMethod("toString", null);
    	    //La méthode invoke exécute la méthode sur l'objet passé en paramètre
    	    //Pas de paramètre, donc null en deuxième paramètre de la méthode invoke !
    	                                
    	    System.out.println("----------------------------------------");
    	    System.out.println("Méthode " + m.getName() + " sur e1: " +m.invoke(e1, null));
    	    System.out.println("Méthode " + m.getName() + " sur e2: " +m.invoke(e2, null));
    	                                
    	  } catch (SecurityException e) {
    	    e.printStackTrace();
    	  } catch (IllegalArgumentException e) {
    	    e.printStackTrace();
    	  } catch (ClassNotFoundException e) {
    	    e.printStackTrace();
    	  } catch (InstantiationException e) {
    	    e.printStackTrace();
    	  } catch (IllegalAccessException e) {
    	    e.printStackTrace();
    	  } catch (NoSuchMethodException e) {
    	    e.printStackTrace();
    	  } catch (InvocationTargetException e) {
    	    e.printStackTrace();
    	  }
    
    
    
    }	    
           	  
}
    


