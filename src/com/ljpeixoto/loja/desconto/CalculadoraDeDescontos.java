package com.ljpeixoto.loja.desconto;

import com.ljpeixoto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        return ZERO;
    }
}
