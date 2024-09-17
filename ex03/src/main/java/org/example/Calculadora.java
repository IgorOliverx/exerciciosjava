package org.example;

import java.util.Scanner;
import org.example.*;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Raiz Quadrada");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            try {
                double a = 0, b = 0;
                Operacao operacao = null;

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o primeiro número: ");
                        a = sc.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        b = sc.nextDouble();
                        operacao = new Soma();
                        break;
                    case 2:
                        System.out.print("Digite o primeiro número: ");
                        a = sc.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        b = sc.nextDouble();
                        operacao = new Subtracao();
                        break;
                    case 3:
                        System.out.print("Digite o primeiro número: ");
                        a = sc.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        b = sc.nextDouble();
                        operacao = new Multiplicacao();
                        break;
                    case 4:
                        System.out.print("Digite o primeiro número: ");
                        a = sc.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        b = sc.nextDouble();
                        operacao = new Divisao();
                        break;
                    case 5:
                        System.out.print("Digite o número: ");
                        a = sc.nextDouble();
                        operacao = new RaizQuadrada();
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

                if (operacao != null) {
                    double resultado = operacao.calcular(a, b);
                    System.out.println("Resultado: " + resultado);
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida.");
                sc.next(); // Limpar a entrada inválida
            }
        } while (opcao != 6);

        sc.close();
    }
}
