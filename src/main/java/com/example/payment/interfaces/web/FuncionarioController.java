package com.example.payment.interfaces.web;

import com.example.payment.domain.entity.Funcionario;
import com.example.payment.domain.repository.FuncionarioRepository;
import com.example.payment.domain.valueobject.NomeCompleto;
import com.example.payment.interfaces.web.dto.FuncionarioRequest;
import com.example.payment.interfaces.web.dto.FuncionarioResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @PostMapping
    public ResponseEntity<FuncionarioResponse> criar(@RequestBody FuncionarioRequest request) {
        Funcionario funcionario = new Funcionario(
                NomeCompleto.de(request.primeiroNome(), request.segundoNome()),
                request.contaBancaria(),
                request.endereco(),
                request.dataEntrada(),
                request.dataNascimento()
        );
        Funcionario salvo = funcionarioRepository.salvar(funcionario);
        return ResponseEntity.ok(FuncionarioResponse.de(salvo));
    }

    @GetMapping
    public List<FuncionarioResponse> listar() {
        return funcionarioRepository.listarTodos().stream()
                .map(FuncionarioResponse::de)
                .toList();
    }

    @GetMapping("/{primeiroNome}")
    public ResponseEntity<FuncionarioResponse> buscarPorPrimeiroNome(@PathVariable String primeiroNome) {
        return funcionarioRepository.buscarPorPrimeiroNome(primeiroNome)
                .map(FuncionarioResponse::de)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
