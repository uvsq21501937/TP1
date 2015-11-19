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
public class Manager extends TypeEmployee implements ICalculSalaire {
    private int nbEmploye;
    public Manager(){
        super("nom","adresse",new Date());
        nbEmploye=10; //par exemple
    }
    
    public void setNbEmploye(int nbEmploye){
        this.nbEmploye=nbEmploye;
    }
    
    public double calculSalaire() {
            return 1500+(this.getAnciennete()*20) + nbEmploye*100;
        
    }
    
}
