package com.example.payment.interfaces.web.dto;

import com.example.payment.domain.entity.Holerite;

public record HoleriteResponse(
        String funcionario,
        String cargo,
        double salarioBruto,
        double descontoInss,
        String descricaoInss,
        double descontoIrpf,
        String descricaoIrpf,
        double totalDescontos,
        double salarioLiquido
) {
    public static HoleriteResponse de(Holerite holerite) {
        return new HoleriteResponse(
                holerite.getFuncionario().getNome().completo(),
                holerite.getCargo().getNome(),
                holerite.getSalarioBruto().valor(),
                holerite.getDescontoInss().valor(),
                holerite.getDescricaoInss(),
                holerite.getDescontoIrpf().valor(),
                holerite.getDescricaoIrpf(),
                holerite.totalDescontos().valor(),
                holerite.salarioLiquido().valor()
        );
    }
}
