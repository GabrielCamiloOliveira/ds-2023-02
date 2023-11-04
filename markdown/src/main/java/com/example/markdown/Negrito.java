package com.example.markdown;

class Negrito extends Decorador {

    public Negrito(Markdown markdown) {
        super(markdown);
    }

    public void exibe() {
        System.out.print("**");
        super.exibe();
        System.out.print("**");
    }
}
