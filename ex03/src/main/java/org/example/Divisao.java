package org.example;

public class Divisao extends Operacao{

    @Override
    public double calcular(double a, double b) throws Exception {
        if(b == 0){
            throw new ArithmeticException("Não é possível dividir nenhum número por zero");
        }
        return a/b;
    }
}
