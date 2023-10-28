package com.example.anotacao;

public class AnotacaoApplication {

    public static void main(String[] args) {
        
        Observable carroObservable = new Observable("carro");
        Observable aviaoObservable = new Observable("aviao");

        carroObservable.addObserver(message -> System.out.println("Mensagem recebida (Carro): " + message));
        aviaoObservable.addObserver(message -> System.out.println("Mensagem Recebida (Avião): " + message));

        carroObservable.notificarObservers("carro em movimento.");
        aviaoObservable.notificarObservers("avião em movimento.");
    }
}
