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
    void calcular() {
        // Cenário
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        BigDecimal impostoEsperado = new BigDecimal("10.0");

        // Ação
        BigDecimal impostoCalculado =  calculadoraDeImpostos.calcular(orcamento, TipoImposto.ICMS);

        // Verificações
        assertEquals(impostoEsperado, impostoCalculado);

    }
}