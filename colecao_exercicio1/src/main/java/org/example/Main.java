package org.example;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Venda vendas = new Venda();
        String operacao;
        do {
            operacao = JOptionPane.showInputDialog(
                    """
                            ----Gerenciamento de vendas----
                            1 - Cadastrar venda
                            2 - Listar produtos de um CPF
                            3 - Listar produtos de um CPF com valor mínimo
                            4 - Sair
                            """
            );
            switch (operacao) {
                case "1":
                    String cpf = JOptionPane.showInputDialog("Digite o CPF");
                    String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto");
                    double precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
                    Produto produto = new Produto(nomeProduto, precoProduto);
                    vendas.cadastroVenda(cpf, produto);
                    JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso");
                    break;
                case "2":
                    String cpfCliente = JOptionPane.showInputDialog("Digite o CPF");
                    System.out.println(vendas.listarProdutos(cpfCliente));
                    break;
                case "3":
                    String cpfClienteFiltro = JOptionPane.showInputDialog("Digite o CPF");
                    double valorMinimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor mínimo"));
                    try {
                        System.out.println(vendas.listarProdutosFiltros(cpfClienteFiltro, valorMinimo));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;
                case "4":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        } while (!operacao.equals("4"));
    }
}