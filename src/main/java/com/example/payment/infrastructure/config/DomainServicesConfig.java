package com.example.payment.infrastructure.config;

import com.example.payment.domain.service.CalculadorImposto;
import com.example.payment.domain.service.GeradorHolerite;
import com.example.payment.domain.service.ModalidadeContrato;
import com.example.payment.infrastructure.contrato.ModalidadeCltExemplo;
import com.example.payment.infrastructure.tax.ImpostoInssExemplo;
import com.example.payment.infrastructure.tax.ImpostoIrpfExemplo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainServicesConfig {

    @Bean
    public CalculadorImposto calculadorInss() {
        return new ImpostoInssExemplo();
    }

    @Bean
    public CalculadorImposto calculadorIrpf() {
        return new ImpostoIrpfExemplo();
    }

    @Bean
    public ModalidadeContrato modalidadeContrato() {
        return new ModalidadeCltExemplo();
    }

    @Bean
    public GeradorHolerite geradorHolerite(
            CalculadorImposto calculadorInss,
            CalculadorImposto calculadorIrpf,
            ModalidadeContrato modalidadeContrato
    ) {
        return new GeradorHolerite(calculadorInss, calculadorIrpf, modalidadeContrato);
    }
}
