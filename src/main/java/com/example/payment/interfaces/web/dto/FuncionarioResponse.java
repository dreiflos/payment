package com.example.payment.interfaces.web.dto;

import com.example.payment.domain.entity.Funcionario;

import java.time.LocalDate;

public record FuncionarioResponse(
        String nomeCompleto,
        String contaBancaria,
        String endereco,
        LocalDate dataEntrada,
        LocalDate dataNascimento
) {
    public static FuncionarioResponse de(Funcionario funcionario) {
        return new FuncionarioResponse(
                funcionario.getNome().completo(),
                funcionario.getContaBancaria(),
                funcionario.getEndereco(),
                funcionario.getDataEntrada(),
                funcionario.getDataNascimento()
        );
    }
}
