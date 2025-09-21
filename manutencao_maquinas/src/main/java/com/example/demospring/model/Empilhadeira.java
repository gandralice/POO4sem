package com.example.demospring.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Empilhadeira")
public class Empilhadeira extends Maquina {

    @Column(nullable = true)
    private Double alturaMaxima;

    @Column(nullable = true)
    private String motor; // "Elétrico" ou "Combustível"

    public Empilhadeira() {
    }

    public Empilhadeira(Long codigo, Double alturaMaxima, String motor) {
        super(codigo);
        this.alturaMaxima = alturaMaxima;
        this.motor = motor;
    }

    public Double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(Double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getAtributos() {
        return "Altura Máxima: " + alturaMaxima + ", Motor: " + motor;
    }

    @Override
    public String getParametros() {
        return getAtributos(); // Ou algo mais específico
    }
}
