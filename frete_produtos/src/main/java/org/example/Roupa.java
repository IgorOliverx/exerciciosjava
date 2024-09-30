package org.example;

public class Roupa extends Produto implements Transportavel{

    public Roupa(double preco, String nome, double volume) {
        super(preco, nome);
        this.volume = volume;
    }

    private double volume;
    @Override
    public double calcularPeso() {
        peso = volume*10;
        return peso;
    }

    @Override
    public double calcularFrete() {
        return 0;
    }

    public Roupa() {
    }


}
