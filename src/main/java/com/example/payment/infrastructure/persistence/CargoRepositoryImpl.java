package com.example.payment.infrastructure.persistence;

import com.example.payment.domain.entity.Cargo;
import com.example.payment.domain.repository.CargoRepository;
import com.example.payment.infrastructure.persistence.jpa.CargoJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CargoRepositoryImpl implements CargoRepository {

    private final CargoJpaRepository jpaRepository;

    public CargoRepositoryImpl(CargoJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Optional<Cargo> buscarPorNome(String nome) {
        return jpaRepository.findByNomeIgnoreCase(nome).map(CargoMapper::toDomain);
    }

    @Override
    public List<Cargo> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(CargoMapper::toDomain)
                .toList();
    }

    @Override
    public Cargo salvar(Cargo cargo) {
        var salvo = jpaRepository.save(CargoMapper.toJpaEntity(cargo));
        return CargoMapper.toDomain(salvo);
    }
}
