package com.example.markdown;

class Titulo extends Decorador {

    public Titulo(Markdown markdown) {
        super(markdown);
    }

    public void exibe() {
        System.out.print("# ");
        super.exibe();
    }
}
