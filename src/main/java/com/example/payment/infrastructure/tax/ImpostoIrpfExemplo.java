package com.example.payment.infrastructure.tax;

import com.example.payment.domain.service.CalculadorImposto;
import com.example.payment.domain.valueobject.Dinheiro;

public class ImpostoIrpfExemplo implements CalculadorImposto {

    private static final double FAIXA_ISENTA = 2259.20;
    private static final double ALIQUOTA = 0.15;

    @Override
    public Dinheiro calcular(Dinheiro baseCalculo) {
        if (baseCalculo.valor() <= FAIXA_ISENTA) {
            return Dinheiro.zero();
        }
        double excedente = baseCalculo.valor() - FAIXA_ISENTA;
        return Dinheiro.de(excedente * ALIQUOTA);
    }

    @Override
    public String descricao() {
        return "IRPF (exemplo simplificado, isento até R$ 2.259,20 + 15% sobre o excedente)";
    }
}
