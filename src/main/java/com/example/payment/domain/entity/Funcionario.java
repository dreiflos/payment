package com.example.payment.domain.entity;

import com.example.payment.domain.valueobject.NomeCompleto;

import java.time.LocalDate;


public final class Funcionario {

    private final NomeCompleto nome;
    private final String contaBancaria;
    private final String endereco;
    private final LocalDate dataEntrada;
    private final LocalDate dataNascimento;

    public Funcionario(
            NomeCompleto nome,
            String contaBancaria,
            String endereco,
            LocalDate dataEntrada,
            LocalDate dataNascimento
    ) {
        this.nome = nome;
        this.contaBancaria = contaBancaria;
        this.endereco = endereco;
        this.dataEntrada = dataEntrada;
        this.dataNascimento = dataNascimento;
    }

    public NomeCompleto getNome() {
        return nome;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public String getEndereco() {
        return endereco;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Funcionario{nome=" + nome + "}";
    }
}
