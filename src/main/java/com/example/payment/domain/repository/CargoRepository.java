package com.example.payment.domain.repository;

import com.example.payment.domain.entity.Cargo;
import java.util.List;
import java.util.Optional;

public interface CargoRepository {

    Optional<Cargo> buscarPorNome(String nome);

    List<Cargo> listarTodos();
}
