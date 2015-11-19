/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_3;

/**
 *
 * @author Yarmanuel
 */
public class Employe {
    private final String name;
    private final String adresse;
    
    public Employe(){
       name= "";
       adresse = " ";
    }
    
    public String getCoordonee(){
        return name+" "+adresse;
    }
    public double calculSalaire(){
        return 0.0;
    }
}
