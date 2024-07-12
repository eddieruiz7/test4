package com.persona2Autonoma.persona2.Service;

public class CalculadoraService {
    public int sumar(int a, int b){
        return a + b;
    }

    public int restar(int a, int b){
        return a - b;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    public double dividir(int a, int b){
        if (a == 0 || b == 0){
            throw new ArithmeticException("No se puede dividir por 0!!!");
        }
        return (double) a / b;
    }
}
