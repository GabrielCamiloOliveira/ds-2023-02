package com.example.expressao;

public class ExpressaoApplication {

	public static void main(String[] args) {
		
		Expressao expressao = new Soma(new Constante(5), new Multiplica(new Constante(2), new Constante(3)));
		System.out.println(expressao.valor());
	}

}
