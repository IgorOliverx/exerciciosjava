package org.example;

public class Contato {
    //atributos
    private String nome;
    private String telefone;

    public Contato(){}

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }


    @Override
    public String toString(){
        return "Nome: " + nome + " - Telefone: " + telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
