package com.ljpeixoto.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    BigDecimal valor;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
