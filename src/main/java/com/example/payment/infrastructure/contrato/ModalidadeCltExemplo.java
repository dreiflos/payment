package com.example.payment.infrastructure.contrato;

import com.example.payment.domain.entity.Cargo;
import com.example.payment.domain.service.ModalidadeContrato;
import com.example.payment.domain.valueobject.Dinheiro;
import com.example.payment.domain.valueobject.RegistroHoras;

public class ModalidadeCltExemplo implements ModalidadeContrato {

    private static final double FATOR_HORA_EXTRA = 1.5;

    @Override
    public Dinheiro calcularSalarioBruto(Cargo cargo, RegistroHoras horas) {
        Dinheiro valorHora = cargo.valorPorHora();
        Dinheiro acrescimoExtras = valorHora.multiplicar(horas.extras() * FATOR_HORA_EXTRA);
        Dinheiro descontoFaltas = valorHora.multiplicar(horas.faltantes());

        return cargo.getSalarioBase()
                .somar(acrescimoExtras)
                .subtrair(descontoFaltas);
    }

    @Override
    public String descricaoEncargos(Cargo cargo) {
        return "CLT: FGTS 8% + encargos trabalhistas padrão";
    }

    @Override
    public String nome() {
        return "CLT";
    }
}
