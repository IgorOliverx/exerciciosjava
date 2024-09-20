package org.example;

import java.util.Scanner;

public class SistemaAprovacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;
        boolean notasAcimaDeNove = true;


        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota da disciplina " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
            if (notas[i] < 9) {
                notasAcimaDeNove = false;
            }
        }
        double media = soma / notas.length;

        if (notasAcimaDeNove) {
            media *= 1.10;
            if(media > 10.00){
                media = 10.00;
            }
        }

        // Determina o status do aluno
        String status;
        if (media >= 7) {
            status = "Aprovado";
        } else if (media >= 5) {
            status = "Recuperação";
        } else {
            status = "Reprovado";
        }

        // Exibe a média e o status do aluno
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Status: " + status);
    }
}