package com.example.payment.domain.valueobject;

import com.example.payment.shared.exception.DomainException;

public final class RegistroHoras {

    private final double extras;
    private final double faltantes;

    private RegistroHoras(double extras, double faltantes) {
        this.extras = extras;
        this.faltantes = faltantes;
    }

    public static RegistroHoras de(double extras, double faltantes) {
        if (extras < 0) {
            throw new DomainException("Horas extras não podem ser negativas.");
        }
        if (faltantes < 0) {
            throw new DomainException("Horas faltantes não podem ser negativas.");
        }
        return new RegistroHoras(extras, faltantes);
    }

    public static RegistroHoras zerado() {
        return new RegistroHoras(0, 0);
    }

    public RegistroHoras acumular(double novasExtras, double novasFaltantes) {
        return RegistroHoras.de(this.extras + novasExtras, this.faltantes + novasFaltantes);
    }

    public double extras() {
        return extras;
    }

    public double faltantes() {
        return faltantes;
    }

    public double saldo() {
        return extras - faltantes;
    }

    @Override
    public String toString() {
        return String.format("Extras=%.1fh / Faltantes=%.1fh", extras, faltantes);
    }
}
