package org.example;

public class Aluno extends Pessoa implements Avaliavel{
    String matricula;

    public Aluno() {
    }
    public Aluno(String cpf, String nome, String matricula) {
        super(cpf, nome);
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void avaliarDesempenho() {

    }
}
