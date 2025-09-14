package entities;

import java.util.HashSet;

public class Filme {
    private String nome;
    private Diretor diretor;
    private HashSet<Ator> elenco;
    private double nota;

    public Filme(String nome, Diretor diretor, HashSet<Ator> elenco, double nota) {
        this.nome = nome;
        this.diretor = diretor;
        this.elenco = elenco;
        this.nota = nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Diretor getDiretor() {
        return diretor;
    }
    public void setDiretor(Diretor diretor) {
        this.diretor = new Diretor(diretor);
    }
    public HashSet<Ator> getElenco() {
        return new HashSet<Ator>(elenco);
    }
    public void setElenco(HashSet<Ator> elenco) {
        this.elenco = elenco;
    }
    public double getNota() {
        return nota;
    }

}
