package com.example.markdown;

class Italico extends Decorador {

    public Italico(Markdown markdown) {
        super(markdown);
    }

    public void exibe() {
        System.out.print("_");
        super.exibe();
        System.out.print("_");
    }
}
