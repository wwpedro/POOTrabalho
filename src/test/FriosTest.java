package test;

import org.junit.Assert;
import org.junit.Test;

import Model.Frios;

public class FriosTest {
    
    @Test
    public void testSetAndGetTemperatura() {
        Frios frios = new Frios(1, "Queijo", 10.99f);
        
        float temperatura = -5.0f;
        frios.setTemperatura(temperatura);
        
        double retrievedTemperatura = frios.getTemperatura();
        Assert.assertEquals(temperatura, retrievedTemperatura, 0.001);
    }
}
