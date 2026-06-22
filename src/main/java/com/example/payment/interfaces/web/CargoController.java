package com.example.payment.interfaces.web;

import com.example.payment.domain.entity.Cargo;
import com.example.payment.domain.repository.CargoRepository;
import com.example.payment.domain.valueobject.Dinheiro;
import com.example.payment.interfaces.web.dto.CargoRequest;
import com.example.payment.interfaces.web.dto.CargoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    private final CargoRepository cargoRepository;

    public CargoController(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    @PostMapping
    public ResponseEntity<CargoResponse> criar(@RequestBody CargoRequest request) {
        Cargo cargo = new Cargo(
                request.nome(),
                request.setor(),
                Dinheiro.de(request.salarioBase()),
                request.horasFixasMensais()
        );
        Cargo salvo = cargoRepository.salvar(cargo);
        return ResponseEntity.ok(CargoResponse.de(salvo));
    }

    @GetMapping
    public List<CargoResponse> listar() {
        return cargoRepository.listarTodos().stream()
                .map(CargoResponse::de)
                .toList();
    }

    @GetMapping("/{nome}")
    public ResponseEntity<CargoResponse> buscarPorNome(@PathVariable String nome) {
        return cargoRepository.buscarPorNome(nome)
                .map(CargoResponse::de)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
