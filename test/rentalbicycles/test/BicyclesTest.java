package rentalbicycles.test;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import rentalbicycles.Bicycles;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ebing
 */
public class BicyclesTest{

    int cant = 1;
    Bicycles bic = new Bicycles();
    
    @Test
    public void BicyclesTest() {
        bic.setCant(1);
        assertEquals(cant,bic.getCant());
    }
}
