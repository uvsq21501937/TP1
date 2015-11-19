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
public class Vendeur extends TypeEmployee implements ICalculSalaire{
    private int commission;
    
    public Vendeur(){
        super("nom","adresse",new Date());
        commission=500;
    }
    
    public double calculSalaire() {
        return 1500+(this.getAnciennete()*20) + commission;
    }
    
    public void setCommission(int commission){
        this.commission=commission;
    }
}
