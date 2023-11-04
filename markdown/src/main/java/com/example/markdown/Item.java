package com.example.markdown;

class Item extends Decorador {

    public Item(Markdown markdown) {
        super(markdown);
    }

    public void exibe() {
        System.out.print("*");
        super.exibe();
    }
}
