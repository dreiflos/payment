package com.example.payment.domain.valueobject;

import com.example.payment.shared.exception.DomainException;

public final class NomeCompleto {

    private final String primeiro;
    private final String segundo;

    private NomeCompleto(String primeiro, String segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public static NomeCompleto de(String primeiro, String segundo) {
        validarNaoVazio(primeiro, "Primeiro nome");
        validarNaoVazio(segundo, "Segundo nome");
        return new NomeCompleto(primeiro.trim(), segundo.trim());
    }

    private static void validarNaoVazio(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new DomainException(campo + " não pode ser vazio.");
        }
    }

    public String completo() {
        return primeiro + " " + segundo;
    }

    public String primeiro() {
        return primeiro;
    }

    public String segundo() {
        return segundo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NomeCompleto other)) return false;
        return primeiro.equalsIgnoreCase(other.primeiro)
                && segundo.equalsIgnoreCase(other.segundo);
    }

    @Override
    public int hashCode() {
        return 31 * primeiro.toLowerCase().hashCode() + segundo.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return completo();
    }
}
