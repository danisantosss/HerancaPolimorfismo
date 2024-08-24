package src.entities;

import src.abstracts.Funcionario;

public class FuncionarioGraduado extends Funcionario {
    private String universidade;

    public FuncionarioGraduado(String nome, int codigoFuncional, String universidade) {
        super(nome, codigoFuncional);
        this.universidade = universidade;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 2.00;
    }

    public String getUniversidade() {
        return universidade;
    }
}