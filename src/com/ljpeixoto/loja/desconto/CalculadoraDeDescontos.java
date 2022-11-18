package com.ljpeixoto.loja.desconto;

import com.ljpeixoto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        DescontoQuantidadeItens descontoQuantidadeItens = new DescontoQuantidadeItens(
                new DescontoValor(
                        new SemDesconto()
                )
        );
        return descontoQuantidadeItens.calcular(orcamento);
    }
}
