package com.example.markdown;

public class MarkdownApplication {

	public static void main(String[] args) {
		Markdown texto = new Texto("Linha de exemplo com: ");
        Markdown negrito = new Negrito(new Texto("negrito"));
        Markdown italico = new Italico(new Texto("itálico"));
        Markdown item = new Item(new Italico(new Texto("Primeiro item em itálico.")));
        Markdown titulo = new Titulo(new Texto("Título \n"));

        Markdown resultado = new Concatena(titulo, new Concatena(texto, new Concatena(negrito, new Concatena(new Texto(" e "), new Concatena(italico, new Concatena(new Texto(".\n"), item))))));

        resultado.exibe();
	}

}
