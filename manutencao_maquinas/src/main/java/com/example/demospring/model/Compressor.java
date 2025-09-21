package com.example.demospring.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Compressor")
public class Compressor extends Maquina{
    
    @Column(nullable = true)
    private Double pressaoNominal;
    @Column(nullable = true)
    private Double vazaoNominal;

    public Compressor() {
        super();
    }

    public Compressor(Long codigo, Double pressaoNominal, Double vazaoNominal) {
        super(codigo);
        this.pressaoNominal = pressaoNominal;
        this.vazaoNominal = vazaoNominal;
    }

    public Double getPressaoNominal() {
        return pressaoNominal;
    }

    public void setPressaoNominal(Double pressaoNominal) {
        this.pressaoNominal = pressaoNominal;
    }

    public Double getVazaoNominal() {
        return vazaoNominal;
    }

    public void setVazaoNominal(Double vazaoNominal) {
        this.vazaoNominal = vazaoNominal;
    }

    public String getAtributos()
    {
        return "Pressao Nominal: " + pressaoNominal + ", Vazao Nominal: " + vazaoNominal;
    }

    @Override
    public String getParametros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getParametros'");
    }
}
