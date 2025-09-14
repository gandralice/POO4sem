package com.example.demospring.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Furadeira")
public class Furadeira extends Maquina{
    
    @Column(nullable = true)
    private Double diametroMaximo;
    @Column(nullable = true)
    private int rotacaoMaxima;

    public Furadeira() {
    }

    public Furadeira(Long codigo, int rotacaoMaxima, Double diametroMaximo) {
        super(codigo);
        this.rotacaoMaxima = rotacaoMaxima;
        this.diametroMaximo = diametroMaximo;
    }
    
    public int getRotacaoMaxima() {
        return rotacaoMaxima;
    }

    public void setRotacaoMaxima(int rotacaoMaxima) {
        this.rotacaoMaxima = rotacaoMaxima;
    }

    public Double getDiametroMaximo() {
        return diametroMaximo;
    }

    public void setDiametroMaximo(Double diametroMaximo) {
        this.diametroMaximo = diametroMaximo;
    }

    public String getAtributos()
    {
        return "Rotacao Maxima: " + rotacaoMaxima + ", Diametro Maximo: " + diametroMaximo;
    }
}
