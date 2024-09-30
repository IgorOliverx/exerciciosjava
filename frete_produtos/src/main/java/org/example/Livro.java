package org.example;

public class Livro extends Produto implements Transportavel{

    @Override
    public double calcularPeso() {
        return 0;
    }

    @Override
    public double calcularFrete() {
        return 2;
    }
}
