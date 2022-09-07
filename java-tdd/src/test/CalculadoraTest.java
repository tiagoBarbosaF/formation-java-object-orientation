package test;

import br.com.tiagobarbosa.java.tdd.domain.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void deveSomarDoisNumerosPositivos() {
        int soma = calculadora.somar(5, 2);
        Assert.assertEquals(7, soma);
    }
}