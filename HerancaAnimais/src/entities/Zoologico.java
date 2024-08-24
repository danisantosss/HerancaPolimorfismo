package entities;

import abstracts.AnimalAB;

public class Zoologico {
    private AnimalAB[] jaulas;

    public Zoologico() {
        jaulas = new AnimalAB[10];
    }

    public AnimalAB[] getJaulas() {
        return jaulas;
    }

    public void setJaulas(AnimalAB[] jaulas) {
        this.jaulas = jaulas;
    }
}
