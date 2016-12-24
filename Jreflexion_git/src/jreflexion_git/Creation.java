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
    	    //On cr�e un objet Class
    	    Class cl = Class.forName(nom);
    	    //Nouvelle instance de la classe Etudiant
    	    Object e1 = cl.newInstance();//Constructeur sans param�tres

            
    	    //On cr�e les param�tres du constructeur
    	    Class[] types = new Class[]{String.class};
    	    //On r�cup�re le constructeur avec les deux param�tres
    	    Constructor ct = cl.getConstructor(types);      
    	    //On instancie l'objet avec le constructeur surcharg� !
    	    Object e2 = ct.newInstance(new String[]{"CNE2016"} );
    	    
    	    //On va chercher la m�thode toString, elle n'a aucun param�tre
    	    Method m = cl.getMethod("toString", null);
    	    //La m�thode invoke ex�cute la m�thode sur l'objet pass� en param�tre
    	    //Pas de param�tre, donc null en deuxi�me param�tre de la m�thode invoke !
    	                                
    	    System.out.println("----------------------------------------");
    	    System.out.println("M�thode " + m.getName() + " sur e1: " +m.invoke(e1, null));
    	    System.out.println("M�thode " + m.getName() + " sur e2: " +m.invoke(e2, null));
    	                                
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
    


