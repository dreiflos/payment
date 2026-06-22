package com.example.payment.infrastructure.persistence;

import com.example.payment.domain.entity.Funcionario;
import com.example.payment.domain.valueobject.NomeCompleto;
import com.example.payment.infrastructure.persistence.jpa.FuncionarioJpaEntity;

final class FuncionarioMapper {

    private FuncionarioMapper() {
    }

    static Funcionario toDomain(FuncionarioJpaEntity entity) {
        return new Funcionario(
                NomeCompleto.de(entity.getPrimeiroNome(), entity.getSegundoNome()),
                entity.getContaBancaria(),
                entity.getEndereco(),
                entity.getDataEntrada(),
                entity.getDataNascimento()
        );
    }

    static FuncionarioJpaEntity toJpaEntity(Funcionario funcionario) {
        return new FuncionarioJpaEntity(
                null,
                funcionario.getNome().primeiro(),
                funcionario.getNome().segundo(),
                funcionario.getContaBancaria(),
                funcionario.getEndereco(),
                funcionario.getDataEntrada(),
                funcionario.getDataNascimento()
        );
    }
}
