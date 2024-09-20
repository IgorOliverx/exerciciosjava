package org.example;

public class Professor extends Pessoa implements Avaliavel{
    private String salario;

    public Professor() {
    }
    public Professor(String cpf, String nome, String salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public void exibirInformacoes() {

    }

    @Override
    public void avaliarDesempenho() {

    }
}
