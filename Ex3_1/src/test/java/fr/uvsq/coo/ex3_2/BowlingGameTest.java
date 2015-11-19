/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_2;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Yarmanuel
 */
public class BowlingGameTest {
    private  Game g;
    
    @Before
    public void setUp() throws Exception{
        g=new Game();
    }
    
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) g.roll(pins);
    }
    
    @Test
    public void testGutterGame()throws Exception{
        rollMany(20, 0);
            assertEquals(0, g.score());
        }
        
    
    @Test
    public void testAllOnes ()throws Exception{
        rollMany(20, 1);
        assertEquals(20, g.score());
}
          
 
}