package repositories;

import entities.Diretor;

import java.util.HashSet;
import java.util.Iterator;

public class DiretorRepo {
    private HashSet<Diretor> diretores;

    public DiretorRepo() {
        this.diretores = new HashSet<Diretor>();
    }

    public boolean addDiretor(Diretor diretor) {
        return this.diretores.add(diretor);
    }

    public HashSet<Diretor> getDiretores() {
        return new HashSet<Diretor>(diretores);
    }

    public Diretor getDiretor(String nome) {
        Diretor d = null;
        Iterator<Diretor> iterator = diretores.iterator();
        for (Diretor d = null; iterator.hasNext(); d = iterator.next()) {
            if (d.getNome().equals(nome)) {
                d = new Diretor(d);
                break;
            }
        }
        return d;
    }
}
