package entities;

import abstracts.AnimalAB;
import interfaces.AnimalCorrerIF;

public class Cachorro extends AnimalAB implements AnimalCorrerIF {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emitiu som.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " correu.");
    }
}