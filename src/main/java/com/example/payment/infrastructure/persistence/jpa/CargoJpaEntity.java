package com.example.payment.infrastructure.persistence.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cargos")
public class CargoJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String setor;
    private double salarioBase;
    private double horasFixasMensais;

    public CargoJpaEntity() {
    }

    public CargoJpaEntity(Long id, String nome, String setor, double salarioBase, double horasFixasMensais) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.salarioBase = salarioBase;
        this.horasFixasMensais = horasFixasMensais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasFixasMensais() {
        return horasFixasMensais;
    }

    public void setHorasFixasMensais(double horasFixasMensais) {
        this.horasFixasMensais = horasFixasMensais;
    }
}
