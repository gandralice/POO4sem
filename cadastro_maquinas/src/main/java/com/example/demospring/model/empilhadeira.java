package com.example.demospring.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Empilhadeira")
public class Empilhadeira extends Maquina {

    @Column(nullable = true)
    private Double capacidadeCarga; // Em toneladas

    @Column(nullable = true)
    private Double alturaElevacao; // Em metros

    public Empilhadeira() {
        super();
    }

    public Empilhadeira(Long codigo, Double capacidadeCarga, Double alturaElevacao) {
        super(codigo);
        this.capacidadeCarga = capacidadeCarga;
        this.alturaElevacao = alturaElevacao;
    }

    // Getters e Setters
    public Double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(Double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public Double getAlturaElevacao() {
        return alturaElevacao;
    }

    public void setAlturaElevacao(Double alturaElevacao) {
        this.alturaElevacao = alturaElevacao;
    }

    @Override
    public String getAtributos() {
        return "Capacidade de Carga: " + capacidadeCarga + "t, Altura de Elevação: " + alturaElevacao + "m";
    }
}