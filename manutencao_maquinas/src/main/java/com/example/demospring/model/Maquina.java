package com.example.demospring.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_maquina", discriminatorType = DiscriminatorType.STRING)
public abstract class Maquina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private Long codigo;

    // Campo que representa o tipo da máquina via discriminator
    @Column(name = "tipo_maquina", insertable = false, updatable = false)
    private String tipoMaquina;

    @OneToMany(mappedBy = "maquina", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Manutencao> manutencoes = new ArrayList<>();


    public Maquina() {
    }

    public Maquina(Long codigo) {
        this.codigo = codigo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTipoMaquina() {
        return tipoMaquina;
    }

    public List<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public void setCodigo(List<Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }

    // Métodos abstratos que cada subclasse deve implementar
    public abstract String getParametros();

    public abstract String getAtributos();
}
