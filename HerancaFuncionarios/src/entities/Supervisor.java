package src.entities;

import src.abstracts.Funcionario;

public class Supervisor extends Funcionario {
    public Supervisor(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
        this.comissao = 600.00;
    }

    @Override
    public String toString() {
        return "Supervisor - " + super.toString();
    }
}