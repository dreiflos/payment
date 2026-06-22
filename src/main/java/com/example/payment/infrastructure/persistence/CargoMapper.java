package com.example.payment.infrastructure.persistence;

import com.example.payment.domain.entity.Cargo;
import com.example.payment.domain.valueobject.Dinheiro;
import com.example.payment.infrastructure.persistence.jpa.CargoJpaEntity;

final class CargoMapper {

    private CargoMapper() {
    }

    static Cargo toDomain(CargoJpaEntity entity) {
        return new Cargo(
                entity.getNome(),
                entity.getSetor(),
                Dinheiro.de(entity.getSalarioBase()),
                entity.getHorasFixasMensais()
        );
    }

    static CargoJpaEntity toJpaEntity(Cargo cargo) {
        return new CargoJpaEntity(
                null,
                cargo.getNome(),
                cargo.getSetor(),
                cargo.getSalarioBase().valor(),
                cargo.getHorasFixasMensais()
        );
    }
}
