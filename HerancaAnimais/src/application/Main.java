package application;

import java.util.ArrayList;
import java.util.List;

import abstracts.AnimalAB;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;
import entities.Veterinario;
import entities.Zoologico;
import interfaces.AnimalCorrerIF;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bolt", 5);
        Cavalo cavalo = new Cavalo("Estrela", 10);
        Preguica preguica = new Preguica("Sid", 3);

        List<AnimalAB> listaAnimais = new ArrayList<>();
        listaAnimais.add(cachorro);
        listaAnimais.add(cavalo);
        listaAnimais.add(preguica);

        for (AnimalAB animal : listaAnimais) {
            animal.emitirSom();
        }

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        Cachorro cachorro2 = new Cachorro("Rex", 5);
        Cavalo cavalo2 = new Cavalo("Callus", 10);
        Preguica preguica2 = new Preguica("Preguiçoso", 3);
        Cachorro cachorro3 = new Cachorro("Thor", 5);
        Cavalo cavalo3 = new Cavalo("Shimmer", 10);
        Preguica preguica3 = new Preguica("Soninho", 3);
        Cachorro cachorro4 = new Cachorro("Irineu", 5);

        Zoologico zoologico = new Zoologico();
        zoologico.getJaulas()[0] = cachorro;
        zoologico.getJaulas()[1] = cavalo;
        zoologico.getJaulas()[2] = preguica;
        zoologico.getJaulas()[3] = cachorro2;
        zoologico.getJaulas()[4] = cavalo2;
        zoologico.getJaulas()[5] = preguica2;
        zoologico.getJaulas()[6] = cachorro3;
        zoologico.getJaulas()[7] = cavalo3;
        zoologico.getJaulas()[8] = preguica3;
        zoologico.getJaulas()[9] = cachorro4;

        for (AnimalAB animal : zoologico.getJaulas()) {
            animal.emitirSom();
            if (animal instanceof AnimalCorrerIF) {
                ((AnimalCorrerIF) animal).correr();
            }
        }
    }
}