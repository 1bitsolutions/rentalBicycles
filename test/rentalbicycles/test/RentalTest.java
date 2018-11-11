/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalbicycles.test;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import rentalbicycles.Rental;

/**
 *
 * @author ebing
 */
public class RentalTest{
    
    
    @Test
    public void Rental(){
        Rental rent = new Rental();
        double total = rent.Rental(1,0,1,0);
        assertEquals(20.0,total);
    }
    
    @Test
    public void Rental5bicycles(){
        Rental rent = new Rental();
        double total = rent.Rental(5,0,1,0);
        assertEquals(70.0,total);
    }
    
    @Test
    public void Rental2bicycles(){
        Rental rent = new Rental();
        double total = rent.Rental(2,1,1,1);
        assertEquals(170.0,total);
    }
    
    @Test
    public void Rental3bicycles(){
        Rental rent = new Rental();
        double total = rent.Rental(3,1,1,1);
        assertEquals(178.5,total);
    }

}
