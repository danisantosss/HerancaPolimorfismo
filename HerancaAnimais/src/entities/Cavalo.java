package entities;

import abstracts.AnimalAB;
import interfaces.AnimalCorrerIF;

public class Cavalo extends AnimalAB implements AnimalCorrerIF {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " emitiu som.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() +  " correu.");
    }
}