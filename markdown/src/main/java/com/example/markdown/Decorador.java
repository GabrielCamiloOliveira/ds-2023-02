package com.example.markdown;

abstract class Decorador implements Markdown{
    
    protected Markdown markdown;

    public Decorador(Markdown markdown) {
        this.markdown = markdown;
    }

    public void exibe() {
        markdown.exibe();
    }
}
