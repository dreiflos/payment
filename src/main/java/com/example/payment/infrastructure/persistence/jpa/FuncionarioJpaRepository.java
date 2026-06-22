package com.example.payment.infrastructure.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioJpaRepository extends JpaRepository<FuncionarioJpaEntity, Long> {

    Optional<FuncionarioJpaEntity> findByPrimeiroNomeIgnoreCase(String primeiroNome);
}
