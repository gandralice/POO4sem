package repositories;

import entities.Ator;

import java.util.HashSet;
import java.util.Iterator;

public class AtorRepo {
    private HashSet<Ator> atores;

    public AtorRepo() {
        this.atores = new HashSet<Ator>();
    }

    public HashSet<Ator> getAtores() {
        return new HashSet<Ator>(this.atores);
    }

    public boolean addAtor(Ator ator) {
        return this.atores.add(ator);
    }

    public  Ator getAtor(String nome) {
        Ator a = null;
        Iterator<Ator> ator = atores.iterator();
        for(Ator i = null; ator.hasNext(); i = ator.next()) {
            if(i.getNome().equals(nome)) {
                a = new Ator(i);
                break;
            }
        }
        return a;
    }
}
