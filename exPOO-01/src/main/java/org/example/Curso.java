package org.example;

public class Curso {
    String[] alunos = new String[5];
    String[] professores = new String[5];

    public void adicionarAluno(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno.nome;
                break;
            }
        }
    }

}
