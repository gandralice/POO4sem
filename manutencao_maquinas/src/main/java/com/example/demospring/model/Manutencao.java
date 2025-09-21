package com.example.demospring.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Manutencao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataManutencao;
    private String servicoRealizado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;


    @ManyToOne(fetch = FetchType.LAZY) // adia a a carga da maquina até que seja necessária
    @JoinColumn(name = "maquina_id")
    private Maquina maquina;

    public Manutencao() {
    }

    public Manutencao(LocalDate dataManutencao, String servicoRealizado, Maquina maquina, Funcionario funcionario) {
    this.dataManutencao = dataManutencao;
    this.servicoRealizado = servicoRealizado;
    this.maquina = maquina;
    this.funcionario = funcionario;
}

    
    // getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getDataManutencao() {
        return dataManutencao;
    }   
    public void setDataManutencao(LocalDate dataManutencao) {
        this.dataManutencao = dataManutencao;
    }   
    public String getServicoRealizado() {
        return servicoRealizado;
    }   
    public void setServicoRealizado(String servicoRealizado) {
        this.servicoRealizado = servicoRealizado;
    }   
    public Funcionario getFuncionario() {
    return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Maquina getMaquina() {
        return maquina;
    }
    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }   
}