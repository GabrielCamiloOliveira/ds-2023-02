package com.example.expressao;

public class Constante implements Expressao {

    @Override
    public float valor() {
        return valor;
    }

    private float valor;

    public Constante(float valor) {
        this.valor = valor;
    }
    
}
