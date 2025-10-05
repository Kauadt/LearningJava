package domain;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {

    Set<Integer> conjunto;

    public Conjunto() {
        this.conjunto = new HashSet<>();
    }

    public Conjunto(Set<Integer> conjunto) {
        this.conjunto = new HashSet<>(conjunto);
    }

    public void uniao(Conjunto conjunto) {
        this.conjunto.addAll(conjunto.getConjunto());
    }

    public void diferenca(Conjunto conjunto) {
        this.conjunto.removeAll(conjunto.getConjunto());
    }

    public void interseccao(Conjunto conjunto) {
        this.conjunto.retainAll(conjunto.getConjunto());
    }

    public Set<Integer> getConjunto() {
        return new HashSet<>(this.conjunto);
    }

    @Override
    public String toString() {
        return "{" + conjunto + "}";
    }

}