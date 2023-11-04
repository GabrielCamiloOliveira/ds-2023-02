package com.example.markdown;

class Concatena implements Markdown {

    private Markdown primeiro, segundo;

    public Concatena(Markdown primeiro, Markdown segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }
    
    public void exibe() {
        primeiro.exibe();
        segundo.exibe();
    }
}
