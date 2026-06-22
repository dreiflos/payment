package com.example.payment.interfaces.web;

import com.example.payment.domain.entity.Cargo;
import com.example.payment.domain.entity.Funcionario;
import com.example.payment.domain.repository.CargoRepository;
import com.example.payment.domain.repository.FuncionarioRepository;
import com.example.payment.domain.service.GeradorHolerite;
import com.example.payment.domain.valueobject.RegistroHoras;
import com.example.payment.interfaces.web.dto.HoleriteRequest;
import com.example.payment.interfaces.web.dto.HoleriteResponse;
import com.example.payment.shared.exception.DomainException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holerites")
public class HoleriteController {

    private final FuncionarioRepository funcionarioRepository;
    private final CargoRepository cargoRepository;
    private final GeradorHolerite geradorHolerite;

    public HoleriteController(
            FuncionarioRepository funcionarioRepository,
            CargoRepository cargoRepository,
            GeradorHolerite geradorHolerite
    ) {
        this.funcionarioRepository = funcionarioRepository;
        this.cargoRepository = cargoRepository;
        this.geradorHolerite = geradorHolerite;
    }

    @PostMapping
    public ResponseEntity<HoleriteResponse> gerar(@RequestBody HoleriteRequest request) {
        Funcionario funcionario = funcionarioRepository
                .buscarPorPrimeiroNome(request.primeiroNomeFuncionario())
                .orElseThrow(() -> new DomainException(
                        "Funcionário não encontrado: " + request.primeiroNomeFuncionario()));

        Cargo cargo = cargoRepository
                .buscarPorNome(request.nomeCargo())
                .orElseThrow(() -> new DomainException(
                        "Cargo não encontrado: " + request.nomeCargo()));

        RegistroHoras horas = RegistroHoras.de(request.horasExtras(), request.horasFaltantes());

        var holerite = geradorHolerite.gerar(funcionario, cargo, horas);

        return ResponseEntity.ok(HoleriteResponse.de(holerite));
    }
}
