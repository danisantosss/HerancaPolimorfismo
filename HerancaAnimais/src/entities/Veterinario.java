package entities;

import abstracts.AnimalAB;

public class Veterinario {

    public void examinar(AnimalAB animal){
        animal.emitirSom();
    }
}
