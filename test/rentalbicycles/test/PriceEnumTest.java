/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalbicycles.test;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import rentalbicycles.PriceEnum;
  import static org.junit.Assert.assertFalse;

/**
 *
 * @author ebing
 */
public class PriceEnumTest{
    
    
    @Test
    public void testEnum(){
        //PriceEnum
        assertEquals(PriceEnum.DAY,PriceEnum.getByValue(20.0));
        assertEquals(PriceEnum.HOUR,PriceEnum.getByValue(5.0));
        assertEquals(PriceEnum.WEEK,PriceEnum.getByValue(60.0));
        assertEquals(PriceEnum.PROMO,PriceEnum.getByValue(30));
        
    }

    
    
}
