package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica(5);
        int operacao = 0;

        do {
            System.out.println("\n ----------- Agenda Telefônica -----------");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Buscar Contato");
            System.out.println("4 - Listar Contatos");
            System.out.println("5 - Sair");
            String input = JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Menu", JOptionPane.QUESTION_MESSAGE);
            try {
                operacao = Integer.parseInt(input);
                switch (operacao) {
                    case 1:
                        String nome = JOptionPane.showInputDialog(null, "Nome: ", "Adicionar Contato", JOptionPane.QUESTION_MESSAGE);
                        String telefone = JOptionPane.showInputDialog(null, "Telefone: ", "Adicionar Contato", JOptionPane.QUESTION_MESSAGE);
                        Contato addContato = new Contato(nome, telefone);
                        agenda.adicionarContato(addContato);
                        break;
                    case 2:
                        String telefones = JOptionPane.showInputDialog(null, "Telefone: ", "Adicionar Contato", JOptionPane.QUESTION_MESSAGE);
                        agenda.buscarContato(telefones);
                        break;
                    case 3:
                        // Lógica para buscar contato
                        break;
                    case 4:
                        agenda.listarContatos();
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
            }
        } while (operacao != 5);
    }
}