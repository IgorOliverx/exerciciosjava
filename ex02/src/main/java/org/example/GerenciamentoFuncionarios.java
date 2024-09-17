package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoFuncionarios {
    private ArrayList<Funcionario> funcionarios;


    public GerenciamentoFuncionarios(){
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(String nome, int idade, double salario){
        Funcionario funcionario = new Funcionario(nome, idade, salario);
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }
    public void removerFuncionario(String nome) {
        try {
            boolean removido = false;
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getNome().equalsIgnoreCase(nome)) {
                    funcionarios.remove(funcionario);
                    System.out.println("Funcionário removido com sucesso.");
                    removido = true;
                    break;
                }
            }
            if (!removido) {
                System.out.println("Funcionário não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao remover funcionário: " + e.getMessage());
        }
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
    }

    public void calcularMediaSalarial() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        double somaSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            somaSalarios += funcionario.getSalario();
        }
        double mediaSalarial = somaSalarios / funcionarios.size();
        System.out.printf("Média salarial: %.2f\n", mediaSalarial);
    }

    public static void main(String[] args) {
        GerenciamentoFuncionarios gerenciamento = new GerenciamentoFuncionarios();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Calcular Média Salarial");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do funcionário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade do funcionário: ");
                    int idade = scanner.nextInt();
                    System.out.print("Digite o salário do funcionário: ");
                    double salario = scanner.nextDouble();
                    gerenciamento.adicionarFuncionario(nome, idade, salario);
                    break;
                case 2:
                    System.out.print("Digite o nome do funcionário a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    gerenciamento.removerFuncionario(nomeRemover);
                    break;
                case 3:
                    gerenciamento.listarFuncionarios();
                    break;
                case 4:
                    gerenciamento.calcularMediaSalarial();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
