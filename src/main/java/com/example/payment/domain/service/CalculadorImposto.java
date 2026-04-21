package com.example.payment.domain.service;

import com.example.payment.domain.valueobject.Dinheiro;


public interface CalculadorImposto {

    Dinheiro calcular(Dinheiro baseCalculo);

    String descricao();
}
