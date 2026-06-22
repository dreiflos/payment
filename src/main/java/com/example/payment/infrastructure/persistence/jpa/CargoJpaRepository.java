package com.example.payment.infrastructure.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CargoJpaRepository extends JpaRepository<CargoJpaEntity, Long> {

    Optional<CargoJpaEntity> findByNomeIgnoreCase(String nome);
}
