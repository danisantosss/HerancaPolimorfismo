package src.abstracts;

public abstract class Funcionario {
    private String nome;
    private int codigoFuncional;
    protected double rendaBasica = 1000.00;
    protected double comissao;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public double calcularRenda() {
        return rendaBasica + comissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
               ", Comissão: R$ " + comissao + 
               ", Salário Total: R$ " + calcularRenda();
    }
}