package com.ljpeixoto.loja.desconto;

import com.ljpeixoto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoQuantidadeItens(
                new DescontoValor(
                        new SemDesconto()
                )
        );
        return cadeiaDeDescontos.calcular(orcamento);
    }
}
