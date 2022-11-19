package com.ljpeixoto.loja.exception;

public class TransicaoInvalidaException extends RuntimeException {
    public TransicaoInvalidaException(String mensagem) {
        super(mensagem);
    }
}
