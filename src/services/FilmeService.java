package services;

import entities.Ator;
import entities.Diretor;
import entities.Filme;
import repositories.AtorRepo;
import repositories.DiretorRepo;
import repositories.FilmeRepo;

import java.util.HashSet;

public class FilmeService {
    private FilmeRepo fr;
    private AtorRepo ar;
    private DiretorRepo dr;

    public FilmeService() {
        this.fr = new FilmeRepo();
        this.ar = new AtorRepo();
        this.dr = new DiretorRepo();
    }

    public boolean addFilme(String nome, String nomeDiretor, String atores[], double nota) {
        Diretor diretor = new Diretor(nomeDiretor);
        this.dr.addDiretor(diretor);

        HashSet<Ator> elenco = new HashSet<Ator>();

        for(String nomeAtor : atores) {
            Ator ator = new Ator(nomeAtor);
            this.ar.addAtor(ator);
            elenco.add(ator);
        }

        Filme filme = new Filme(nome, diretor, elenco, nota);

        return this.fr.addFilme(filme);
    }
}
