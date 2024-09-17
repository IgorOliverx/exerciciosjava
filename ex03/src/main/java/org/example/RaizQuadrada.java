package org.example;

public class RaizQuadrada extends Operacao{
    @Override
    public double calcular(double a, double b) throws Exception {
        if(a < 0){
            throw new ArithmeticException("Não é possível calcular a raiz quadrada de um número negativo");
        }
        return Math.sqrt(a);
    }
}
