package com.example.payment.domain.valueobject;

import com.example.payment.shared.exception.DomainException;

public final class Dinheiro {

    private final double valor;

    private Dinheiro(double valor) {
        this.valor = valor;
    }

    public static Dinheiro de(double valor) {
        if (valor < 0) {
            throw new DomainException("Valor monetário não pode ser negativo: " + valor);
        }
        return new Dinheiro(valor);
    }

    public static Dinheiro zero() {
        return new Dinheiro(0);
    }

    public Dinheiro somar(Dinheiro outro) {
        return new Dinheiro(this.valor + outro.valor);
    }

    public Dinheiro subtrair(Dinheiro outro) {
        double resultado = this.valor - outro.valor;
        return new Dinheiro(Math.max(resultado, 0));
    }

    public Dinheiro multiplicar(double fator) {
        return new Dinheiro(this.valor * fator);
    }

    public Dinheiro minimo(Dinheiro teto) {
        return valor <= teto.valor ? this : teto;
    }

    public double valor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("R$ %.2f", valor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dinheiro other)) return false;
        return Double.compare(valor, other.valor) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(valor);
    }
}
