package com.ljpeixoto.loja.desconto;

import com.ljpeixoto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        DescontoQuantidadeItens descontoQuantidadeItens = new DescontoQuantidadeItens();
        BigDecimal desconto = descontoQuantidadeItens.calcular(orcamento);
        if (desconto.compareTo(ZERO) > 0) {
            return desconto;
        }

        DescontoValor descontoValor = new DescontoValor();
        desconto = descontoValor.calcular(orcamento);

        return desconto;
    }
}
