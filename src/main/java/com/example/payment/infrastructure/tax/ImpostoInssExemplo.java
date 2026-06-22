package com.example.payment.infrastructure.tax;

import com.example.payment.domain.service.CalculadorImposto;
import com.example.payment.domain.valueobject.Dinheiro;

public class ImpostoInssExemplo implements CalculadorImposto {

    private static final double ALIQUOTA = 0.11;
    private static final Dinheiro TETO = Dinheiro.de(908.85);

    @Override
    public Dinheiro calcular(Dinheiro baseCalculo) {
        return baseCalculo.multiplicar(ALIQUOTA).minimo(TETO);
    }

    @Override
    public String descricao() {
        return "INSS (exemplo simplificado, 11% até o teto)";
    }
}
