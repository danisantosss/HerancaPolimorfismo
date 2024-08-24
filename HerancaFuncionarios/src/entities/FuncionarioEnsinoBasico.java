package src.entities;

import src.abstracts.Funcionario;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasico;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
    }

    @Override
    public double calcularRenda() {
        return rendaBasica * 1.10;
    }

    public String getEscolaBasico() {
        return escolaBasico;
    }
}