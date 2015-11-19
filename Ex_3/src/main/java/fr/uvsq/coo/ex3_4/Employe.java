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
public class Employe extends TypeEmployee implements ICalculSalaire{
    
    public Employe(){
        super("nom","adresse",new Date());
    }
    
    public double calculSalaire() {
        return 1500+(this.getAnciennete()*20);
    }
    
}
