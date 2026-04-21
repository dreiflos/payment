package com.example.payment.domain.entity;

import com.example.payment.domain.valueobject.Dinheiro;

public final class Holerite {

    private final Funcionario funcionario;
    private final Cargo cargo;
    private final Dinheiro salarioBruto;
    private final Dinheiro descontoInss;
    private final Dinheiro descontoIrpf;
    private final String descricaoInss;
    private final String descricaoIrpf;

    public Holerite(
            Funcionario funcionario,
            Cargo cargo,
            Dinheiro salarioBruto,
            Dinheiro descontoInss,
            Dinheiro descontoIrpf,
            String descricaoInss,
            String descricaoIrpf
    ) {
        this.funcionario = funcionario;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
        this.descontoInss = descontoInss;
        this.descontoIrpf = descontoIrpf;
        this.descricaoInss = descricaoInss;
        this.descricaoIrpf = descricaoIrpf;
    }

    public Dinheiro totalDescontos() {
        return descontoInss.somar(descontoIrpf);
    }

    public Dinheiro salarioLiquido() {
        return salarioBruto.subtrair(totalDescontos());
    }

    public Funcionario getFuncionario() { return funcionario; }
    public Cargo getCargo() { return cargo; }
    public Dinheiro getSalarioBruto() { return salarioBruto; }
    public Dinheiro getDescontoInss() { return descontoInss; }
    public Dinheiro getDescontoIrpf() { return descontoIrpf; }
    public String getDescricaoInss() { return descricaoInss; }
    public String getDescricaoIrpf() { return descricaoIrpf; }
}
