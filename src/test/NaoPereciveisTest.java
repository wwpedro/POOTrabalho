package test;

import org.junit.Assert;
import org.junit.Test;

import Model.NaoPereciveis;


public class NaoPereciveisTest {

    @Test
    public void testNaoPereciveisConstructor() {
        int id = 1;
        String nome = "Arroz";
        float preco = 5.99f;
        
        NaoPereciveis naoPereciveis = new NaoPereciveis(id, nome, preco);
        
        Assert.assertEquals(id, naoPereciveis.getID());
        Assert.assertEquals(nome, naoPereciveis.getNome());
        Assert.assertEquals(preco, naoPereciveis.getPreco(), 0.001);
    }
}
