/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_4;

import java.util.List;

/**
 *
 * @author Yarmanuel
 */
public class CalculSalaireGlobale {
    public static double calculSalireGlbale(List<ICalculSalaire> listeEmploye){
        double totale=0.0;
        for(ICalculSalaire e : listeEmploye){
            totale+=e.calculSalaire();
    }
        return totale;
    }
}
