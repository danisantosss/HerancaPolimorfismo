package src.entities;

import src.abstracts.Funcionario;

public class Gerente extends Funcionario {
    public Gerente(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
        this.comissao = 1500.00;
    }

    @Override
    public String toString() {
        return "Gerente - " + super.toString();
    }
}