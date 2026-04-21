package com.example.payment.shared.exception;


public final class DomainException extends RuntimeException {

    public DomainException(String mensagem) {
        super(mensagem);
    }

    public DomainException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
