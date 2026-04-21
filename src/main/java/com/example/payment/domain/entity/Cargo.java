package com.example.payment.domain.entity;

import com.example.payment.domain.valueobject.Dinheiro;
import com.example.payment.shared.exception.DomainException;

public final class Cargo {

    private final String nome;
    private final String setor;
    private final Dinheiro salarioBase;
    private final double horasFixasMensais;

    public Cargo(String nome, String setor, Dinheiro salarioBase, double horasFixasMensais) {
        validar(nome, setor, horasFixasMensais);
        this.nome = nome;
        this.setor = setor;
        this.salarioBase = salarioBase;
        this.horasFixasMensais = horasFixasMensais;
    }

    private static void validar(String nome, String setor, double horas) {
        if (nome == null || nome.isBlank()) throw new DomainException("Nome do cargo inválido.");
        if (setor == null || setor.isBlank()) throw new DomainException("Setor inválido.");
        if (horas <= 0) throw new DomainException("Horas fixas devem ser positivas.");
    }

    public Dinheiro valorPorHora() {
        return Dinheiro.de(salarioBase.valor() / horasFixasMensais);
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public Dinheiro getSalarioBase() {
        return salarioBase;
    }

    public double getHorasFixasMensais() {
        return horasFixasMensais;
    }
}
