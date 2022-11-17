package com.ljpeixoto.loja.imposto;

import com.ljpeixoto.loja.orcamento.Orcamento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDeImpostosTest {

    private CalculadoraDeImpostos calculadoraDeImpostos;

    @BeforeEach
    public void setup() {
        calculadoraDeImpostos = new CalculadoraDeImpostos();
    }

    @Test
    void calcularICMS() {
        // Cenário
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        BigDecimal impostoEsperado = new BigDecimal("10.00");

        // Ação
        BigDecimal impostoCalculado =  calculadoraDeImpostos.calcular(orcamento, new ICMS());

        // Verificações
        assertEquals(impostoEsperado, impostoCalculado);

    }

    @Test
    void calcularISS() {
        // Cenário
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        BigDecimal impostoEsperado = new BigDecimal("6.00");

        // Ação
        BigDecimal impostoCalculado =  calculadoraDeImpostos.calcular(orcamento, new ISS());

        // Verificações
        assertEquals(impostoEsperado.doubleValue(), impostoCalculado.doubleValue(), "O valor do imposto calculado deve ser igual ao espearado.");

    }

}