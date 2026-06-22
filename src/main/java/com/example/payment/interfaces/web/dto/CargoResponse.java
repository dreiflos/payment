package com.example.payment.interfaces.web.dto;

import com.example.payment.domain.entity.Cargo;

public record CargoResponse(
        String nome,
        String setor,
        double salarioBase,
        double horasFixasMensais,
        double valorPorHora
) {
    public static CargoResponse de(Cargo cargo) {
        return new CargoResponse(
                cargo.getNome(),
                cargo.getSetor(),
                cargo.getSalarioBase().valor(),
                cargo.getHorasFixasMensais(),
                cargo.valorPorHora().valor()
        );
    }
}
