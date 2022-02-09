package com.teste;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraNovaTest {

    @Test
    public void deveSomarDoisValores() {
        int valorA = 3;
        int valorB = 2;

        CalculadoraNova calc = new CalculadoraNova();
        int soma = calc.somar(valorA, valorB);

        assertEquals(5, soma);
    }

    @Test
    public void deveSomarTresValores() {
        int valorA = 3;
        int valorB = 2;
        int valorC = 1;

        CalculadoraNova calc = new CalculadoraNova();
        int soma = calc.somar(valorA, valorB, valorC);

        assertEquals(6, soma);
    }



}
