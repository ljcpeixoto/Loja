package com.ljpeixoto.loja.desconto;

import com.ljpeixoto.loja.orcamento.Orcamento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDeDescontosTest {

    private CalculadoraDeDescontos calculadoraDeDescontos;

    @BeforeEach
    void setUp() {
        calculadoraDeDescontos = new CalculadoraDeDescontos();
    }

    @Test
    void calcularOrcamentoComMuitosItens() {
        // Cenário
        Orcamento orcamento = new Orcamento(new BigDecimal("100.00"), 6);
        BigDecimal descontoEsperado = new BigDecimal("10.00");

        // Ação
        BigDecimal descontoCalculado = calculadoraDeDescontos.calcular(orcamento);

        // Verificações
        assertEquals(descontoEsperado.doubleValue(), descontoCalculado.doubleValue(), "O desconto calculado deve ser igual ao esperado");

    }

    @Test
    void calcularOrcamentoComValorAlto() {
        // Cenário
        Orcamento orcamento = new Orcamento(new BigDecimal("1000.00"), 2);
        BigDecimal descontoEsperado = new BigDecimal("50.00");

        // Ação
        BigDecimal descontoCalculado = calculadoraDeDescontos.calcular(orcamento);

        // Verificações
        assertEquals(descontoEsperado.doubleValue(), descontoCalculado.doubleValue(), "O desconto calculado deve ser igual ao esperado");

    }

}