package com.example.payment.domain.service;

import com.example.payment.domain.entity.Cargo;
import com.example.payment.domain.entity.Funcionario;
import com.example.payment.domain.entity.Holerite;
import com.example.payment.domain.valueobject.Dinheiro;
import com.example.payment.domain.valueobject.RegistroHoras;

public final class GeradorHolerite {

    private final CalculadorImposto calculadorInss;
    private final CalculadorImposto calculadorIrpf;
    private final ModalidadeContrato modalidade;

    public GeradorHolerite(
            CalculadorImposto calculadorInss,
            CalculadorImposto calculadorIrpf,
            ModalidadeContrato modalidade
    ) {
        this.calculadorInss = calculadorInss;
        this.calculadorIrpf = calculadorIrpf;
        this.modalidade = modalidade;
    }

    public Holerite gerar(Funcionario funcionario, Cargo cargo, RegistroHoras horas) {
        Dinheiro bruto = modalidade.calcularSalarioBruto(cargo, horas);
        Dinheiro inss  = calculadorInss.calcular(bruto);
        Dinheiro baseIrpf = bruto.subtrair(inss);
        Dinheiro irpf  = calculadorIrpf.calcular(baseIrpf);

        return new Holerite(
                funcionario,
                cargo,
                bruto,
                inss,
                irpf,
                calculadorInss.descricao(),
                calculadorIrpf.descricao()
        );
    }
}
