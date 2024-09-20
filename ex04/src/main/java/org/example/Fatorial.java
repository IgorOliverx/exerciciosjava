package org.example;

import java.util.Scanner;

public class Fatorial {

    public static int calcular(int n) throws ValorInvalido {
        if(n < 0){
            throw new ValorInvalido("Valor inválido: " + n);
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n * calcular(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
                int numero = sc.nextInt();
                long resultado = calcular(numero);
                System.out.println("Fatorial de " + numero + " é " + resultado);
                break;
            } catch (ValorInvalido e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro positivo.");
                sc.next(); // Limpar a entrada inválida
            }
        }
        sc.close();
    }
}
