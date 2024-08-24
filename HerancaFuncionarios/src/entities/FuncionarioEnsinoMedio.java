package src.entities;

import src.abstracts.Funcionario;

public class FuncionarioEnsinoMedio extends Funcionario {
    private String escolaMedio;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaMedio) {
        super(nome, codigoFuncional);
        this.escolaMedio = escolaMedio;
    }
    
    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.50;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }
}