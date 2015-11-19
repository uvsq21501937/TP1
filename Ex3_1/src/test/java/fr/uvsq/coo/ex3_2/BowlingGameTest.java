/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yarmanuel
 */
public class BowlingGameTest {
    
    @Test
    public void testGutterGame()throws Exception{
        Game g= new Game();
        for (int i=0;i<20; i++){
            g.roll(0);
            assertEquals(0, g.score());
        }
        
    }
}
