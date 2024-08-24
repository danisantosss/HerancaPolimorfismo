package entities;

import abstracts.AnimalAB;
import interfaces.AnimalSubirIF;

public class Preguica extends AnimalAB implements AnimalSubirIF {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emitiu som.");
    }

    @Override
    public void subir() {
        System.out.println(getNome() + " subiu em árvore.");
    }
}