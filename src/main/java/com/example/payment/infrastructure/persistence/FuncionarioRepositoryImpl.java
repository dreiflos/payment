package com.example.payment.infrastructure.persistence;

import com.example.payment.domain.entity.Funcionario;
import com.example.payment.domain.repository.FuncionarioRepository;
import com.example.payment.infrastructure.persistence.jpa.FuncionarioJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class FuncionarioRepositoryImpl implements FuncionarioRepository {

    private final FuncionarioJpaRepository jpaRepository;

    public FuncionarioRepositoryImpl(FuncionarioJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Optional<Funcionario> buscarPorPrimeiroNome(String nome) {
        return jpaRepository.findByPrimeiroNomeIgnoreCase(nome).map(FuncionarioMapper::toDomain);
    }

    @Override
    public List<Funcionario> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(FuncionarioMapper::toDomain)
                .toList();
    }

    @Override
    public Funcionario salvar(Funcionario funcionario) {
        var salvo = jpaRepository.save(FuncionarioMapper.toJpaEntity(funcionario));
        return FuncionarioMapper.toDomain(salvo);
    }
}
