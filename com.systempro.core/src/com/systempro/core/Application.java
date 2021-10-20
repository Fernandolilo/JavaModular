package com.systempro.core;

import com.systempro.util.operacao.Calculadora;

public class Application {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(5,2));

    }
}
