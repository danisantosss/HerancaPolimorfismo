package src.application;

import src.abstracts.Funcionario;
import src.entities.FuncionarioEnsinoBasico;
import src.entities.FuncionarioEnsinoMedio;
import src.entities.FuncionarioGraduado;
import src.entities.Gerente;
import src.entities.Supervisor;
import src.entities.Vendedor;

public class Main {
    public static void main(String[] args) {
        double custoTotal = 0.0;
        double custoBasico = 0.0;
        double custoMedio = 0.0;
        double custoSuperior = 0.0;

        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = new FuncionarioEnsinoBasico("Enzo", 1, "Escola A");
        funcionarios[1] = new FuncionarioEnsinoBasico("João", 2, "Escola B");
        funcionarios[2] = new FuncionarioEnsinoBasico("Julia", 3, "Escola C");
        funcionarios[3] = new FuncionarioEnsinoBasico("Ana", 4, "Escola D");
        funcionarios[4] = new FuncionarioEnsinoMedio("Pedro", 5, "Escola E");
        funcionarios[5] = new FuncionarioEnsinoMedio("Lucas", 6, "Escola F");
        funcionarios[6] = new FuncionarioEnsinoMedio("Juliana", 7, "Escola G");
        funcionarios[7] = new FuncionarioEnsinoMedio("Mariana", 8, "Escola H");
        funcionarios[8] = new FuncionarioGraduado("Daniel", 9, "Universidade X");
        funcionarios[9] = new FuncionarioGraduado("Maria", 10, "Universidade Y");

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.calcularRenda();
            custoTotal += renda;

            if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoBasico += renda;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoMedio += renda;
            } else if (funcionario instanceof FuncionarioGraduado) {
                custoSuperior += renda;
            }
        }

        System.out.println("Custo total com salários: R$ " + custoTotal);
        System.out.println("Custo com funcionários de ensino básico: R$ " + custoBasico);
        System.out.println("Custo com funcionários de ensino médio: R$ " + custoMedio);
        System.out.println("Custo com funcionários de nível superior: R$ " + custoSuperior);

        custoTotal = 0.0;
        double custoGerente = 0.0;
        double custoSupervisor = 0.0;
        double custoVendedor = 0.0;

        funcionarios[0] = new Gerente("Tiago", 11);
        funcionarios[1] = new Supervisor("Marcus", 12);
        funcionarios[2] = new Supervisor("Fernanda", 13);
        funcionarios[3] = new Vendedor("Daniel", 14);
        funcionarios[4] = new Vendedor("João", 15);
        funcionarios[5] = new Vendedor("Lucas", 16);
        funcionarios[6] = new Vendedor("Bruno", 17);
        funcionarios[7] = new Vendedor("Enzo", 18);
        funcionarios[8] = new Vendedor("Mateus", 19);
        funcionarios[9] = new Vendedor("Irineu", 20);

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.calcularRenda();
            custoTotal += renda;

            if (funcionario instanceof Gerente) {
                custoGerente += renda;
            } else if (funcionario instanceof Supervisor) {
                custoSupervisor += renda;
            } else if (funcionario instanceof Vendedor) {
                custoVendedor += renda;
            }
        }

        System.out.println("\nCusto total com salários: R$ " + custoTotal);
        System.out.println("Custo com Gerentes: R$ " + custoGerente);
        System.out.println("Custo com Supervisores: R$ " + custoSupervisor);
        System.out.println("Custo com Vendedores: R$ " + custoVendedor);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}