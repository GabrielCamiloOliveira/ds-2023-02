package com.example.expressao;

class Soma implements Expressao {

     @Override
    public float valor() {
        return expressao1.valor() + expressao2.valor();
    }
    
    private Expressao expressao1;
    private Expressao expressao2;

    public Soma(Expressao expressao1, Expressao expressao2) {
        this.expressao1 = expressao1;
        this.expressao2 = expressao2;
    }

}