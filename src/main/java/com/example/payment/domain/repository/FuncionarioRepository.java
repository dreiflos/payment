package com.example.payment.domain.repository;

import com.example.payment.domain.entity.Funcionario;
import java.util.List;
import java.util.Optional;

public interface FuncionarioRepository {

    Optional<Funcionario> buscarPorPrimeiroNome(String nome);

    List<Funcionario> listarTodos();

    Funcionario salvar(Funcionario funcionario);
}
