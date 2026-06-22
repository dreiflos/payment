package com.example.payment.interfaces.web.dto;

import java.time.LocalDate;

public record FuncionarioRequest(
        String primeiroNome,
        String segundoNome,
        String contaBancaria,
        String endereco,
        LocalDate dataEntrada,
        LocalDate dataNascimento
) {
}
