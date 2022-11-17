package com.ljpeixoto.loja.imposto;

import com.ljpeixoto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
