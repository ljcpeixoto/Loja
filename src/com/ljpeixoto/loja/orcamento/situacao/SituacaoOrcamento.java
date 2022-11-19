package com.ljpeixoto.loja.orcamento.situacao;

import com.ljpeixoto.loja.exception.TransicaoInvalidaException;
import com.ljpeixoto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new TransicaoInvalidaException("Orçamento não pode ser aprovado.");
    }

    public void reprovar(Orcamento orcamento) {
        throw new TransicaoInvalidaException("Orçamento não pode ser reprovado.");
    }

    public void finalizar(Orcamento orcamento) {
        throw new TransicaoInvalidaException("Orçamento não pode ser finalizado.");
    }

}
