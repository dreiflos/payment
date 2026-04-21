package com.example.payment.domain.service;

import com.example.payment.domain.entity.Cargo;
import com.example.payment.domain.valueobject.Dinheiro;
import com.example.payment.domain.valueobject.RegistroHoras;


public interface ModalidadeContrato {

    Dinheiro calcularSalarioBruto(Cargo cargo, RegistroHoras horas);

    String descricaoEncargos(Cargo cargo);

    String nome();
}
