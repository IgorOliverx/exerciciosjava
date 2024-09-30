package org.example;

public class Produto {
    private String nome;
    private double preco;

    public Produto(){}
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString(){
        return "Nome: "+ nome + " Preço: " + preco;
    }
}
