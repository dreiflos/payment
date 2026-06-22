package com.example.payment.interfaces.web.dto;

public record HoleriteRequest(
        String primeiroNomeFuncionario,
        String nomeCargo,
        double horasExtras,
        double horasFaltantes
) {
}
