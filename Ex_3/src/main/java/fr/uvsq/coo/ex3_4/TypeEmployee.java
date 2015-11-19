/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_4;

import java.util.Date;

/**
 *
 * @author Yarmanuel
 */
public class TypeEmployee {
    private final String nom;
    private final String adresse;
    private final Date embouche;
    private int anciennete;
    
    public TypeEmployee(String nom, String adresse, Date embauche){
        this.nom=nom;
        this.adresse=adresse;
        this.embouche=embauche;
        this.anciennete=0;
    }
    
    public int getAnciennete(){
        return anciennete;
    }
    public Date getEmbauche(){
        return embouche;
    }
}
