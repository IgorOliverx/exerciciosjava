package org.example;

public class Eletronico extends Produto implements Transportavel{
    private double volume;

    public Eletronico(String nome, double preco, double volume){
        super(preco, nome);
        this.volume = volume;
    }
    @Override
    public double calcularPeso() {
        double peso = volume*150;
        return peso;
    }

    @Override
    public double calcularFrete() {
        return 0;
    }
}
