package com.example.payment.interfaces.web.dto;

public record CargoRequest(
        String nome,
        String setor,
        double salarioBase,
        double horasFixasMensais
) {
}
